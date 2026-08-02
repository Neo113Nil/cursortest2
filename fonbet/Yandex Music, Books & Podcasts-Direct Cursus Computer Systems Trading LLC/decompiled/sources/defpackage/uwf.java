package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.gms.common.api.Status;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.dto.ActionButtonDto;
import com.yandex.music.shared.dto.UserDto;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.music.shared.dto.playlist.ChartDto;
import com.yandex.music.shared.dto.playlist.CoverInfoDto;
import com.yandex.music.shared.dto.playlist.MadeForDto;
import com.yandex.music.shared.dto.playlist.PersonalPlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.UserCaseFormsDto;
import com.yandex.music.shared.dto.playlist.WrappedTrackDto;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.trailer.TrailerDto;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import ru.yandex.music.R;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.data.exception.network.c;
import ru.yandex.video.m3.data.exception.network.d;

/* loaded from: classes.dex */
public abstract class uwf {
    public static final t9f A(uhp uhpVar, Type type, boolean z) {
        ArrayList<t9f> arrayList;
        t9f A;
        t9f A2;
        f9f f9fVar;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) xz0.y(upperBounds);
            }
            genericComponentType.getClass();
            if (z) {
                A2 = swf.h0(uhpVar, genericComponentType);
            } else {
                uhpVar.getClass();
                A2 = A(uhpVar, genericComponentType, false);
                if (A2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                f9fVar = ern.a((Class) rawType);
            } else {
                if (!(genericComponentType instanceof f9f)) {
                    b6e.w(ern.a(genericComponentType.getClass()), "unsupported type in GenericArray: ");
                    return null;
                }
                f9fVar = (f9f) genericComponentType;
            }
            f9fVar.getClass();
            return new arn(f9fVar, A2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return z(uhpVar, cls, c5b.a);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z) {
                A = swf.h0(uhpVar, componentType);
            } else {
                uhpVar.getClass();
                A = A(uhpVar, componentType, false);
                if (A == null) {
                    return null;
                }
            }
            return new arn(ern.a(componentType), A);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                sb.append(type);
                wvs.l(sb, " has type ", ern.a(type.getClass()));
                return null;
            }
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            upperBounds2.getClass();
            Object y = xz0.y(upperBounds2);
            y.getClass();
            return A(uhpVar, (Type) y, true);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                type2.getClass();
                arrayList.add(swf.h0(uhpVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                uhpVar.getClass();
                t9f A3 = A(uhpVar, type3, false);
                if (A3 == null) {
                    return null;
                }
                arrayList.add(A3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            t9f t9fVar = (t9f) arrayList.get(0);
            t9fVar.getClass();
            return new qy0(t9fVar, 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            t9f t9fVar2 = (t9f) arrayList.get(0);
            t9fVar2.getClass();
            return new qy0(t9fVar2, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return ff7.o((t9f) arrayList.get(0), (t9f) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            t9f t9fVar3 = (t9f) arrayList.get(0);
            t9f t9fVar4 = (t9f) arrayList.get(1);
            t9fVar3.getClass();
            t9fVar4.getClass();
            return new n9h(t9fVar3, t9fVar4, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            t9f t9fVar5 = (t9f) arrayList.get(0);
            t9f t9fVar6 = (t9f) arrayList.get(1);
            t9fVar5.getClass();
            t9fVar6.getClass();
            return new n9h(t9fVar5, t9fVar6, 1);
        }
        if (vat.class.isAssignableFrom(cls2)) {
            t9f t9fVar7 = (t9f) arrayList.get(0);
            t9f t9fVar8 = (t9f) arrayList.get(1);
            t9f t9fVar9 = (t9f) arrayList.get(2);
            t9fVar7.getClass();
            t9fVar8.getClass();
            t9fVar9.getClass();
            return new zf6(t9fVar7, t9fVar8, t9fVar9);
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (t9f t9fVar10 : arrayList) {
            t9fVar10.getClass();
            arrayList2.add(t9fVar10);
        }
        return z(uhpVar, cls2, arrayList2);
    }

    public static void B(Status status, Object obj, i8s i8sVar) {
        if (status.d()) {
            i8sVar.b(obj);
        } else {
            i8sVar.a(n7w.K(status));
        }
    }

    public static final Rect C(aqe aqeVar) {
        return new Rect(aqeVar.a, aqeVar.b, aqeVar.c, aqeVar.d);
    }

    public static final Rect D(ynn ynnVar) {
        return new Rect((int) ynnVar.a, (int) ynnVar.b, (int) ynnVar.c, (int) ynnVar.d);
    }

    public static final RectF E(ynn ynnVar) {
        return new RectF(ynnVar.a, ynnVar.b, ynnVar.c, ynnVar.d);
    }

    public static final ynn F(Rect rect) {
        return new ynn(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final ynn G(RectF rectF) {
        return new ynn(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final zul H(PlaylistHeaderDto playlistHeaderDto) {
        ?? r3;
        TrackDto track;
        playlistHeaderDto.getClass();
        cvl I = I(playlistHeaderDto);
        List tracks = playlistHeaderDto.getTracks();
        if (tracks == null) {
            tracks = c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = tracks.iterator();
        while (true) {
            r4 = null;
            mqs mqsVar = null;
            if (!it.hasNext()) {
                break;
            }
            WrappedTrackDto wrappedTrackDto = (WrappedTrackDto) it.next();
            if (wrappedTrackDto != null && (track = wrappedTrackDto.getTrack()) != null) {
                mqsVar = wts.a(track);
            }
            if (mqsVar != null) {
                arrayList.add(mqsVar);
            }
        }
        List<PlaylistHeaderDto> similarPlaylist = playlistHeaderDto.getSimilarPlaylist();
        if (similarPlaylist != null) {
            r3 = new ArrayList();
            for (PlaylistHeaderDto playlistHeaderDto2 : similarPlaylist) {
                cvl I2 = playlistHeaderDto2 != null ? I(playlistHeaderDto2) : null;
                if (I2 != null) {
                    r3.add(I2);
                }
            }
        } else {
            r3 = c5b.a;
        }
        ActionButtonDto actionInfo = playlistHeaderDto.getActionInfo();
        ff I0 = actionInfo != null ? zsd.I0(actionInfo) : null;
        VibeButtonDto vibeButtonInfo = playlistHeaderDto.getVibeButtonInfo();
        return new zul(I, arrayList, r3, vibeButtonInfo != null ? u1g.S(vibeButtonInfo) : null, I0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        if (r1 == null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cvl I(o8 o8Var) {
        drt drtVar;
        u4h u4hVar;
        Boolean available;
        u4h u4hVar2;
        drt drtVar2;
        o8Var.getClass();
        lf1 lf1Var = null;
        if (!(o8Var instanceof ChartDto) && !(o8Var instanceof PersonalPlaylistHeaderDto)) {
            if (!(o8Var instanceof PlaylistHeaderDto)) {
                b6e.s();
                return null;
            }
            PlaylistHeaderDto playlistHeaderDto = (PlaylistHeaderDto) o8Var;
            if (playlistHeaderDto.getAbsense() != null) {
                String kind = playlistHeaderDto.getAbsense().getKind();
                if (kind == null) {
                    kind = "-1";
                }
                return new cvl(kind, "unknown", drt.f, 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720);
            }
        }
        UserDto owner = o8Var.getOwner();
        if (owner != null) {
            cuk cukVar = drt.e;
            String login = owner.getLogin();
            if (login != null) {
                String username = owner.getUsername();
                String uid = owner.getUid();
                if (uid != null) {
                    drtVar = cuk.B(uid, login, username);
                }
            }
            drtVar = null;
        }
        String uid2 = o8Var.getUid();
        if (uid2 != null) {
            cuk cukVar2 = drt.e;
            drtVar = cuk.B(uid2, "", "");
        } else {
            drtVar = drt.f;
        }
        drt drtVar3 = drtVar;
        String kind2 = o8Var.getKind();
        if (kind2 == null) {
            kind2 = "FAKE_ID_" + System.currentTimeMillis() + UUID.randomUUID();
        }
        String str = kind2;
        String title = o8Var.getTitle();
        String str2 = title == null ? "" : title;
        String playlistUuid = o8Var.getPlaylistUuid();
        Integer snapshot = o8Var.getSnapshot();
        int intValue = snapshot != null ? snapshot.intValue() : -1;
        Integer revision = o8Var.getRevision();
        int intValue2 = revision != null ? revision.intValue() : -1;
        Boolean available2 = o8Var.getAvailable();
        boolean booleanValue = available2 != null ? available2.booleanValue() : true;
        Integer trackCount = o8Var.getTrackCount();
        int intValue3 = trackCount != null ? trackCount.intValue() : -1;
        Integer likesCount = o8Var.getLikesCount();
        int intValue4 = likesCount != null ? likesCount.intValue() : -1;
        qc7 created = o8Var.getCreated();
        Date date = created != null ? created.b : null;
        qc7 modified = o8Var.getModified();
        Date date2 = modified != null ? modified.b : null;
        CoverInfoDto cover = o8Var.getCover();
        tn6 L = cover != null ? ltg.L(cover) : null;
        String descriptionFormatted = o8Var.getDescriptionFormatted();
        if (descriptionFormatted != null) {
            if (descriptionFormatted.length() <= 0) {
                descriptionFormatted = null;
            }
        }
        descriptionFormatted = o8Var.getDescription();
        String str3 = descriptionFormatted;
        String visibility = o8Var.getVisibility();
        if (visibility == null) {
            visibility = "private";
        }
        String str4 = visibility;
        int a = vz1.a(o8Var.getAutoPlaylistType());
        String backgroundImageUrl = o8Var.getBackgroundImageUrl();
        String backgroundVideoUrl = o8Var.getBackgroundVideoUrl();
        MadeForDto madeFor = o8Var.getMadeFor();
        if (madeFor != null) {
            UserDto userInfo = madeFor.getUserInfo();
            if (userInfo != null) {
                String login2 = userInfo.getLogin();
                if (login2 != null) {
                    String username2 = userInfo.getUsername();
                    String uid3 = userInfo.getUid();
                    if (uid3 != null) {
                        drtVar2 = cuk.B(uid3, login2, username2);
                        if (drtVar2 != null) {
                            UserCaseFormsDto caseForms = madeFor.getCaseForms();
                            u4hVar2 = new u4h(drtVar2, caseForms != null ? new r54(caseForms.getNominative(), caseForms.getGenitive(), caseForms.getDative(), caseForms.getAccusative(), caseForms.getInstrumental(), caseForms.getPrepositional()) : null);
                            u4hVar = u4hVar2;
                        }
                    }
                }
                drtVar2 = null;
                if (drtVar2 != null) {
                }
            }
            u4hVar2 = null;
            u4hVar = u4hVar2;
        } else {
            u4hVar = null;
        }
        Boolean childContent = o8Var.getChildContent();
        boolean z = false;
        boolean booleanValue2 = childContent != null ? childContent.booleanValue() : false;
        TrailerDto trailer = o8Var.getTrailer();
        if (trailer != null && (available = trailer.getAvailable()) != null) {
            z = available.booleanValue();
        }
        boolean z2 = z;
        String artistPlaylistType = o8Var.getArtistPlaylistType();
        if (artistPlaylistType != null) {
            lf1.b.getClass();
            Iterator it = lf1.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str5 = ((lf1) next).a;
                String upperCase = artistPlaylistType.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                if (str5.equals(upperCase)) {
                    lf1Var = next;
                    break;
                }
            }
            lf1Var = lf1Var;
        }
        return new cvl(str, str2, drtVar3, intValue, intValue2, booleanValue, intValue3, intValue4, 0, 0L, 0L, null, -1L, date, date2, L, str3, str4, a, backgroundImageUrl, backgroundVideoUrl, u4hVar, booleanValue2, playlistUuid, z2, lf1Var, o8Var.getPersonalColor(), 3840);
    }

    public static final oj6 J(zhi zhiVar) {
        zhiVar.getClass();
        Throwable th = zhiVar.b;
        if (!(th instanceof IllegalRequestOnNetworkModeException)) {
            return new oj6(btf.b(new b6n(23, zhiVar)));
        }
        IllegalRequestOnNetworkModeException illegalRequestOnNetworkModeException = (IllegalRequestOnNetworkModeException) th;
        return new oj6(illegalRequestOnNetworkModeException.a, illegalRequestOnNetworkModeException.b);
    }

    public static void K(ei3 ei3Var, byte[] bArr) {
        long j;
        ei3Var.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = ei3Var.e;
            int i2 = ei3Var.f;
            int i3 = ei3Var.g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = ei3Var.d;
            hi3 hi3Var = ei3Var.a;
            hi3Var.getClass();
            if (j2 == hi3Var.b) {
                xq0.q("no more bytes");
                return;
            }
            j = ei3Var.d;
        } while (ei3Var.b(j == -1 ? 0L : j + (ei3Var.g - ei3Var.f)) != -1);
    }

    public static final a0 L(a0 a0Var, hgp hgpVar) {
        a0Var.getClass();
        a0 w = hag.w(a0Var, 200);
        if (!((Boolean) ((dfw) hgpVar.g).invoke()).booleanValue() || u7g.Q(w, mil.a)) {
            return w;
        }
        a0 K = u7g.K(w);
        if (K != null) {
            return u7g.G(u7g.H(u7g.L(K)));
        }
        return null;
    }

    public static final void M(joj jojVar) {
        try {
            TrustManager[] trustManagerArr = {new qs1(1)};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            TrustManager trustManager = trustManagerArr[0];
            trustManager.getClass();
            jojVar.f(socketFactory, (X509TrustManager) trustManager);
            soj sojVar = new soj();
            if (!sojVar.equals(jojVar.t)) {
                jojVar.B = null;
            }
            jojVar.t = sojVar;
        } catch (Exception unused) {
        }
    }

    public static final a0 N(a0 a0Var, boolean z) {
        a0Var.getClass();
        pnl o = a0.o(a0Var);
        o.getClass();
        c0 k = a0Var.k();
        k.getClass();
        qrl r = c0.r(k);
        r.getClass();
        r.i(!z);
        o.j((c0) r.b());
        return (a0) o.b();
    }

    public static final d a(Function1 function1) {
        c cVar = new c();
        NetworkRequestException.ResourceType resourceType = NetworkRequestException.ResourceType.UNKNOWN;
        cVar.d = resourceType;
        function1.invoke(cVar);
        if (cVar.d == resourceType) {
            String str = cVar.b;
            if (str != null) {
                int Q = dvt.Q(Uri.parse(str));
                if (Q == 0 || Q == 2) {
                    resourceType = NetworkRequestException.ResourceType.MANIFEST;
                } else if (Q == 4) {
                    resourceType = NetworkRequestException.ResourceType.SEGMENT;
                }
            }
            cVar.d = resourceType;
        }
        return new d(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g);
    }

    public static final void b(vm7 vm7Var, boolean z, Function0 function0, Function0 function02, boolean z2, yci yciVar, Function0 function03, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ges j;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1618253618);
        int i2 = i | (oq5Var2.f(vm7Var) ? 4 : 2) | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.h(function02) ? 2048 : 1024) | (oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function03) ? 1048576 : 524288);
        if (oq5Var2.P(i2 & 1, (599187 & i2) != 599186)) {
            jd1 jd1Var = (jd1) vm7Var.c;
            if (z) {
                oq5Var2.Z(363578370);
                j = nu0.g();
            } else {
                oq5Var2.Z(363579678);
                j = nu0.j();
            }
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            jf0.c(function0, jd1Var, j, nu0.i(), ksw.D(androidx.compose.foundation.layout.d.d(yciVar, 1.0f), rvf.M(R.string.artist, oq5Var2), null), ild.C(-74850180, new s43(vm7Var, function03, function02, z2, 18), oq5Var2), e9g.a, null, oq5Var, ((i2 >> 6) & 14) | 1769472, 128);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hr6(vm7Var, z, function0, function02, z2, yciVar, function03, i);
        }
    }

    public static final void c(k4k k4kVar, lvf lvfVar, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, hq5 hq5Var, int i) {
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1346663703);
        int i2 = i | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128) | (oq5Var.h(dibVar) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function03) ? 1048576 : 524288) | (oq5Var.h(function1) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.h(function12) ? 67108864 : 33554432);
        int i3 = 1;
        if (oq5Var.P(i2 & 1, (i2 & 38347923) != 38347922)) {
            ogp.g.e(k4kVar.c, k4kVar.b != null, null, oq5Var, 4096, 4);
            String M = rvf.M(R.string.all_artists, oq5Var);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            yci a = a.a(vci.a, "similar_artist_screen");
            Object K = oq5Var.K();
            int i4 = 21;
            if (K == gq5.a) {
                K = new h2q(i4);
                oq5Var.k0(K);
            }
            wn5 C2 = ild.C(1178438690, new h11(function1, function12, i3), oq5Var);
            int i5 = lvf.f;
            int i6 = i2 << 3;
            int i7 = (i2 & 14) | 1576000 | (i2 & 112) | (i6 & 57344) | (i6 & 458752);
            int i8 = i2 << 6;
            ezf.g(k4kVar, lvfVar, M, dibVar, function0, (Function0) K, function02, function03, tmbVar, a, C, C2, oq5Var, i7 | (i8 & 29360128) | (i8 & 234881024) | 1073741824 | ((i2 << 21) & 1879048192), 390);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fv(k4kVar, lvfVar, tmbVar, dibVar, function0, function02, function03, function1, function12, i);
        }
    }

    public static final void d(final hyq hyqVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        vci vciVar;
        boolean z2;
        yci yciVar2;
        hyqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2135338701);
        if (((i | (oq5Var.h(hyqVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            iz2 iz2Var = b2c.f;
            vci vciVar2 = vci.a;
            float f = 16;
            yci p = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.c(vciVar2, 1.0f), f, 10, f, 4);
            final int i2 = 0;
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            final Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            lx0 lx0Var = qx0.e;
            boolean h = oq5Var.h(hyqVar) | oq5Var.h(context);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new Function0() { // from class: jyq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i4 = i2;
                        Context context2 = context;
                        hyq hyqVar2 = hyqVar;
                        switch (i4) {
                            case 0:
                                hyqVar2.getClass();
                                context2.getClass();
                                Intent j = jo0.j(context2);
                                if (j != null) {
                                    if (j.resolveActivity(context2.getPackageManager()) != null) {
                                        try {
                                            context2.startActivity(j);
                                        } catch (ActivityNotFoundException unused) {
                                        }
                                    }
                                    String string = context2.getString(R.string.error_unknown);
                                    string.getClass();
                                    y5g.o0(context2, string);
                                }
                                hyqVar2.a(context2);
                                break;
                            default:
                                hyqVar2.a(context2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(vciVar2, false, null, null, (Function0) K, 7);
            nho a = lho.a(lx0Var, b2c.k, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            mn0 m = o8g.m(f8g.Y(R.string.informer_disable_background_restrictions_text, oq5Var), 0L, oq5Var, 0, 1);
            ges b = ges.b(nu0.i(), 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(17, e6g.b), 0, 0, 15728639);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xv7.i(m, new LayoutWeightElement(true, 1.0f).f(new VerticalAlignElement(b2c.l)), j, 0L, 0L, 3, 0L, 2, false, 2, 0, null, null, b, null, null, oq5Var, 0, 3120, 907000);
            oq5Var = oq5Var;
            if (z) {
                oq5Var.Z(1173045877);
                w4k E = a0g.E(R.drawable.ic_close_mid_24, 0, oq5Var);
                vciVar = vciVar2;
                yci m2 = androidx.compose.foundation.layout.d.m(vciVar, ff7.P(v7g.z(20), oq5Var));
                boolean h2 = oq5Var.h(hyqVar) | oq5Var.h(context);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    z2 = true;
                    final char c = 1 == true ? 1 : 0;
                    K2 = new Function0() { // from class: jyq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i42 = c;
                            Context context2 = context;
                            hyq hyqVar2 = hyqVar;
                            switch (i42) {
                                case 0:
                                    hyqVar2.getClass();
                                    context2.getClass();
                                    Intent j2 = jo0.j(context2);
                                    if (j2 != null) {
                                        if (j2.resolveActivity(context2.getPackageManager()) != null) {
                                            try {
                                                context2.startActivity(j2);
                                            } catch (ActivityNotFoundException unused) {
                                            }
                                        }
                                        String string = context2.getString(R.string.error_unknown);
                                        string.getClass();
                                        y5g.o0(context2, string);
                                    }
                                    hyqVar2.a(context2);
                                    break;
                                default:
                                    hyqVar2.a(context2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                } else {
                    z2 = true;
                }
                gae.b(E, rvf.M(R.string.close_content_description, oq5Var), androidx.compose.foundation.a.e(m2, false, null, null, (Function0) K2, 7), ((dq0) oq5Var.j(agrVar)).a.e, oq5Var, 0, 0);
                oq5Var = oq5Var;
            } else {
                vciVar = vciVar2;
                z2 = true;
                oq5Var.Z(1170120965);
            }
            oq5Var.p(false);
            oq5Var.p(z2);
            oq5Var.p(z2);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(hyqVar, z, yciVar2, i, 19);
        }
    }

    public static final void e(eii eiiVar, ltu ltuVar, wn5 wn5Var, ab0 ab0Var, hq5 hq5Var, int i) {
        eii eiiVar2;
        ltu ltuVar2;
        wn5 wn5Var2;
        eiiVar.getClass();
        ltuVar.getClass();
        ab0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(251027334);
        if (((i | (oq5Var.h(eiiVar) ? 4 : 2) | (oq5Var.f(ltuVar) ? 32 : 16) | (oq5Var.h(ab0Var) ? 2048 : 1024)) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
            eiiVar2 = eiiVar;
            ltuVar2 = ltuVar;
        } else {
            eiiVar2 = eiiVar;
            ltuVar2 = ltuVar;
            wn5Var2 = wn5Var;
            etn.l(x3v.a.a(new w3v(new fkv(ges.b(nu0.j(), 0L, v7g.z(12), null, null, 0L, 0, v7g.D(1, 8589934592L), null, null, 0, 0, 16646141), ges.b(nu0.j(), 0L, v7g.z(15), null, null, 0L, 0, v7g.D((float) 1.1d, 8589934592L), null, null, 0, 0, 16646141)), new t8n(nu0.d(), nu0.d(), ((dq0) oq5Var.j(eq0.a)).c.c))), ild.C(1239761990, new wtu(ltuVar2, ab0Var, wn5Var2, eiiVar2), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wtu(eiiVar2, ltuVar2, wn5Var2, ab0Var, i);
        }
    }

    public static final void f(l1w l1wVar, hq5 hq5Var, int i) {
        l1wVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(471906587);
        if ((((oq5Var.h(l1wVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            wxf.c(ild.C(-402379593, new u0v(18, l1wVar, ((fs5) K).a), oq5Var), oq5Var, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r0w(l1wVar, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Call call, Continuation continuation) {
        wao waoVar;
        int i;
        bii biiVar;
        if (continuation instanceof wao) {
            waoVar = (wao) continuation;
            int i2 = waoVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                waoVar.k = i2 - Integer.MIN_VALUE;
                Object obj = waoVar.j;
                nm6 nm6Var = nm6.a;
                i = waoVar.k;
                if (i != 0) {
                    qgg.h0(obj);
                    waoVar.k = 1;
                    obj = swf.N(call, waoVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    Object obj2 = ((aii) biiVar).a;
                    return obj2 == null ? new nj6(null) : new qj6(obj2);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        waoVar = new wao(continuation);
        Object obj3 = waoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = waoVar.k;
        if (i != 0) {
        }
        biiVar = (bii) obj3;
        if (!(biiVar instanceof aii)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(Call call, Continuation continuation) {
        xao xaoVar;
        int i;
        bii biiVar;
        if (continuation instanceof xao) {
            xaoVar = (xao) continuation;
            int i2 = xaoVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xaoVar.k = i2 - Integer.MIN_VALUE;
                Object obj = xaoVar.j;
                nm6 nm6Var = nm6.a;
                i = xaoVar.k;
                if (i != 0) {
                    qgg.h0(obj);
                    xaoVar.k = 1;
                    obj = swf.N(call, xaoVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    return new qj6(Unit.a);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        xaoVar = new xao(continuation);
        Object obj2 = xaoVar.j;
        nm6 nm6Var2 = nm6.a;
        i = xaoVar.k;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }

    public static final float i(hq5 hq5Var) {
        float v = ild.v(hq5Var);
        WeakHashMap weakHashMap = rqv.w;
        eoe n = p6g.n(z7l.h(hq5Var).f, hq5Var);
        return n.a() + n.d() + v;
    }

    public static Parcelable j(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcelable parcelable2 = (Parcelable) w(parcelable);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable2.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) w((Parcelable) creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static final long k(o3k o3kVar) {
        return eeh.c(o3kVar.k() * o3kVar.p()) + (o3kVar.j() * o3kVar.p());
    }

    public static void l(String str) {
        str.getClass();
        if (((f7w) sqg.a.get("default")) != null) {
            f7w.a("generic_error", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:6:0x0011->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.yandex.media.ynison.service.a m(e0 e0Var, String str) {
        rse m;
        String str2;
        e0Var.getClass();
        Object obj = null;
        if (str == null || (m = e0Var.m()) == null) {
            return null;
        }
        Iterator<E> it = m.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.yandex.media.ynison.service.a aVar = (com.yandex.media.ynison.service.a) next;
            if (aVar != null) {
                com.yandex.media.ynison.service.c k = aVar.n() ? aVar.k() : null;
                if (k != null) {
                    str2 = k.m();
                    if (!Intrinsics.d(str2, str)) {
                        obj = next;
                        break;
                    }
                }
            }
            str2 = null;
            if (!Intrinsics.d(str2, str)) {
            }
        }
        return (com.yandex.media.ynison.service.a) obj;
    }

    public static y7o n(String str, String str2) {
        boolean A = ixf.A(str);
        boolean A2 = ixf.A(str2);
        if (A && A2) {
            return ngg.F(null);
        }
        if (A && !A2) {
            k03 k03Var = new k03("Mobile backend invalid authorization error: \"Oauth\" field is missing. Please, make sure that both \"Oauth\" & \"Uid\" values are provided.", 4);
            LinkedHashMap linkedHashMap = sqg.a;
            l(k03Var.a);
            return new y7o(null, k03Var);
        }
        if (A || !A2) {
            str.getClass();
            str2.getClass();
            return ngg.F(new n9i(str, str2));
        }
        k03 k03Var2 = new k03("Mobile backend invalid authorization error: \"Uid\" field is missing. Please, make sure that both \"Oauth\" & \"Uid\" values are provided.", 4);
        LinkedHashMap linkedHashMap2 = sqg.a;
        l(k03Var2.a);
        return new y7o(null, k03Var2);
    }

    public static final rpj o(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            rpj rpjVar = tag instanceof rpj ? (rpj) tag : null;
            if (rpjVar != null) {
                return rpjVar;
            }
            Object B = rvf.B(view);
            view = B instanceof View ? (View) B : null;
        }
        return null;
    }

    public static final String p(e0 e0Var) {
        e0Var.getClass();
        dlr j = e0Var.q() ? e0Var.j() : null;
        if (j != null) {
            return j.g();
        }
        return null;
    }

    public static final List q() {
        sgs sgsVar = new sgs(qo6.e, "url");
        sgs sgsVar2 = new sgs(qo6.d, "url");
        return u75.h(new zgs(R.drawable.ic_download_24, "Downloads", "134 milliseconds", u75.h("James Blake", "Foals", "ooes"), u75.h(sgsVar2, sgsVar, sgsVar)), new zgs(R.drawable.ic_playlist_24, "Playlists", null, t75.c("Побежали супер длинное название которое никуда не влезает"), t75.c(sgsVar)), new zgs(R.drawable.ic_artist_24, "Artists", null, u75.h("Sam Smith", "Kasabian", "SALUKI"), u75.h(sgsVar2, sgsVar2, sgsVar2)), new zgs(R.drawable.ic_kid_24, "Kids", null, u75.h("Зубочистки", "Фикситека", "Че-то ещё не влезет"), u75.h(sgsVar, sgsVar, sgsVar)), new zgs(R.drawable.ic_album_24, "Albums", null, u75.h("Unholy", "Frozen", "Satisfy"), u75.h(sgsVar, sgsVar, sgsVar)));
    }

    public static i95 r(hq5 hq5Var) {
        return (i95) ((oq5) hq5Var).j(j95.a);
    }

    public static final f s(x xVar) {
        xVar.getClass();
        List A = xVar.A();
        if (A != null) {
            return (f) CollectionsKt.S(A, xVar.r());
        }
        return null;
    }

    public static Object t(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final boolean u(mqs mqsVar, mqs mqsVar2) {
        k10 k10Var;
        mqsVar.getClass();
        if (!Intrinsics.d(mqsVar, mqsVar2)) {
            return false;
        }
        k10 k10Var2 = mqsVar.d;
        if (mqsVar2 == null || (k10Var = mqsVar2.d) == null) {
            k10Var = k10.i;
        }
        return Intrinsics.d(k10Var, k10Var2);
    }

    public static String v(String str, int i, char c) {
        str.getClass();
        int length = i - str.length();
        if (length > 0) {
            if (length <= 8192) {
                char[] cArr = new char[length];
                for (int i2 = length - 1; -1 < i2; i2--) {
                    cArr[i2] = c;
                }
                return new String(cArr).concat(str);
            }
            String valueOf = String.valueOf(c);
            if (valueOf.length() == 0) {
                valueOf = StringUtil.SPACE;
            }
            int length2 = valueOf.length();
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length2 == 1 && length3 <= 8192) {
                    return v(str, i, valueOf.charAt(0));
                }
                if (length3 == length2) {
                    return valueOf.concat(str);
                }
                if (length3 < length2) {
                    return valueOf.substring(0, length3).concat(str);
                }
                char[] cArr2 = new char[length3];
                char[] charArray = valueOf.toCharArray();
                charArray.getClass();
                for (int i3 = 0; i3 < length3; i3++) {
                    cArr2[i3] = charArray[i3 % length2];
                }
                return new String(cArr2).concat(str);
            }
        }
        return str;
    }

    public static Object w(Parcelable parcelable) {
        int i = dvt.a;
        if (i >= 21 && i < 23) {
            if (parcelable instanceof MediaBrowserCompat$MediaItem) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                MediaDescriptionCompat mediaDescriptionCompat = mediaBrowserCompat$MediaItem.b;
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(mediaDescriptionCompat.a, mediaDescriptionCompat.b, mediaDescriptionCompat.c, mediaDescriptionCompat.d, mediaDescriptionCompat.e, mediaDescriptionCompat.f, mediaDescriptionCompat.g, mediaDescriptionCompat.h), mediaBrowserCompat$MediaItem.a);
            }
            if (parcelable instanceof MediaDescriptionCompat) {
                MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) parcelable;
                return new MediaDescriptionCompat(mediaDescriptionCompat2.a, mediaDescriptionCompat2.b, mediaDescriptionCompat2.c, mediaDescriptionCompat2.d, mediaDescriptionCompat2.e, mediaDescriptionCompat2.f, mediaDescriptionCompat2.g, mediaDescriptionCompat2.h);
            }
        }
        return parcelable;
    }

    public static yci x(yci yciVar, uh0 uh0Var) {
        return yciVar.f(new PointerHoverIconModifierElement(uh0Var));
    }

    public static final Class y(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return y(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object y = xz0.y(upperBounds);
            y.getClass();
            return y((Type) y);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return y(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        wvs.l(sb, " has type ", ern.a(type.getClass()));
        return null;
    }

    public static final t9f z(uhp uhpVar, Class cls, List list) {
        t9f[] t9fVarArr = (t9f[]) list.toArray(new t9f[0]);
        t9f x = zwf.x(cls, (t9f[]) Arrays.copyOf(t9fVarArr, t9fVarArr.length));
        if (x != null) {
            return x;
        }
        lm4 a = ern.a(cls);
        t9f t9fVar = (t9f) ksm.a.get(a);
        if (t9fVar != null) {
            return t9fVar;
        }
        t9f b = uhpVar.b(a, list);
        if (b != null) {
            return b;
        }
        if (cls.isInterface()) {
            return new kgm(ern.a(cls));
        }
        return null;
    }

    public abstract void O(fix fixVar, fix fixVar2);

    public abstract void P(fix fixVar, Thread thread);

    public abstract boolean Q(tjx tjxVar, pex pexVar, pex pexVar2);

    public abstract boolean R(tjx tjxVar, Object obj, Object obj2);

    public abstract boolean S(tjx tjxVar, fix fixVar, fix fixVar2);
}
