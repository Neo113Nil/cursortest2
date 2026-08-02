package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.media3.session.i;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import com.yandex.plus.home.g;
import com.yandex.plus.home.internal.di.l;
import com.yandex.plus.home.internal.di.u;
import com.yandex.plus.home.plaque.feature.internal.presentation.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import j$.time.format.DateTimeFormatter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.coroutines.a;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.utils.Preconditions;
import ru.yandex.music.videoclip.VideoClipActivity;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ui.ListYandexPlayerView;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class cr implements q26, r26, adu {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public cr(Context context, View view) {
        this.a = 5;
        this.b = context;
        this.c = view.findViewById(R.id.progress_view);
        this.d = (AppBarLayout) view.findViewById(R.id.appbar);
        this.e = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        this.f = (ImageView) view.findViewById(R.id.background_img);
        this.g = (Toolbar) view.findViewById(R.id.toolbar);
        this.h = (TextView) view.findViewById(R.id.toolbar_title);
        this.i = (LinearLayout) view.findViewById(R.id.concert_info_container);
        ((AppBarLayout) this.d).a(new zcu((TextView) this.h));
        ((TextView) this.h).setAlpha(0.0f);
        hq0 hq0Var = (hq0) sj2.F(context);
        hq0Var.setSupportActionBar((Toolbar) this.g);
        ((qd) Preconditions.nonNull(hq0Var.getSupportActionBar())).s(null);
        ((CollapsingToolbarLayout) this.e).setOnApplyWindowInsetsListener(null);
        qdq.d((Toolbar) this.g, false, true, false, false);
        zs4.a((LinearLayout) this.i);
    }

    public static final String b(cr crVar, String str) {
        String str2;
        if (str == null) {
            crVar.getClass();
            return null;
        }
        dfc dfcVar = (dfc) ((xiu) crVar.e).p(str);
        if (dfcVar != null && (str2 = dfcVar.b) != null) {
            return str2;
        }
        VhVideoData vhVideoData = (VhVideoData) ((xiu) crVar.d).p(str);
        if (vhVideoData != null) {
            return vhVideoData.getFirstFrameHash();
        }
        return null;
    }

    public static final String d(cr crVar, String str) {
        String str2;
        if (str == null) {
            crVar.getClass();
            return null;
        }
        dfc dfcVar = (dfc) ((xiu) crVar.e).p(str);
        if (dfcVar != null && (str2 = dfcVar.a) != null) {
            return str2;
        }
        VhVideoData vhVideoData = (VhVideoData) ((xiu) crVar.d).p(str);
        if (vhVideoData != null) {
            return vhVideoData.getFirstFrameUrl();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r5.A(r8, r7, r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(cr crVar, w5j w5jVar, f7u f7uVar, String str, c0t c0tVar, cg6 cg6Var) {
        egn egnVar;
        int i;
        f7u f7uVar2;
        if (cg6Var instanceof egn) {
            egnVar = (egn) cg6Var;
            int i2 = egnVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                egnVar.o = i2 - Integer.MIN_VALUE;
                Object obj = egnVar.m;
                Object obj2 = nm6.a;
                i = egnVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    egnVar.j = w5jVar;
                    egnVar.k = str;
                    egnVar.l = c0tVar;
                    egnVar.o = 1;
                    obj = crVar.y0(f7uVar, egnVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c0tVar = egnVar.l;
                    str = egnVar.k;
                    w5jVar = egnVar.j;
                    qgg.h0(obj);
                }
                f7uVar2 = (f7u) obj;
                if (f7uVar2.f()) {
                    ssg.a(6, "RadioPlaybackImpl", "Unable to perform historical next operation. Queue does not contain pending item. This is an internal implementation error", null);
                    return Boolean.FALSE;
                }
                f7u h = f7uVar2.h();
                ((xdr) crVar.b).m(null, new pgn(str, h, c0tVar, s0(w5jVar)));
                egnVar.j = null;
                egnVar.k = null;
                egnVar.l = null;
                egnVar.o = 2;
            }
        }
        egnVar = new egn(crVar, cg6Var);
        Object obj3 = egnVar.m;
        Object obj22 = nm6.a;
        i = egnVar.o;
        if (i != 0) {
        }
        f7uVar2 = (f7u) obj3;
        if (f7uVar2.f()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c7, code lost:
    
        if (r20.A(r13, r8, r11, r4) == r5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(cr crVar, w5j w5jVar, f7u f7uVar, String str, long j, boolean z, c0t c0tVar, cg6 cg6Var) {
        fgn fgnVar;
        int i;
        w5j w5jVar2;
        String str2;
        boolean z2;
        f7u f7uVar2;
        Object obj;
        c0t c0tVar2;
        long j2;
        s7u c;
        f7u f7uVar3;
        xdr xdrVar;
        int i2;
        String str3;
        f7u f7uVar4;
        w5j w5jVar3;
        boolean z3;
        c0t c0tVar3;
        long j3;
        f7u h;
        Object obj2;
        f7u f7uVar5;
        xdr xdrVar2 = (xdr) crVar.b;
        if (cg6Var instanceof fgn) {
            fgnVar = (fgn) cg6Var;
            int i3 = fgnVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fgnVar.r = i3 - Integer.MIN_VALUE;
                Object obj3 = fgnVar.p;
                Object obj4 = nm6.a;
                i = fgnVar.r;
                if (i != 0) {
                    qgg.h0(obj3);
                    f7u f7uVar6 = f7uVar.e() ? f7uVar : null;
                    if (f7uVar6 == null || (c = f7uVar6.c()) == null) {
                        w5jVar2 = w5jVar;
                    } else {
                        w5jVar2 = w5jVar;
                        ((yks) crVar.f).n(w5jVar2, str, c, j);
                    }
                    fgnVar.j = w5jVar2;
                    fgnVar.k = f7uVar;
                    str2 = str;
                    fgnVar.l = str2;
                    fgnVar.m = c0tVar;
                    fgnVar.n = j;
                    z2 = z;
                    fgnVar.o = z2;
                    fgnVar.r = 1;
                    Object y0 = crVar.y0(f7uVar, fgnVar);
                    if (y0 != obj4) {
                        f7uVar2 = f7uVar;
                        obj = y0;
                        c0tVar2 = c0tVar;
                        j2 = j;
                    }
                    return obj4;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj3);
                            return Boolean.valueOf(xdrVar2.getValue() instanceof pgn);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = fgnVar.o;
                    j3 = fgnVar.n;
                    c0tVar3 = fgnVar.m;
                    str3 = fgnVar.l;
                    f7uVar4 = fgnVar.k;
                    w5jVar3 = fgnVar.j;
                    qgg.h0(obj3);
                    xdrVar = xdrVar2;
                    f7uVar5 = (f7u) obj3;
                    if (f7uVar5 != null) {
                        c0t c0tVar4 = c0tVar3;
                        z2 = z3;
                        j2 = j3;
                        c0tVar2 = c0tVar4;
                        w5jVar2 = w5jVar3;
                        f7uVar2 = f7uVar4;
                        str2 = str3;
                        h = null;
                        if (h != null) {
                        }
                        return Boolean.valueOf(xdrVar2.getValue() instanceof pgn);
                    }
                    if (f7uVar4.e() || f7uVar5.c.d) {
                        f7uVar5 = f7uVar5.h();
                    }
                    c0t c0tVar5 = c0tVar3;
                    z2 = z3;
                    String str4 = str3;
                    h = f7uVar5;
                    j2 = j3;
                    w5jVar2 = w5jVar3;
                    c0tVar2 = c0tVar5;
                    f7uVar2 = f7uVar4;
                    str2 = str4;
                    if (h != null) {
                        e7u e7uVar = f7uVar2.c;
                        int i4 = e7uVar.b;
                        int i5 = i4 + 1;
                        List list = f7uVar2.b;
                        int size = list.size();
                        if (i5 > size) {
                            i5 = size;
                        }
                        if (e7uVar.a != i5 || i4 != i5) {
                            if (i5 + 1 > 100) {
                                f7uVar2 = f7u.b(f7uVar2, list.subList(i5 - 99, list.size()), new e7u(99, 99), 1);
                            } else {
                                obj2 = null;
                                f7uVar2 = f7u.b(f7uVar2, null, new e7u(i5, i5), 3);
                                xdrVar2 = xdrVar;
                                xdrVar2.m(obj2, new ogn(str2, f7uVar2, c0tVar2));
                            }
                        }
                        obj2 = null;
                        xdrVar2 = xdrVar;
                        xdrVar2.m(obj2, new ogn(str2, f7uVar2, c0tVar2));
                    } else {
                        xdrVar2 = xdrVar;
                        xdrVar2.m(null, new pgn(str2, h, c0tVar2, s0(w5jVar2)));
                        fgnVar.j = null;
                        fgnVar.k = null;
                        fgnVar.l = null;
                        fgnVar.m = null;
                        fgnVar.n = j2;
                        fgnVar.o = z2;
                        fgnVar.r = 3;
                    }
                    return Boolean.valueOf(xdrVar2.getValue() instanceof pgn);
                }
                boolean z4 = fgnVar.o;
                long j4 = fgnVar.n;
                c0t c0tVar6 = fgnVar.m;
                str2 = fgnVar.l;
                f7uVar2 = fgnVar.k;
                w5j w5jVar4 = fgnVar.j;
                qgg.h0(obj3);
                z2 = z4;
                obj = obj3;
                j2 = j4;
                w5jVar2 = w5jVar4;
                c0tVar2 = c0tVar6;
                f7uVar3 = (f7u) obj;
                if (z2) {
                    xdrVar = xdrVar2;
                    i2 = 2;
                } else {
                    i2 = 2;
                    List list2 = f7uVar3.b;
                    if (list2.isEmpty()) {
                        xdrVar = xdrVar2;
                    } else {
                        xdrVar = xdrVar2;
                        f7uVar3 = f7u.b(f7uVar3, list2.subList(0, yhn.e(f7uVar3.c.b + 2, new IntRange(1, list2.size(), 1))), null, 5);
                    }
                }
                if (!f7uVar3.f()) {
                    h = f7uVar3.h();
                    if (h != null) {
                    }
                    return Boolean.valueOf(xdrVar2.getValue() instanceof pgn);
                }
                if (!((ae) crVar.h).a()) {
                    ssg.a(3, "RadioPlaybackImpl", "Synchronous queue prolongation needed. Next called without pending track in queue", null);
                    fgnVar.j = w5jVar2;
                    fgnVar.k = f7uVar2;
                    fgnVar.l = str2;
                    fgnVar.m = c0tVar2;
                    fgnVar.n = j2;
                    fgnVar.o = z2;
                    fgnVar.r = i2;
                    Object e0 = crVar.e0(str2, f7uVar3, fgnVar);
                    if (e0 != obj4) {
                        str3 = str2;
                        f7uVar4 = f7uVar2;
                        w5jVar3 = w5jVar2;
                        long j5 = j2;
                        obj3 = e0;
                        z3 = z2;
                        c0tVar3 = c0tVar2;
                        j3 = j5;
                        f7uVar5 = (f7u) obj3;
                        if (f7uVar5 != null) {
                        }
                    }
                    return obj4;
                }
                h = null;
                if (h != null) {
                }
                return Boolean.valueOf(xdrVar2.getValue() instanceof pgn);
            }
        }
        fgnVar = new fgn(crVar, cg6Var);
        Object obj32 = fgnVar.p;
        Object obj42 = nm6.a;
        i = fgnVar.r;
        if (i != 0) {
        }
        f7uVar3 = (f7u) obj;
        if (z2) {
        }
        if (!f7uVar3.f()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(cr crVar, ii3 ii3Var, cg6 cg6Var) {
        w1o w1oVar;
        int i;
        Iterator it;
        if (cg6Var instanceof w1o) {
            w1oVar = (w1o) cg6Var;
            int i2 = w1oVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1oVar.m = i2 - Integer.MIN_VALUE;
                Object obj = w1oVar.k;
                nm6 nm6Var = nm6.a;
                i = w1oVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    it = ii3Var.a.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = w1oVar.j;
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boolean.FALSE;
                    }
                    if (it.hasNext()) {
                        PlaybackCommand$QueueBound playbackCommand$QueueBound = (PlaybackCommand$QueueBound) it.next();
                        saf.K(w1oVar.getContext());
                        bsn bsnVar = (bsn) crVar.b;
                        w1oVar.j = it;
                        w1oVar.m = 1;
                        obj = a4g.O(new rfg(playbackCommand$QueueBound, bsnVar, (Continuation) null, 25), w1oVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        }
        w1oVar = new w1o(crVar, cg6Var);
        Object obj2 = w1oVar.k;
        nm6 nm6Var2 = nm6.a;
        i = w1oVar.m;
        if (i != 0) {
        }
    }

    public static final void k(cr crVar, xci xciVar, f8j f8jVar) {
        for (xci xciVar2 = xciVar.e; xciVar2 != null; xciVar2 = xciVar2.e) {
            if (xciVar2 == a8j.a) {
                mpf u = ((mpf) crVar.b).u();
                f8jVar.n = u != null ? (ane) u.F.c : null;
                crVar.d = f8jVar;
                return;
            } else {
                if ((xciVar2.c & 2) != 0) {
                    return;
                }
                xciVar2.R0(f8jVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ed, code lost:
    
        if (r5.m(r2, r6) == r7) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r4 != r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r4 == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(cr crVar, s5d s5dVar, r5d r5dVar, boolean z, cg6 cg6Var) {
        u0r u0rVar;
        int i;
        s5d s5dVar2;
        s5d s5dVar3;
        boolean z2;
        Object e;
        s5d s5dVar4 = s5dVar;
        boolean z3 = z;
        jtc jtcVar = (jtc) crVar.g;
        if (cg6Var instanceof u0r) {
            u0rVar = (u0r) cg6Var;
            int i2 = u0rVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0rVar.o = i2 - Integer.MIN_VALUE;
                Object obj = u0rVar.m;
                nm6 nm6Var = nm6.a;
                i = u0rVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    r5d playerType = s5dVar4.getPlayerType();
                    StringBuilder sb = new StringBuilder("replaceCurrentPlayer(currentType=");
                    sb.append(playerType);
                    sb.append(", requiredType=");
                    sb.append(r5dVar);
                    sb.append(", notifyRelease=");
                    ssg.a(3, "SmartSwapPlayerWrapper", ouj.r(sb, z3, ")"), null);
                    if (r5dVar != playerType) {
                        u0rVar.j = s5dVar4;
                        u0rVar.l = z3;
                        u0rVar.o = 1;
                        obj = crVar.J(s5dVar4, r5dVar, u0rVar);
                    }
                    return null;
                }
                if (i == 1) {
                    boolean z4 = u0rVar.l;
                    s5d s5dVar5 = u0rVar.j;
                    qgg.h0(obj);
                    z3 = z4;
                    s5dVar4 = s5dVar5;
                } else if (i == 2) {
                    z2 = u0rVar.l;
                    s5dVar2 = u0rVar.k;
                    s5dVar3 = u0rVar.j;
                    qgg.h0(obj);
                    u0rVar.j = s5dVar3;
                    u0rVar.k = s5dVar2;
                    u0rVar.l = z2;
                    u0rVar.o = 3;
                    jtcVar.getClass();
                    e = s5dVar3.e(u0rVar);
                    if (e != nm6Var) {
                        e = Unit.a;
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                qgg.h0(obj);
                                return obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = u0rVar.l;
                        s5dVar2 = u0rVar.k;
                        s5dVar3 = u0rVar.j;
                        qgg.h0(obj);
                        crVar.h = s5dVar2;
                        Iterator it = w9l.a.iterator();
                        if (it.hasNext()) {
                            throw hrg.j(it);
                        }
                        u0rVar.j = null;
                        u0rVar.k = null;
                        u0rVar.l = z2;
                        u0rVar.o = 5;
                        Object d = s5dVar3.d(z2, u0rVar);
                        return d == nm6Var ? nm6Var : d;
                    }
                    z2 = u0rVar.l;
                    s5dVar2 = u0rVar.k;
                    s5dVar3 = u0rVar.j;
                    qgg.h0(obj);
                    u0rVar.j = s5dVar3;
                    u0rVar.k = s5dVar2;
                    u0rVar.l = z2;
                    u0rVar.o = 4;
                }
                s5dVar2 = (s5d) obj;
                if (!Intrinsics.d(s5dVar4, s5dVar2)) {
                    u0rVar.j = s5dVar4;
                    u0rVar.k = s5dVar2;
                    u0rVar.l = z3;
                    u0rVar.o = 2;
                    if (s5dVar2.l(u0rVar) != nm6Var) {
                        boolean z5 = z3;
                        s5dVar3 = s5dVar4;
                        z2 = z5;
                        u0rVar.j = s5dVar3;
                        u0rVar.k = s5dVar2;
                        u0rVar.l = z2;
                        u0rVar.o = 3;
                        jtcVar.getClass();
                        e = s5dVar3.e(u0rVar);
                        if (e != nm6Var) {
                        }
                    }
                }
                return null;
            }
        }
        u0rVar = new u0r(crVar, cg6Var);
        Object obj2 = u0rVar.m;
        nm6 nm6Var2 = nm6.a;
        i = u0rVar.o;
        if (i != 0) {
        }
        s5dVar2 = (s5d) obj2;
        if (!Intrinsics.d(s5dVar4, s5dVar2)) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #0 {all -> 0x0136, blocks: (B:21:0x00a8, B:23:0x00ae, B:26:0x00b7, B:28:0x0123, B:33:0x0139, B:37:0x0181, B:38:0x0188), top: B:20:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0181 A[Catch: all -> 0x0136, TRY_ENTER, TryCatch #0 {all -> 0x0136, blocks: (B:21:0x00a8, B:23:0x00ae, B:26:0x00b7, B:28:0x0123, B:33:0x0139, B:37:0x0181, B:38:0x0188), top: B:20:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [oqi] */
    /* JADX WARN: Type inference failed for: r7v17, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(cr crVar, String str, String str2, String str3, z77 z77Var, cg6 cg6Var) {
        s60 s60Var;
        int i;
        Object obj;
        ?? r1;
        String str4;
        File file;
        int i2;
        String str5;
        String str6;
        String str7;
        z77 z77Var2;
        qqi qqiVar;
        Object obj2;
        qqi qqiVar2;
        String str8 = str;
        c5m c5mVar = (c5m) crVar.e;
        try {
            try {
                if (cg6Var instanceof s60) {
                    s60Var = (s60) cg6Var;
                    int i3 = s60Var.t;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s60Var.t = i3 - Integer.MIN_VALUE;
                        Object obj3 = s60Var.r;
                        nm6 nm6Var = nm6.a;
                        i = s60Var.t;
                        if (i != 0) {
                            qgg.h0(obj3);
                            if (str8 == null || StringsKt.U(str8)) {
                                return Unit.a;
                            }
                            File file2 = new File((File) crVar.d, "userId");
                            qqi qqiVar3 = (qqi) crVar.i;
                            s60Var.j = str8;
                            s60Var.k = str2;
                            str4 = str3;
                            s60Var.l = str4;
                            s60Var.m = z77Var;
                            s60Var.n = "NativeWidget.Daily.Added";
                            s60Var.o = file2;
                            s60Var.p = qqiVar3;
                            s60Var.q = 0;
                            s60Var.t = 1;
                            if (qqiVar3.a(s60Var) != nm6Var) {
                                file = file2;
                                i2 = 0;
                                str5 = str2;
                                str6 = "NativeWidget.Daily.Added";
                                str7 = str8;
                                z77Var2 = z77Var;
                                qqiVar = qqiVar3;
                            }
                            return nm6Var;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r12 = s60Var.p;
                            qgg.h0(obj3);
                            obj2 = null;
                            qqiVar2 = r12;
                            qqiVar2.b(obj2);
                            return Unit.a;
                        }
                        int i4 = s60Var.q;
                        ?? r7 = s60Var.p;
                        file = s60Var.o;
                        String str9 = s60Var.n;
                        z77 z77Var3 = s60Var.m;
                        String str10 = s60Var.l;
                        str5 = s60Var.k;
                        str7 = s60Var.j;
                        qgg.h0(obj3);
                        i2 = i4;
                        str6 = str9;
                        str4 = str10;
                        qqiVar = r7;
                        z77Var2 = z77Var3;
                        if (!file.exists()) {
                            throw new IllegalStateException("Already was reported");
                        }
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                        zac.f(file, str7);
                        Pair[] pairArr = {new Pair("client_app_package", (String) crVar.b), new Pair("client_app_version", (String) crVar.c), new Pair("sdk_version", "1.3.2"), new Pair("platform", "ANDROID"), new Pair("puid", str7), new Pair("testids", str5), new Pair("triggered_testids", str4), new Pair("actual_user_puid", str7)};
                        long[] jArr = vso.a;
                        tpi tpiVar = new tpi(8);
                        for (int i5 = 0; i5 < 8; i5++) {
                            Pair pair = pairArr[i5];
                            tpiVar.m(pair.a, pair.b);
                        }
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str11 = str5;
                        i5f i5fVar = (i5f) crVar.f;
                        yct c = ern.c(String.class);
                        uhp uhpVar = pip.a;
                        q60 q60Var = new q60(z77Var2, str7, str6, str11, i5fVar.c(new udb(swf.g0(uhpVar, c), swf.g0(uhpVar, ern.b(String.class))), tpiVar));
                        s60Var.j = null;
                        s60Var.k = null;
                        s60Var.l = null;
                        s60Var.m = null;
                        s60Var.n = null;
                        s60Var.o = null;
                        s60Var.p = qqiVar;
                        s60Var.q = i2;
                        s60Var.t = 2;
                        if (c5mVar.invoke(q60Var, s60Var) != nm6Var) {
                            obj2 = null;
                            qqiVar2 = qqiVar;
                            qqiVar2.b(obj2);
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                }
                if (!file.exists()) {
                }
            } catch (Throwable th) {
                th = th;
                obj = null;
                r1 = qqiVar;
                r1.b(obj);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
            r1 = str8;
        }
        s60Var = new s60(crVar, cg6Var);
        Object obj32 = s60Var.r;
        nm6 nm6Var2 = nm6.a;
        i = s60Var.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0147 A[Catch: all -> 0x0158, LOOP:0: B:32:0x0145->B:33:0x0147, LOOP_END, TryCatch #0 {all -> 0x0158, blocks: (B:27:0x00a9, B:31:0x00dc, B:33:0x0147, B:37:0x015c, B:30:0x00bf, B:41:0x01aa, B:42:0x01b1), top: B:26:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r3v6, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(cr crVar, String str, String str2, String str3, z77 z77Var, cg6 cg6Var) {
        t60 t60Var;
        t60 t60Var2;
        nm6 nm6Var;
        int i;
        String str4;
        File file;
        String str5;
        String str6;
        z77 z77Var2;
        int i2;
        String str7;
        qqi qqiVar;
        oqi oqiVar;
        Object obj;
        String d;
        z77 z77Var3;
        String str8;
        Class cls;
        int i3;
        q60 q60Var;
        Object obj2;
        c5m c5mVar = (c5m) crVar.e;
        try {
            if (cg6Var instanceof t60) {
                t60Var = (t60) cg6Var;
                int i4 = t60Var.t;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    t60Var.t = i4 - Integer.MIN_VALUE;
                    t60Var2 = t60Var;
                    Object obj3 = t60Var2.r;
                    nm6Var = nm6.a;
                    i = t60Var2.t;
                    if (i != 0) {
                        qgg.h0(obj3);
                        File file2 = new File((File) crVar.d, "userId");
                        qqi qqiVar2 = (qqi) crVar.i;
                        t60Var2.j = str;
                        t60Var2.k = str2;
                        t60Var2.l = str3;
                        t60Var2.m = z77Var;
                        t60Var2.n = "NativeWidget.Daily.Removed";
                        t60Var2.o = file2;
                        t60Var2.p = qqiVar2;
                        t60Var2.q = 0;
                        t60Var2.t = 1;
                        if (qqiVar2.a(t60Var2) != nm6Var) {
                            str4 = str;
                            file = file2;
                            str5 = str2;
                            str6 = str3;
                            z77Var2 = z77Var;
                            i2 = 0;
                            str7 = "NativeWidget.Daily.Removed";
                            qqiVar = qqiVar2;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = t60Var2.p;
                        try {
                            qgg.h0(obj3);
                            obj2 = null;
                            oqiVar.b(obj2);
                            return Unit.a;
                        } catch (Throwable th) {
                            th = th;
                            obj = null;
                            oqiVar.b(obj);
                            throw th;
                        }
                    }
                    int i5 = t60Var2.q;
                    ?? r3 = t60Var2.p;
                    File file3 = t60Var2.o;
                    String str9 = t60Var2.n;
                    z77 z77Var4 = t60Var2.m;
                    String str10 = t60Var2.l;
                    String str11 = t60Var2.k;
                    String str12 = t60Var2.j;
                    qgg.h0(obj3);
                    file = file3;
                    str7 = str9;
                    z77Var2 = z77Var4;
                    str6 = str10;
                    str4 = str12;
                    qqiVar = r3;
                    str5 = str11;
                    i2 = i5;
                    if (!file.exists()) {
                        try {
                            d = zac.d(file);
                            z77Var3 = z77Var2;
                            str8 = str4;
                            cls = String.class;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar = qqiVar;
                            obj = null;
                            oqiVar.b(obj);
                            throw th;
                        }
                    } else {
                        if (str4 == null) {
                            throw new IllegalStateException("Neither userId nor cache exists");
                        }
                        z77Var3 = z77Var2;
                        cls = String.class;
                        str8 = str4;
                        x97.y((tf6) crVar.g, (a) crVar.h, null, new r60(crVar, str8, str5, str6, z77Var3, null, 2), 2);
                        d = str8;
                    }
                    file.delete();
                    z77 z77Var5 = z77Var3;
                    String str13 = str8;
                    Pair[] pairArr = {new Pair("client_app_package", (String) crVar.b), new Pair("client_app_version", (String) crVar.c), new Pair("sdk_version", "1.3.2"), new Pair("platform", "ANDROID"), new Pair("puid", str8), new Pair("testids", str5), new Pair("triggered_testids", str6), new Pair("actual_user_puid", d)};
                    long[] jArr = vso.a;
                    tpi tpiVar = new tpi(8);
                    for (i3 = 0; i3 < 8; i3++) {
                        Pair pair = pairArr[i3];
                        tpiVar.m(pair.a, pair.b);
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    i5f i5fVar = (i5f) crVar.f;
                    yct c = ern.c(cls);
                    uhp uhpVar = pip.a;
                    int i6 = i2;
                    q60Var = new q60(z77Var5, str13, str7, str5, i5fVar.c(new udb(swf.g0(uhpVar, c), swf.g0(uhpVar, ern.b(cls))), tpiVar));
                    t60Var2.j = null;
                    t60Var2.k = null;
                    t60Var2.l = null;
                    t60Var2.m = null;
                    t60Var2.n = null;
                    t60Var2.o = null;
                    t60Var2.p = qqiVar;
                    t60Var2.q = i6;
                    t60Var2.t = 2;
                    if (c5mVar.invoke(q60Var, t60Var2) != nm6Var) {
                        oqiVar = qqiVar;
                        obj2 = null;
                        oqiVar.b(obj2);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            if (!file.exists()) {
            }
            file.delete();
            z77 z77Var52 = z77Var3;
            String str132 = str8;
            Pair[] pairArr2 = {new Pair("client_app_package", (String) crVar.b), new Pair("client_app_version", (String) crVar.c), new Pair("sdk_version", "1.3.2"), new Pair("platform", "ANDROID"), new Pair("puid", str8), new Pair("testids", str5), new Pair("triggered_testids", str6), new Pair("actual_user_puid", d)};
            long[] jArr2 = vso.a;
            tpi tpiVar2 = new tpi(8);
            while (i3 < 8) {
            }
            if (str5 == null) {
            }
            i5f i5fVar2 = (i5f) crVar.f;
            yct c2 = ern.c(cls);
            uhp uhpVar2 = pip.a;
            int i62 = i2;
            q60Var = new q60(z77Var52, str132, str7, str5, i5fVar2.c(new udb(swf.g0(uhpVar2, c2), swf.g0(uhpVar2, ern.b(cls))), tpiVar2));
            t60Var2.j = null;
            t60Var2.k = null;
            t60Var2.l = null;
            t60Var2.m = null;
            t60Var2.n = null;
            t60Var2.o = null;
            t60Var2.p = qqiVar;
            t60Var2.q = i62;
            t60Var2.t = 2;
            if (c5mVar.invoke(q60Var, t60Var2) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            th = th3;
            oqiVar = qqiVar;
            obj = null;
            oqiVar.b(obj);
            throw th;
        }
        t60Var = new t60(crVar, cg6Var);
        t60Var2 = t60Var;
        Object obj32 = t60Var2.r;
        nm6Var = nm6.a;
        i = t60Var2.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(cr crVar, lt ltVar, String str, cg6 cg6Var) {
        g5j g5jVar;
        int i;
        List list;
        if (cg6Var instanceof g5j) {
            g5jVar = (g5j) cg6Var;
            int i2 = g5jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g5jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = g5jVar.l;
                Object obj2 = nm6.a;
                i = g5jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    g5jVar.j = ltVar;
                    g5jVar.k = str;
                    g5jVar.n = 1;
                    obj = crVar.E(ltVar, g5jVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = g5jVar.k;
                    ltVar = g5jVar.j;
                    qgg.h0(obj);
                }
                String str2 = str;
                list = (List) obj;
                if (list != null) {
                    return Unit.a;
                }
                e eVar = (e) ((jyr) crVar.i).getValue();
                CardPlaybackScope p = d.p((nrf) crVar.h);
                eVar.getClass();
                ltVar.getClass();
                asq.t(z5l.e((z5l) ((jyr) crVar.f).getValue(), new kjf(p.c(ltVar), list, crVar, str2, null, 1)), (Context) crVar.b, new p1n(8));
                return Unit.a;
            }
        }
        g5jVar = new g5j(crVar, cg6Var);
        Object obj3 = g5jVar.l;
        Object obj22 = nm6.a;
        i = g5jVar.n;
        if (i != 0) {
        }
        String str22 = str;
        list = (List) obj3;
        if (list != null) {
        }
    }

    public static final Object r(cr crVar, String str, String str2, String str3, ListYandexPlayerView listYandexPlayerView, aur aurVar) {
        crVar.getClass();
        String str4 = str + str2 + str3;
        if (Intrinsics.d(listYandexPlayerView.getFirstFrameImageView$video_player_internalRelease().getTag(), str4)) {
            return Unit.a;
        }
        listYandexPlayerView.getFirstFrameImageView$video_player_internalRelease().setTag(str4);
        k0o N = crVar.N(str, str2);
        dq7 dq7Var = ca8.a;
        Object V = x97.V(j5h.a.g, new n71(N, crVar, listYandexPlayerView, (Continuation) null, 14), aurVar);
        return V == nm6.a ? V : Unit.a;
    }

    public static b3l s0(w5j w5jVar) {
        int ordinal = w5jVar.ordinal();
        if (ordinal == 0) {
            return t2l.a;
        }
        if (ordinal == 1) {
            return u2l.a;
        }
        if (ordinal == 2) {
            return s2l.a;
        }
        if (ordinal == 3) {
            return y2l.a;
        }
        b6e.s();
        return null;
    }

    public static xci t(wci wciVar, xci xciVar) {
        xci xciVar2;
        if (wciVar instanceof edi) {
            xciVar2 = ((edi) wciVar).e();
            xciVar2.c = g8j.f(xciVar2);
        } else {
            jk2 jk2Var = new jk2();
            jk2Var.c = g8j.d(wciVar);
            jk2Var.o = wciVar;
            jk2Var.q = new HashSet();
            xciVar2 = jk2Var;
        }
        if (xciVar2.n) {
            sme.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        xciVar2.i = true;
        xci xciVar3 = xciVar.f;
        if (xciVar3 != null) {
            xciVar3.e = xciVar2;
            xciVar2.f = xciVar3;
        }
        xciVar.f = xciVar2;
        xciVar2.e = xciVar;
        return xciVar2;
    }

    public static alp u0(gin ginVar, Bundle bundle) {
        if (ginVar instanceof uwd) {
            return ((uwd) ginVar).c ? new alp(bundle, xgh.e.a) : new alp(bundle, xgh.f.a);
        }
        return null;
    }

    public static void w0(wci wciVar, wci wciVar2, xci xciVar) {
        if ((wciVar instanceof edi) && (wciVar2 instanceof edi)) {
            z7j z7jVar = a8j.a;
            xciVar.getClass();
            ((edi) wciVar2).j(xciVar);
            if (xciVar.n) {
                g8j.c(xciVar);
                return;
            } else {
                xciVar.j = true;
                return;
            }
        }
        if (!(xciVar instanceof jk2)) {
            sme.b("Unknown Modifier.Node type");
            return;
        }
        jk2 jk2Var = (jk2) xciVar;
        if (jk2Var.n) {
            jk2Var.T0();
        }
        jk2Var.o = wciVar2;
        jk2Var.c = g8j.d(wciVar2);
        if (jk2Var.n) {
            jk2Var.S0(false);
        }
        if (xciVar.n) {
            g8j.c(xciVar);
        } else {
            xciVar.j = true;
        }
    }

    public static xci x(xci xciVar) {
        boolean z = xciVar.n;
        if (z) {
            cpi cpiVar = g8j.a;
            if (!z) {
                sme.b("autoInvalidateRemovedNode called on unattached node");
            }
            g8j.a(xciVar, -1, 2);
            xciVar.P0();
            xciVar.J0();
        }
        xci xciVar2 = xciVar.f;
        xci xciVar3 = xciVar.e;
        if (xciVar2 != null) {
            xciVar2.e = xciVar3;
            xciVar.f = null;
        }
        if (xciVar3 != null) {
            xciVar3.f = xciVar2;
            xciVar.e = null;
        }
        xciVar3.getClass();
        return xciVar3;
    }

    public Object A(String str, f7u f7uVar, c0t c0tVar, cg6 cg6Var) {
        if (((ae) this.h).a()) {
            return Unit.a;
        }
        if (f7uVar.d > 2) {
            return Unit.a;
        }
        ssg.a(3, "RadioPlaybackImpl", "Queue is about to end. Launching async prolongation", null);
        Object H0 = ((n3m) this.e).H0(str, f7uVar, c0tVar, cg6Var);
        return H0 == nm6.a ? H0 : Unit.a;
    }

    public void C() {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        D();
        D();
        if (((KeyStore) this.c) == null) {
            jyr jyrVar = yat.a;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("YandexTrustManager", "Custom KeyStore is null, failed to add certs");
                keyStore = null;
            } else {
                y21 y21Var = (y21) ((vw6) this.b);
                y21Var.getClass();
                try {
                    InputStream openRawResource = y21Var.a.getResources().openRawResource(R.raw.bundled_cert);
                    try {
                        openRawResource.getClass();
                        byte[] N = vnj.N(openRawResource);
                        openRawResource.close();
                        byte[][] bArr = {N};
                        ArrayList arrayList = new ArrayList();
                        byte[] bArr2 = bArr[0];
                        jyr jyrVar2 = yat.a;
                        bArr2.getClass();
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        try {
                            CertificateFactory certificateFactory = (CertificateFactory) yat.a.getValue();
                            x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                        } catch (CertificateException unused3) {
                            x509Certificate = null;
                        }
                        if (x509Certificate != null) {
                            arrayList.add(x509Certificate);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), (X509Certificate) it.next());
                            } catch (KeyStoreException e) {
                                Log.w("YandexTrustManager", "Failed to store certificate", e);
                            }
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    b6e.o("Failed to create cert", e2);
                    return;
                }
            }
            this.c = keyStore;
        }
        D();
        if (((X509TrustManager) this.d) == null) {
            D();
            if (((KeyStore) this.c) != null) {
                D();
                this.d = yat.b((KeyStore) this.c);
                D();
                X509TrustManager x509TrustManager = (X509TrustManager) this.d;
                this.g = x509TrustManager != null ? yat.c(x509TrustManager) : null;
            }
        }
    }

    public void D() {
        if (Thread.holdsLock(this.h)) {
            return;
        }
        xq0.q("Operation should be performed under lock");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable E(lt ltVar, cg6 cg6Var) {
        f5j f5jVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof f5j) {
            f5jVar = (f5j) cg6Var;
            int i2 = f5jVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f5jVar.m = i2 - Integer.MIN_VALUE;
                Object obj = f5jVar.k;
                nm6 nm6Var = nm6.a;
                i = f5jVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    yr yrVar = (yr) ((jyr) this.g).getValue();
                    String str = ltVar.a;
                    f5jVar.j = ltVar;
                    f5jVar.m = 1;
                    obj = yrVar.d(str, f5jVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ltVar = f5jVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return ((oq) ((qj6) rj6Var).a).F;
                }
                if (rj6Var instanceof pj6) {
                    dfi.r(f1d.g("Error getting full album for id ", ltVar.a), "NewReleasesNavigationImpl");
                    return null;
                }
                b6e.s();
                return null;
            }
        }
        f5jVar = new f5j(this, cg6Var);
        Object obj2 = f5jVar.k;
        nm6 nm6Var2 = nm6.a;
        i = f5jVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    public LinkedHashSet H() {
        return (LinkedHashSet) this.i;
    }

    public X509TrustManager I() {
        return (X509TrustManager) ((jyr) this.i).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
    
        if (r13 != r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(s5d s5dVar, r5d r5dVar, cg6 cg6Var) {
        s0r s0rVar;
        int i;
        Object h84Var;
        es6 es6Var = (es6) this.b;
        if (cg6Var instanceof s0r) {
            s0rVar = (s0r) cg6Var;
            int i2 = s0rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0rVar.m = i2 - Integer.MIN_VALUE;
                s0r s0rVar2 = s0rVar;
                Object obj = s0rVar2.k;
                nm6 nm6Var = nm6.a;
                i = s0rVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "getPlayerFor(requiredType=" + r5dVar + ")", null);
                    if (r5dVar == s5dVar.getPlayerType()) {
                        return s5dVar;
                    }
                    if (r5dVar == r5d.b) {
                        eps epsVar = (eps) this.c;
                        s0rVar2.j = null;
                        s0rVar2.m = 1;
                        u5q u5qVar = (u5q) ((jyr) epsVar.a).getValue();
                        l13 l13Var = (l13) epsVar.b;
                        obj = u5qVar.a((iy1) l13Var.a.D(hag.I(iy1.class), l13Var, l13Var.b), (x0q) epsVar.c, (es6) epsVar.d, (j6q) ((jyr) epsVar.e).getValue(), (j0l) ((jyr) epsVar.f).getValue(), (jf2) ((faw) ((gni) epsVar.g)).L.getValue(), s0rVar2);
                    } else {
                        if (r5dVar == r5d.f) {
                            wlw wlwVar = (wlw) ((jyr) this.f).getValue();
                            return wlwVar != null ? new nmw(wlwVar, es6Var) : xae.a;
                        }
                        if (r5dVar == r5d.a) {
                            return xae.a;
                        }
                        if (r5dVar == r5d.g) {
                            return new i9s(es6Var, (zzp) this.e, (caw) ((jyr) this.i).getValue());
                        }
                        if (((aaw) this.d) != null) {
                            s0rVar2.j = r5dVar;
                            s0rVar2.m = 2;
                            int ordinal = r5dVar.ordinal();
                            if (ordinal == 2) {
                                h84Var = new h84(es6Var);
                            } else if (ordinal == 3) {
                                h84Var = new a6u(es6Var);
                            } else if (ordinal != 4) {
                                obj = null;
                            } else {
                                h84Var = new zfd(es6Var);
                            }
                            obj = h84Var;
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return (s5d) obj;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r5dVar = s0rVar2.j;
                qgg.h0(obj);
                s5d s5dVar2 = (s5d) obj;
                if (s5dVar2 != null) {
                    return s5dVar2;
                }
                dfi.r("Unsupported player type: " + r5dVar, "SmartSwapPlayerWrapper");
                return xae.a;
            }
        }
        s0rVar = new s0r(this, cg6Var);
        s0r s0rVar22 = s0rVar;
        Object obj2 = s0rVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = s0rVar22.m;
        if (i != 0) {
        }
        dfi.r("Unsupported player type: " + r5dVar, "SmartSwapPlayerWrapper");
        return xae.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r7 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(cg6 cg6Var) {
        cgn cgnVar;
        Object obj;
        int i;
        bjt bjtVar = (bjt) this.d;
        if (cg6Var instanceof cgn) {
            cgnVar = (cgn) cg6Var;
            int i2 = cgnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cgnVar.l = i2 - Integer.MIN_VALUE;
                obj = cgnVar.j;
                nm6 nm6Var = nm6.a;
                i = cgnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cgnVar.l = 1;
                    obj = bjtVar.n(cgnVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                cgnVar.l = 2;
                Object f = bjtVar.f(cgnVar);
                return f == nm6Var ? nm6Var : f;
            }
        }
        cgnVar = new cgn(this, cg6Var);
        obj = cgnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cgnVar.l;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public boolean M(int i) {
        return (i & ((xci) this.f).d) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k0o N(String str, String str2) {
        Bitmap bitmap;
        byte[] decode;
        rnj I;
        int i;
        int i2;
        b1o b1oVar = (b1o) this.h;
        ((qdc) this.b).H("GlideBitmapDownloader", "loadMediaData", hrg.r("firstFrameUrl=", str, " firstFrameUrl=", str2), new Object[0]);
        Drawable drawable = null;
        drawable = null;
        if (str == null) {
            str = null;
        } else if (c.n(str, "orig", true)) {
            str = StringsKt.j0(str, yhn.m(0, str.length() - 4)).concat("1080x1920q15");
        }
        if (str2 != null) {
            try {
                decode = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                Timber.INSTANCE.e(e);
            }
            if (decode != null) {
                try {
                    I = bfg.I(decode);
                    i = I.c;
                } catch (IndexOutOfBoundsException e2) {
                    Timber.INSTANCE.e(e2);
                }
                if (i > 0 && (i2 = I.b) > 0) {
                    int[] iArr = (int[]) I.d;
                    if (iArr.length == i2 * i) {
                        bitmap = Bitmap.createBitmap(iArr, i2, i, Bitmap.Config.ARGB_8888);
                        if (bitmap != null) {
                            kma kmaVar = new kma(14, bitmap);
                            t tVar = (t) this.g;
                            drawable = (Drawable) (tVar != null ? kmaVar.invoke(tVar) : null);
                        }
                    }
                }
            }
            bitmap = null;
            if (bitmap != null) {
            }
        }
        if (str == null || str.length() == 0) {
            b1oVar.getClass();
            dt2 h = ((k0o) new k0o(b1oVar.a, b1oVar, Drawable.class, b1oVar.b).I(drawable).b((g1o) new g1o().e(x68.b)).f()).h();
            h.getClass();
            return (k0o) h;
        }
        xsf xsfVar = new xsf();
        ysf ysfVar = new ysf("image/webp");
        HashMap hashMap = new HashMap(xsfVar.a.size());
        for (Map.Entry entry : xsfVar.a.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        xsfVar.a = hashMap;
        List list = (List) xsfVar.a.get("Accept");
        if (list == null) {
            list = new ArrayList();
            xsfVar.a.put("Accept", list);
        }
        list.add(ysfVar);
        old oldVar = new old(str, new zsf(xsfVar.a));
        b1oVar.getClass();
        dt2 h2 = ((k0o) new k0o(b1oVar.a, b1oVar, Drawable.class, b1oVar.b).I(oldVar).f()).h();
        h2.getClass();
        k0o k0oVar = (k0o) h2;
        if (str2 == null) {
            return k0oVar;
        }
        dt2 m = k0oVar.m(drawable);
        m.getClass();
        return (k0o) m;
    }

    public void O(int i, String str, boolean z) {
        Pair F = hld.F(str);
        if (F != null) {
            P(i, (String) F.a, z);
            P(i, (String) F.b, z);
        }
        P(i, str, z);
    }

    public void P(int i, String str, boolean z) {
        List<mlt> w0;
        Integer valueOf;
        HashMap hashMap = (HashMap) this.d;
        Integer num = (Integer) hashMap.get(str);
        if (z || num == null || num.intValue() != i) {
            hashMap.put(str, Integer.valueOf(i));
            List list = (List) ((HashMap) this.c).get(str);
            if (list == null || (w0 = CollectionsKt.w0(list)) == null) {
                return;
            }
            for (mlt mltVar : w0) {
                if (Intrinsics.d(str, "*")) {
                    mltVar.getClass();
                    valueOf = (Integer) this.g;
                } else {
                    valueOf = Integer.valueOf(i);
                }
                nlt v0 = v0(mltVar, valueOf);
                cr crVar = mltVar.a;
                jlt jltVar = mltVar.b;
                crVar.getClass();
                crVar.U(jltVar, v0);
            }
        }
    }

    public lcg Q(mzb mzbVar, wrh wrhVar, List list) {
        mzbVar.getClass();
        wrhVar.getClass();
        list.getClass();
        Continuation continuation = null;
        ssg.a(3, "SessionCallback", "onAddMediaItems(" + wrhVar + ", " + list + ")", null);
        ou7 ou7Var = (ou7) this.h;
        if (ou7Var != null) {
            ou7Var.g(null);
        }
        ou7 p = x97.p((tf6) this.g, null, null, new kun(list, this, continuation, 17), 3);
        this.h = p;
        x2f x2fVar = new x2f(p);
        p.R(new dae(15, x2fVar, p));
        return x2fVar;
    }

    public void S(u51 u51Var) {
        u51Var.getClass();
        z();
        int i = ArtistScreenActivity.w0;
        Context context = (Context) this.b;
        y7g.O(context, l48.p(context, u51Var, (PlaybackScope) this.e, null, 24));
    }

    public void T(x1u x1uVar, wmn wmnVar) {
        Activity activity = (Activity) this.b;
        x1uVar.getClass();
        ayk aykVar = (ayk) ((jyr) this.f).getValue();
        String str = x1uVar.a;
        if (aykVar.b(str, x1uVar.i)) {
            return;
        }
        xee a = ((g3u) ((jyr) this.i).getValue()).a();
        if (a instanceof f94) {
            jyr jyrVar = VideoClipActivity.y;
            activity.startActivity(l3l.d(activity, t75.c(str), 0, wmnVar));
        } else if (a instanceof e94) {
            new lum(activity).Q(((e94) a).j);
        } else {
            b6e.s();
        }
    }

    public synchronized void U(jlt jltVar, nlt nltVar) {
        if (Intrinsics.d((nlt) ((ConcurrentHashMap) this.d).get(jltVar), nltVar)) {
            return;
        }
        ((ConcurrentHashMap) this.d).put(jltVar, nltVar);
        llt lltVar = (llt) ((LinkedHashMap) this.f).get(jltVar);
        if (lltVar != null) {
            lltVar.a(new r3s(12, nltVar));
        }
    }

    public lcg V(mzb mzbVar, wrh wrhVar, alp alpVar, Bundle bundle) {
        mzbVar.getClass();
        wrhVar.getClass();
        bundle.getClass();
        StringBuilder sb = new StringBuilder("onCustomCommand(");
        sb.append(alpVar);
        v3w.m(sb, ")", 3, "SessionCallback", null);
        wkp wkpVar = (wkp) ((jyr) this.f).getValue();
        tf6 tf6Var = (tf6) this.g;
        wkpVar.getClass();
        tf6Var.getClass();
        ou7 p = x97.p(tf6Var, null, pm6.b, new lco(wkpVar, alpVar, mzbVar, (Continuation) null), 1);
        x2f x2fVar = new x2f(p);
        p.R(new dae(15, x2fVar, p));
        p.start();
        zgh zghVar = (zgh) this.c;
        String str = alpVar.b;
        str.getClass();
        y60 e = zghVar.e();
        String str2 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        arf g = tlm.g(bwf.c);
        Map map = (Map) g.getValue();
        ub ubVar = new ub();
        ubVar.c(new String[]{Constants.KEY_ACTION, "custom_command"}, str);
        map.put("MediaSession", ubVar.b());
        tlm.o(e, str2, g.isInitialized() ? (Map) g.getValue() : null);
        return x2fVar;
    }

    public int W(mzb mzbVar, wrh wrhVar, int i) {
        mzbVar.getClass();
        wrhVar.getClass();
        if (mzbVar.a().V0(i)) {
            v3w.k("onPlayerCommandRequest success ", i, 3, "SessionCallback", null);
            return 0;
        }
        v3w.k("onPlayerCommandRequest not supported ", i, 5, "SessionCallback", null);
        return -6;
    }

    public void X(mzb mzbVar, wrh wrhVar) {
        mzbVar.getClass();
        ssg.a(3, "SessionCallback", "onPostConnect(" + wrhVar + ")", null);
        List list = ((j9l) this.b).s.g;
        if (list.isEmpty()) {
            return;
        }
        vq1.y(list, "layout must not be null");
        i iVar = mzbVar.a;
        yde v = yde.v(list);
        if (iVar.j(wrhVar)) {
            lrl lrlVar = iVar.t;
            lrlVar.c = v;
            iVar.h.q0(lrlVar);
        }
        iVar.b(wrhVar, new gth(v, 0));
    }

    public lcg Y(mzb mzbVar, wrh wrhVar, String str, gin ginVar) {
        mzbVar.getClass();
        wrhVar.getClass();
        str.getClass();
        alp u0 = u0(ginVar, cxb.K(new Pair("com.yandex.music.session.MEDIA_ID", str)));
        if (u0 == null) {
            return leu.S(new ump(-6));
        }
        Bundle bundle = Bundle.EMPTY;
        bundle.getClass();
        return V(mzbVar, wrhVar, u0, bundle);
    }

    @Override // defpackage.r26
    public void a(List list, at5 at5Var) {
        Context context = (Context) this.b;
        list.getClass();
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new wn5(new fhm(list, at5Var, 0, (byte) 0), -296725610, true));
        ((LinearLayout) this.i).addView(composeView);
    }

    public void a0(mqs mqsVar, Function1 function1) {
        mqsVar.getClass();
        ljf ljfVar = (ljf) ((jyr) this.g).getValue();
        CardPlaybackScope p = d.p((nrf) this.e);
        ljfVar.getClass();
        ((e) ljfVar.e.getValue()).getClass();
        ru.yandex.music.common.media.context.c h = p.h();
        String t = weo.t();
        if (!ljfVar.a().c(h, mqsVar, false)) {
            function1.invoke(t);
            a0g.G(ljfVar.a, mqsVar, new ye(ljfVar, h, mqsVar, t, 21));
        } else if (ljfVar.a().i(false)) {
            function1.invoke(t);
        }
    }

    public void b0(mqs mqsVar) {
        mqsVar.getClass();
        ljf ljfVar = (ljf) ((jyr) this.g).getValue();
        muo muoVar = muo.LANDING;
        CardPlaybackScope p = d.p((nrf) this.e);
        ljfVar.getClass();
        rre.Z(mqsVar, new zus(0), y5g.B0(mqsVar, ryt.a), new ve(muoVar, zqt.d), ljfVar.a, ljfVar.b, ljfVar.c, p, null, null, null, 1792);
    }

    @Override // defpackage.r26
    public q26 c() {
        cr crVar = new cr((LinearLayout) this.i);
        ((LinearLayout) this.i).addView((View) crVar.b);
        return crVar;
    }

    public void c0(oq oqVar) {
        oqVar.getClass();
        z();
        Context context = (Context) this.b;
        r1n r1nVar = r1n.b;
        LinkedList linkedList = oqVar.F;
        ru.yandex.music.common.media.context.c cVar = (ru.yandex.music.common.media.context.c) this.f;
        Object value = ((arf) this.g).getValue();
        value.getClass();
        kxi kxiVar = (kxi) this.d;
        new j2n(context, kxiVar.a, r1nVar, new m2n(oqVar, linkedList, cVar, (String) value, kxiVar), true).m();
    }

    public void d0(oq oqVar) {
        oqVar.getClass();
        z();
        Context context = (Context) this.b;
        y yVar = (y) this.c;
        mvp mvpVar = (mvp) ((jyr) this.i).getValue();
        pu0 t = pd.t(new qzm[0]);
        fnb fnbVar = ((kxi) this.d).a;
        mvpVar.getClass();
        yVar.getClass();
        context.getClass();
        fnbVar.getClass();
        if (oqVar.d) {
            o8q o8qVar = mvpVar.c;
            mvpVar.b.getClass();
            o8qVar.getClass();
            zwp zwpVar = new zwp(new dxp(oqVar.a, oqVar.d()), oqVar.D, oqVar.b, (oqVar.j() == lq.b || oqVar.d() == Album$AlbumType.PODCAST) ? "" : men.r(oqVar, o8qVar));
            sai saiVar = new sai(false);
            cvo cvoVar = cvo.i;
            e3s.X(o6m.b(wjb.ShareScreen, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t, mvpVar, zwpVar, saiVar, context, yVar, fnbVar, 4), 1326092232, true), 48);
        }
    }

    @Override // defpackage.r26
    public void e(us5 us5Var, aw5 aw5Var) {
        ny5 ny5Var;
        String str = us5Var.o;
        jyr jyrVar = sht.a;
        int b = frv.b();
        if (str == null) {
            ny5Var = null;
        } else {
            ny5Var = new ny5(str.replace("%%", b + StringUtils.COMMA + (b / 2)), us5Var.j, ywf.B(us5Var.i, us5Var.k, ", "), us5Var.b);
        }
        if (ny5Var == null) {
            return;
        }
        Context context = (Context) this.b;
        context.getClass();
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(new wn5(new ay5(ny5Var, aw5Var, 0), 1926678335, true));
        ((LinearLayout) this.i).addView(composeView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004d, code lost:
    
        if (r10 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e0(String str, f7u f7uVar, cg6 cg6Var) {
        ign ignVar;
        int i;
        x7u x7uVar;
        f7u f7uVar2;
        rj6 rj6Var;
        bjt bjtVar = (bjt) this.d;
        if (cg6Var instanceof ign) {
            ignVar = (ign) cg6Var;
            int i2 = ignVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ignVar.n = i2 - Integer.MIN_VALUE;
                Object obj = ignVar.l;
                nm6 nm6Var = nm6.a;
                i = ignVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ignVar.j = str;
                    ignVar.k = f7uVar;
                    ignVar.n = 1;
                    obj = bjtVar.e(ignVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f7uVar2 = ignVar.k;
                        qgg.h0(obj);
                        rj6Var = (rj6) obj;
                        if (!(rj6Var instanceof qj6)) {
                            x7uVar = (x7u) ((qj6) rj6Var).a;
                            f7uVar = f7uVar2;
                        } else {
                            if (!(rj6Var instanceof pj6)) {
                                b6e.s();
                                return null;
                            }
                            ssg.a(6, "RadioPlaybackImpl", "Synchronous queue prolongation failed", ((pj6) rj6Var).a());
                            f7uVar = f7uVar2;
                            x7uVar = null;
                        }
                        if (x7uVar != null) {
                            return f7uVar.j(x7uVar);
                        }
                        return null;
                    }
                    f7uVar = ignVar.k;
                    str = ignVar.j;
                    qgg.h0(obj);
                }
                x7uVar = (x7u) obj;
                if (x7uVar == null) {
                    ignVar.j = null;
                    ignVar.k = f7uVar;
                    ignVar.n = 2;
                    obj = bjtVar.g(str, f7uVar, ignVar);
                    if (obj != nm6Var) {
                        f7uVar2 = f7uVar;
                        rj6Var = (rj6) obj;
                        if (!(rj6Var instanceof qj6)) {
                        }
                    }
                    return nm6Var;
                }
                if (x7uVar != null) {
                }
            }
        }
        ignVar = new ign(this, cg6Var);
        Object obj2 = ignVar.l;
        nm6 nm6Var2 = nm6.a;
        i = ignVar.n;
        if (i != 0) {
        }
        x7uVar = (x7u) obj2;
        if (x7uVar == null) {
        }
        if (x7uVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f0(mm6 mm6Var, cg6 cg6Var) {
        x1o x1oVar;
        int i;
        mm6 mm6Var2;
        w2f w2fVar;
        mm6 mm6Var3;
        w2f w2fVar2;
        if (cg6Var instanceof x1o) {
            x1oVar = (x1o) cg6Var;
            int i2 = x1oVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x1oVar.n = i2 - Integer.MIN_VALUE;
                Object obj = x1oVar.l;
                nm6 nm6Var = nm6.a;
                i = x1oVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    w2f p = saf.p();
                    w2f w2fVar3 = (w2f) this.e;
                    if (w2fVar3 == null) {
                        mm6Var2 = mm6Var;
                        w2fVar = p;
                        this.e = w2fVar;
                        this.d = bg3.i(mm6Var2, w2fVar, 2, (kin) this.i, (b51) this.h, 4);
                        return Unit.a;
                    }
                    x1oVar.j = mm6Var;
                    x1oVar.k = p;
                    x1oVar.n = 1;
                    if (saf.C(w2fVar3, x1oVar) == nm6Var) {
                        return nm6Var;
                    }
                    mm6Var3 = mm6Var;
                    w2fVar2 = p;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w2fVar2 = x1oVar.k;
                    mm6Var3 = x1oVar.j;
                    qgg.h0(obj);
                }
                w2fVar = w2fVar2;
                mm6Var2 = mm6Var3;
                this.e = w2fVar;
                this.d = bg3.i(mm6Var2, w2fVar, 2, (kin) this.i, (b51) this.h, 4);
                return Unit.a;
            }
        }
        x1oVar = new x1o(this, cg6Var);
        Object obj2 = x1oVar.l;
        nm6 nm6Var2 = nm6.a;
        i = x1oVar.n;
        if (i != 0) {
        }
        w2fVar = w2fVar2;
        mm6Var2 = mm6Var3;
        this.e = w2fVar;
        this.d = bg3.i(mm6Var2, w2fVar, 2, (kin) this.i, (b51) this.h, 4);
        return Unit.a;
    }

    @Override // defpackage.r26
    public void g(us5 us5Var) {
        ((TextView) this.h).setText(us5Var.c);
        i4w.O((ImageView) this.f, us5Var.r, 0);
    }

    public void g0() {
        ((qdc) this.b).H("GlideBitmapDownloader", "release", null, new Object[0]);
        b1o b1oVar = (b1o) this.h;
        synchronized (b1oVar) {
            fmq fmqVar = b1oVar.d;
            fmqVar.b = true;
            Iterator it = xut.e((Set) fmqVar.c).iterator();
            while (it.hasNext()) {
                e0o e0oVar = (e0o) it.next();
                if (e0oVar.isRunning() || e0oVar.e()) {
                    e0oVar.clear();
                    ((HashSet) fmqVar.d).add(e0oVar);
                }
            }
        }
        this.g = null;
    }

    @Override // defpackage.adu
    public View getRoot() {
        throw null;
    }

    @Override // defpackage.r26
    public void h(boolean z) {
        View view = (View) this.c;
        jyr jyrVar = sht.a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public Object h0(String str, String str2, String str3, z77 z77Var, aur aurVar) {
        Object j0 = x97.y((tf6) this.g, (a) this.h, null, new r60(this, str, str2, str3, z77Var, null, 0), 2).j0(aurVar);
        return j0 == nm6.a ? j0 : Unit.a;
    }

    public void i0() {
        f8j f8jVar = (f8j) this.d;
        ane aneVar = (ane) this.c;
        while (f8jVar != aneVar) {
            f8jVar.l1();
            f8jVar = f8jVar.m;
            f8jVar.getClass();
        }
        aneVar.l1();
        for (xci xciVar = (xci) this.f; xciVar != null; xciVar = xciVar.f) {
            xciVar.O0();
            if (xciVar.i) {
                cpi cpiVar = g8j.a;
                if (!xciVar.n) {
                    sme.b("autoInvalidateInsertedNode called on unattached node");
                }
                g8j.a(xciVar, -1, 1);
            }
            if (xciVar.j) {
                g8j.c(xciVar);
            }
            xciVar.i = false;
            xciVar.j = false;
        }
    }

    public void j0() {
        for (xci xciVar = (i4s) this.e; xciVar != null; xciVar = xciVar.e) {
            if (xciVar.n) {
                xciVar.P0();
            }
        }
        f8j f8jVar = (ane) this.c;
        f8j f8jVar2 = (f8j) this.d;
        while (f8jVar != f8jVar2) {
            tzj tzjVar = f8jVar.F;
            if (tzjVar != null) {
                tzjVar.destroy();
            }
            f8jVar.F = null;
            f8jVar = f8jVar.n;
            f8jVar.getClass();
        }
        tzj tzjVar2 = f8jVar2.F;
        if (tzjVar2 != null) {
            tzjVar2.destroy();
        }
        f8jVar2.F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:12:0x0057, B:14:0x005f, B:15:0x0066, B:18:0x006f), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k0(cg6 cg6Var) {
        tgn tgnVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof tgn) {
                tgnVar = (tgn) cg6Var;
                int i2 = tgnVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tgnVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = tgnVar.k;
                    nm6 nm6Var = nm6.a;
                    i = tgnVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        sgn sgnVar = (sgn) this.h;
                        if (sgnVar != sgn.a) {
                            return Boolean.valueOf(sgnVar == sgn.b);
                        }
                        qqi qqiVar2 = (qqi) this.g;
                        tgnVar.j = qqiVar2;
                        tgnVar.m = 1;
                        if (qqiVar2.a(tgnVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = tgnVar.j;
                        qgg.h0(obj);
                    }
                    if (((sgn) this.h) == sgn.a) {
                        this.h = sgn.c;
                    }
                    Boolean valueOf = Boolean.valueOf(((sgn) this.h) == sgn.b);
                    qqiVar.b(null);
                    return valueOf;
                }
            }
            if (((sgn) this.h) == sgn.a) {
            }
            Boolean valueOf2 = Boolean.valueOf(((sgn) this.h) == sgn.b);
            qqiVar.b(null);
            return valueOf2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        tgnVar = new tgn(this, cg6Var);
        Object obj2 = tgnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = tgnVar.m;
        if (i != 0) {
        }
    }

    @Override // defpackage.q26
    public void l(boolean z) {
        TextView textView = (TextView) this.i;
        jyr jyrVar = sht.a;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l0(cg6 cg6Var) {
        ugn ugnVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof ugn) {
                ugnVar = (ugn) cg6Var;
                int i2 = ugnVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ugnVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = ugnVar.k;
                    nm6 nm6Var = nm6.a;
                    i = ugnVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        sgn sgnVar = (sgn) this.h;
                        if (sgnVar != sgn.a) {
                            return Boolean.valueOf(sgnVar == sgn.b);
                        }
                        qqi qqiVar2 = (qqi) this.g;
                        ugnVar.j = qqiVar2;
                        ugnVar.m = 1;
                        if (qqiVar2.a(ugnVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = ugnVar.j;
                        qgg.h0(obj);
                    }
                    return Boolean.valueOf(((sgn) this.h) == sgn.b);
                }
            }
            return Boolean.valueOf(((sgn) this.h) == sgn.b);
        } finally {
            qqiVar.b(null);
        }
        ugnVar = new ugn(this, cg6Var);
        Object obj2 = ugnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ugnVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0195, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019a, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a4, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
    
        if (r11 <= r15) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a8, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b4, code lost:
    
        if (r6.a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b6, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c1, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c5, code lost:
    
        if (r24 == 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c7, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c9, code lost:
    
        if (r11 < r12) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cb, code lost:
    
        if (r11 > r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d1, code lost:
    
        if (r16[r17 + r11] < r14) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d3, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bd, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0198, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0191, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017f, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0172, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026e, code lost:
    
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0158, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014e, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0156, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015a, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015b, code lost:
    
        if (r13 > r1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015d, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0161, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0174, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0186, code lost:
    
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018c, code lost:
    
        if (r1 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018e, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0193, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n0(int i, eqi eqiVar, eqi eqiVar2, xci xciVar, boolean z) {
        int i2;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ps1 ps1Var = (ps1) this.i;
        if (ps1Var == null) {
            ps1Var = new ps1();
            ps1Var.f = this;
            ps1Var.c = xciVar;
            ps1Var.a = i;
            ps1Var.d = eqiVar;
            ps1Var.e = eqiVar2;
            ps1Var.b = z;
            this.i = ps1Var;
        } else {
            ps1Var.c = xciVar;
            ps1Var.a = i;
            ps1Var.d = eqiVar;
            ps1Var.e = eqiVar2;
            ps1Var.b = z;
        }
        cr crVar = (cr) ps1Var.f;
        int i8 = eqiVar.c - i;
        int i9 = eqiVar2.c - i;
        char c3 = 2;
        int i10 = ((i8 + i9) + 1) / 2;
        iqe iqeVar = new iqe(i10 * 3);
        iqe iqeVar2 = new iqe(i10 * 4);
        int i11 = 0;
        iqeVar2.f(0, i8, 0, i9);
        int i12 = (i10 * 2) + 1;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[5];
        while (true) {
            int i13 = iqeVar2.b;
            if (i13 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = iqeVar2.a;
            int i14 = i11;
            int i15 = i13 - 1;
            iqeVar2.b = i15;
            int i16 = iArr6[i15];
            int i17 = i13 - 2;
            iqeVar2.b = i17;
            int i18 = iArr6[i17];
            int i19 = i13 - 3;
            iqeVar2.b = i19;
            int i20 = iArr6[i19];
            int i21 = i13 - 4;
            iqeVar2.b = i21;
            int i22 = iArr6[i21];
            int i23 = i20 - i22;
            int i24 = i12;
            int i25 = i16 - i18;
            int[] iArr7 = iArr3;
            if (i23 >= 1 && i25 >= 1) {
                int i26 = 1;
                int i27 = ((i23 + i25) + 1) / 2;
                int i28 = i24 / 2;
                int i29 = i28 + 1;
                iArr7[i29] = i22;
                iArr4[i29] = i20;
                int i30 = i14;
                while (i30 < i27) {
                    int i31 = i23 - i25;
                    int i32 = i27;
                    iArr = iArr4;
                    int i33 = -i30;
                    int i34 = (Math.abs(i31) & 1) == i26 ? 1 : i14;
                    int i35 = i33;
                    while (true) {
                        if (i35 > i30) {
                            break;
                        }
                        if (i35 != i33) {
                            if (i35 != i30) {
                                i3 = i35;
                                iArr2 = iArr5;
                            } else {
                                i3 = i35;
                                iArr2 = iArr5;
                            }
                            i4 = iArr7[(i3 - 1) + i28];
                            i5 = i4 + 1;
                            int i36 = ((i5 - i22) + i18) - i3;
                            int i37 = i36 - ((i30 == 0 ? 1 : i14) & (i5 != i4 ? 1 : i14));
                            int i38 = i4;
                            i6 = i36;
                            while (i5 < i20 && i6 < i16 && ps1Var.a(i5, i6)) {
                                i5++;
                                i6++;
                            }
                            iArr7[i28 + i3] = i5;
                            if (i34 == 0) {
                                int i39 = i6;
                                int i40 = i31 - i3;
                                i7 = i23;
                                if (i40 >= i33 + 1 && i40 <= i30 - 1 && iArr[i28 + i40] <= i5) {
                                    iArr2[i14] = i38;
                                    iArr2[1] = i37;
                                    iArr2[c4] = i5;
                                    iArr2[3] = i39;
                                    iArr2[4] = i14;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i7 = i23;
                            }
                            i35 = i3 + 2;
                            iArr5 = iArr2;
                            i23 = i7;
                        } else {
                            i3 = i35;
                            iArr2 = iArr5;
                        }
                        i4 = iArr7[i3 + 1 + i28];
                        i5 = i4;
                        int i362 = ((i5 - i22) + i18) - i3;
                        int i372 = i362 - ((i30 == 0 ? 1 : i14) & (i5 != i4 ? 1 : i14));
                        int i382 = i4;
                        i6 = i362;
                        while (i5 < i20) {
                            i5++;
                            i6++;
                        }
                        iArr7[i28 + i3] = i5;
                        if (i34 == 0) {
                        }
                        i35 = i3 + 2;
                        iArr5 = iArr2;
                        i23 = i7;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i14], iArr2[3] - iArr2[c]) > 0) {
                        int i41 = iArr2[i14];
                        int i42 = iArr2[c];
                        int i43 = iArr2[3] - i42;
                        int i44 = iArr2[c4] - i41;
                        if (i43 != i44) {
                            i44 = Math.min(i44, i43);
                            int i45 = iArr2[4];
                            int i46 = i45 != 0 ? 1 : i14;
                            int i47 = iArr2[3];
                            c2 = 1;
                            int i48 = iArr2[1];
                            int i49 = i47 - i48;
                            int i50 = iArr2[c4];
                            int i51 = iArr2[i14];
                            int i52 = i41 + (((i49 > i50 - i51 ? 1 : i14) | i46) ^ 1);
                            i42 += (((i47 - i48 > i50 - i51 ? 1 : i14) ^ 1) | (i45 != 0 ? 1 : i14)) ^ 1;
                            i41 = i52;
                        } else {
                            c2 = 1;
                        }
                        iqeVar.e(i41, i42, i44);
                    } else {
                        c2 = c;
                    }
                    iqeVar2.f(i22, iArr2[i14], i18, iArr2[c2]);
                    iqeVar2.f(iArr2[c4], i20, iArr2[3], i16);
                    c3 = c4;
                    i11 = i14;
                    i12 = i24;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i11 = i14;
            i12 = i24;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i53 = i11;
        int i54 = iqeVar.b;
        if (i54 % 3 != 0) {
            sme.b("Array size not a multiple of 3");
        }
        if (i54 > 3) {
            i2 = i53;
            iqeVar.g(i2, i54 - 3);
        } else {
            i2 = i53;
        }
        iqeVar.e(i8, i9, i2);
        int i55 = i2;
        int i56 = i55;
        int i57 = i56;
        while (i55 < iqeVar.b) {
            int[] iArr8 = iqeVar.a;
            int i58 = iArr8[i55];
            int i59 = iArr8[i55 + 2];
            int i60 = i58 - i59;
            int i61 = iArr8[i55 + 1] - i59;
            i55 += 3;
            while (i56 < i60) {
                xci xciVar2 = ((xci) ps1Var.c).f;
                xciVar2.getClass();
                if ((xciVar2.c & 2) != 0) {
                    f8j f8jVar = xciVar2.h;
                    f8jVar.getClass();
                    f8j f8jVar2 = f8jVar.n;
                    f8j f8jVar3 = f8jVar.m;
                    f8jVar3.getClass();
                    if (f8jVar2 != null) {
                        f8jVar2.m = f8jVar3;
                    }
                    f8jVar3.n = f8jVar2;
                    k(crVar, (xci) ps1Var.c, f8jVar3);
                }
                ps1Var.c = x(xciVar2);
                i56++;
            }
            while (i57 < i61) {
                xci t = t((wci) ((eqi) ps1Var.e).a[ps1Var.a + i57], (xci) ps1Var.c);
                ps1Var.c = t;
                if (ps1Var.b) {
                    xci xciVar3 = t.f;
                    xciVar3.getClass();
                    f8j f8jVar4 = xciVar3.h;
                    f8jVar4.getClass();
                    epf r = bcx.r((xci) ps1Var.c);
                    if (r != null) {
                        gpf gpfVar = new gpf((mpf) crVar.b, r);
                        ((xci) ps1Var.c).R0(gpfVar);
                        k(crVar, (xci) ps1Var.c, gpfVar);
                        gpfVar.n = f8jVar4.n;
                        gpfVar.m = f8jVar4;
                        f8jVar4.n = gpfVar;
                    } else {
                        ((xci) ps1Var.c).R0(f8jVar4);
                    }
                    ((xci) ps1Var.c).I0();
                    ((xci) ps1Var.c).O0();
                    xci xciVar4 = (xci) ps1Var.c;
                    cpi cpiVar = g8j.a;
                    if (!xciVar4.n) {
                        sme.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    g8j.a(xciVar4, -1, 1);
                } else {
                    t.i = true;
                }
                i57++;
            }
            while (true) {
                int i62 = i59 - 1;
                if (i59 > 0) {
                    xci xciVar5 = ((xci) ps1Var.c).f;
                    xciVar5.getClass();
                    ps1Var.c = xciVar5;
                    eqi eqiVar3 = (eqi) ps1Var.d;
                    int i63 = ps1Var.a;
                    wci wciVar = (wci) eqiVar3.a[i63 + i56];
                    wci wciVar2 = (wci) ((eqi) ps1Var.e).a[i63 + i57];
                    if (!Intrinsics.d(wciVar, wciVar2)) {
                        w0(wciVar, wciVar2, (xci) ps1Var.c);
                    }
                    i56++;
                    i57++;
                    i59 = i62;
                }
            }
        }
        int i64 = i2;
        for (xci xciVar6 = ((i4s) this.e).e; xciVar6 != null && xciVar6 != a8j.a; xciVar6 = xciVar6.e) {
            i64 |= xciVar6.c;
            xciVar6.d = i64;
        }
    }

    public void q0() {
        gpf gpfVar;
        mpf mpfVar = (mpf) this.b;
        f8j f8jVar = (ane) this.c;
        for (xci xciVar = ((i4s) this.e).e; xciVar != null; xciVar = xciVar.e) {
            epf r = bcx.r(xciVar);
            if (r != null) {
                f8j f8jVar2 = xciVar.h;
                if (f8jVar2 != null) {
                    gpf gpfVar2 = (gpf) f8jVar2;
                    epf epfVar = gpfVar2.X;
                    gpfVar2.B1(r);
                    gpfVar = gpfVar2;
                    if (epfVar != xciVar) {
                        tzj tzjVar = gpfVar2.F;
                        gpfVar = gpfVar2;
                        if (tzjVar != null) {
                            tzjVar.invalidate();
                            gpfVar = gpfVar2;
                        }
                    }
                } else {
                    gpf gpfVar3 = new gpf(mpfVar, r);
                    xciVar.R0(gpfVar3);
                    gpfVar = gpfVar3;
                }
                f8jVar.n = gpfVar;
                gpfVar.m = f8jVar;
                f8jVar = gpfVar;
            } else {
                xciVar.R0(f8jVar);
            }
        }
        mpf u = mpfVar.u();
        f8jVar.n = u != null ? (ane) u.F.c : null;
        this.d = f8jVar;
    }

    public jdv s(ndv ndvVar) {
        ldv ldvVar = new ldv(this, ndvVar);
        ndvVar.b.add(ldvVar);
        k0j k0jVar = new k0j(2, ndvVar, ldvVar);
        LinkedHashSet u = u();
        ((ArrayList) this.b).add(ndvVar);
        Iterator it = wop.h(u(), u).iterator();
        while (it.hasNext()) {
            List list = (List) ((HashMap) this.c).get((String) it.next());
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((mlt) it2.next()).a();
                }
            }
        }
        return new jdv(k0jVar, this, ndvVar);
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb = new StringBuilder("[");
                xci xciVar = (xci) this.f;
                i4s i4sVar = (i4s) this.e;
                if (xciVar == i4sVar) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (xciVar != null && xciVar != i4sVar) {
                            sb.append(String.valueOf(xciVar));
                            if (xciVar.f == i4sVar) {
                                sb.append("]");
                            } else {
                                sb.append(StringUtils.COMMA);
                                xciVar = xciVar.f;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet u() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ndv) it.next()).a);
        }
        linkedHashSet.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair F = hld.F(((ndv) it2.next()).a);
            if (F != null) {
                arrayList3.add(F);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) it3.next();
            z75.t(arrayList4, u75.h(pair.a, pair.b));
        }
        linkedHashSet.addAll(arrayList4);
        if (linkedHashSet.contains("*")) {
            Set keySet = ((HashMap) this.c).keySet();
            keySet.getClass();
            linkedHashSet.addAll(keySet);
        }
        return linkedHashSet;
    }

    @Override // defpackage.q26
    public void v(v13 v13Var) {
        ((TextView) this.i).setOnClickListener(new ol(5, v13Var));
    }

    public nlt v0(mlt mltVar, Integer num) {
        mltVar.getClass();
        return new nlt((Integer) this.g, num, (Integer) this.f, (f9h) this.h, (f9h) this.i);
    }

    @Override // defpackage.q26
    public void y(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        ((TextView) this.f).setText(str4);
        ((TextView) this.c).setText(str.toLowerCase());
        ((TextView) this.d).setText(str2);
        ((TextView) this.e).setText(str3.toLowerCase());
        ((TextView) this.g).setText(str5);
        View view = (View) this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(StringUtil.SPACE);
        sb.append(str5);
        sb.append(StringUtil.SPACE);
        sb.append(str7);
        sb.append(StringUtil.SPACE);
        sb.append(str6 != null ? str6 : "");
        view.setContentDescription(sb.toString());
        ((TextView) this.i).setText(str8);
        TextView textView = (TextView) this.h;
        if (str6 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str6);
            ((TextView) this.h).setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y0(f7u f7uVar, cg6 cg6Var) {
        lgn lgnVar;
        int i;
        if (cg6Var instanceof lgn) {
            lgnVar = (lgn) cg6Var;
            int i2 = lgnVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lgnVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lgnVar.k;
                Object obj2 = nm6.a;
                i = lgnVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    lgnVar.j = f7uVar;
                    lgnVar.m = 1;
                    obj = K(lgnVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f7uVar = lgnVar.j;
                    qgg.h0(obj);
                }
                x7u x7uVar = (x7u) obj;
                return x7uVar == null ? f7uVar.j(x7uVar) : f7uVar;
            }
        }
        lgnVar = new lgn(this, cg6Var);
        Object obj3 = lgnVar.k;
        Object obj22 = nm6.a;
        i = lgnVar.m;
        if (i != 0) {
        }
        x7u x7uVar2 = (x7u) obj3;
        if (x7uVar2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ezc, kotlin.jvm.functions.Function0] */
    public void z() {
        ((ezc) this.h).invoke();
    }

    public cr(ozi oziVar, lxf lxfVar) {
        this.a = 21;
        this.b = oziVar;
        this.c = lxfVar;
        this.d = new h2q(this);
        this.e = new q2q(this, 0);
        this.f = oziVar.c;
        this.g = oziVar.e;
        this.i = btf.b(new q2q(this, 1));
        this.h = oziVar.f;
    }

    public cr(Context context, ygh yghVar, yb ybVar) {
        this.a = 19;
        bwf bwfVar = bwf.c;
        this.b = btf.a(bwfVar, new vw1(context, yghVar, 15));
        this.c = btf.a(bwfVar, new vw1(context, yghVar, 16));
        this.d = btf.a(bwfVar, new vw1(context, yghVar, ybVar, 17));
        this.e = btf.a(bwfVar, new vw1(context, yghVar, ybVar, 18));
        this.f = btf.a(bwfVar, new vw1(context, yghVar, ybVar, 19));
        this.g = btf.a(bwfVar, new vw1(context, yghVar, ybVar, 20));
        this.h = btf.a(bwfVar, new vw1(context, ybVar, yghVar, 21));
        this.i = btf.a(bwfVar, new vw1(context, ybVar, yghVar, 22));
    }

    public cr(Context context, j31 j31Var, Locale locale, l3l l3lVar) {
        this.a = 3;
        context.getClass();
        j31Var.getClass();
        locale.getClass();
        l3lVar.getClass();
        this.b = context;
        this.c = j31Var;
        this.d = locale;
        this.e = l3lVar;
        this.f = new c5p("HH:mm", locale);
        this.g = new c5p("E", locale);
        DateTimeFormatter.ofPattern("EEEE", locale);
        this.h = new c5p("MMM", locale);
        DateTimeFormatter.ofPattern("MMMM", locale);
        DateTimeFormatter.ofPattern("dd MMMM", locale);
        DateTimeFormatter.ofPattern("EEEE dd MMMM ", locale);
        this.i = new c5p("dd MMMM EEEE", locale);
    }

    public cr(PlaybackScope playbackScope, y yVar, kxi kxiVar, dda ddaVar, ru0 ru0Var) {
        this.a = 24;
        playbackScope.getClass();
        yVar.getClass();
        kxiVar.getClass();
        this.e = playbackScope;
        this.c = yVar;
        this.d = kxiVar;
        this.b = ddaVar;
        this.f = ru0Var;
        bdt I = hag.I(k68.class);
        l18 l18Var = l18.b;
        this.i = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(l0t.class), true);
        this.h = l18Var.b(hag.I(nmj.class), true);
    }

    public cr(vw6 vw6Var) {
        this.a = 27;
        vw6Var.getClass();
        this.b = vw6Var;
        this.i = btf.b(new law(1));
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: kbw
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                cr crVar = this.b;
                switch (i2) {
                    case 0:
                        return yat.c(crVar.I());
                    default:
                        X509TrustManager I = crVar.I();
                        jyr jyrVar = yat.a;
                        I.getClass();
                        try {
                            Method declaredMethod = I.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
                            declaredMethod.setAccessible(true);
                            return declaredMethod;
                        } catch (NoSuchMethodException unused) {
                            return null;
                        }
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: kbw
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                cr crVar = this.b;
                switch (i22) {
                    case 0:
                        return yat.c(crVar.I());
                    default:
                        X509TrustManager I = crVar.I();
                        jyr jyrVar = yat.a;
                        I.getClass();
                        try {
                            Method declaredMethod = I.getClass().getDeclaredMethod("isSameTrustConfiguration", String.class, String.class);
                            declaredMethod.setAccessible(true);
                            return declaredMethod;
                        } catch (NoSuchMethodException unused) {
                            return null;
                        }
                }
            }
        });
        this.h = new Object();
    }

    public cr(String str, String str2, File file, c5m c5mVar, i5f i5fVar, tf6 tf6Var, a aVar) {
        this.a = 1;
        str.getClass();
        aVar.getClass();
        this.b = str;
        this.c = str2;
        this.d = file;
        this.e = c5mVar;
        this.f = i5fVar;
        this.g = tf6Var;
        this.h = aVar;
        this.i = rqi.a();
    }

    public cr(int i) {
        this.a = i;
        switch (i) {
            case 10:
                break;
            case 26:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                this.d = new LinkedHashMap();
                this.e = new LinkedHashMap();
                this.f = new LinkedHashMap();
                this.g = new LinkedHashMap();
                this.i = new LinkedHashSet();
                break;
        }
    }

    public cr(g gVar, u uVar, com.yandex.plus.home.internal.di.e eVar, com.yandex.plus.home.internal.di.d dVar, l lVar, b bVar, com.yandex.plus.domain.auth.impl.i iVar, com.yandex.plus.home.api.b bVar2) {
        this.a = 29;
        uVar.getClass();
        eVar.getClass();
        dVar.getClass();
        lVar.getClass();
        bVar.getClass();
        iVar.getClass();
        bVar2.getClass();
        this.b = gVar;
        this.c = uVar;
        this.d = eVar;
        this.e = dVar;
        this.f = lVar;
        this.g = bVar;
        this.h = iVar;
        this.i = bVar2;
    }

    public cr(String str, f7u f7uVar, xdr xdrVar, c0t c0tVar, bjt bjtVar, a aVar) {
        this.a = 17;
        this.b = str;
        this.c = f7uVar;
        this.d = xdrVar;
        this.e = c0tVar;
        tf6 e = gld.e(kotlin.coroutines.e.c(a4g.n(), aVar));
        this.f = e;
        this.g = rqi.a();
        this.h = sgn.a;
        this.i = x97.p(e, null, null, new av7(bjtVar, this, (Continuation) null, 2), 3);
    }

    public cr(bsn bsnVar, j6e j6eVar) {
        this.a = 18;
        this.b = bsnVar;
        this.c = j6eVar;
        x0q b = y0q.b(0, 0, null, 7);
        this.f = b;
        this.g = b;
        this.h = new b51(this, (Continuation) null, 4);
        this.i = new kin(22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cr(Context context, y yVar, kxi kxiVar, PlaybackScope playbackScope, ru.yandex.music.common.media.context.c cVar, arf arfVar, Function0 function0) {
        this.a = 0;
        context.getClass();
        yVar.getClass();
        playbackScope.getClass();
        arfVar.getClass();
        this.b = context;
        this.c = yVar;
        this.d = kxiVar;
        this.e = playbackScope;
        this.f = cVar;
        this.g = arfVar;
        this.h = (ezc) function0;
        this.i = l18.b.b(hag.I(mvp.class), true);
    }

    public cr(vbv vbvVar) {
        this.a = 23;
        this.b = vbvVar;
        MessengerParams messengerParams = vbvVar.g;
        this.c = vbvVar.s;
        this.d = new ConcurrentHashMap();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashMap();
        this.g = new f5r(13, this);
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    public cr(Context context, String str) {
        this.a = 15;
        context.getClass();
        str.getClass();
        this.b = context;
        this.c = str;
        bdt I = hag.I(c9k.class);
        l18 l18Var = l18.b;
        this.i = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(ioi.class), true);
        yiq yiqVar = new yiq();
        this.f = yiqVar;
        this.g = hld.k(yiqVar, dm6.b());
        this.h = new d4n(0, this);
    }

    public cr(es6 es6Var, eps epsVar, jyr jyrVar, aaw aawVar, zzp zzpVar, jyr jyrVar2) {
        this.a = 22;
        this.b = es6Var;
        this.c = epsVar;
        this.d = aawVar;
        this.e = zzpVar;
        this.i = jyrVar2;
        this.f = jyrVar;
        this.g = new jtc(22);
        this.h = xae.a;
        Iterator it = w9l.a.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cr(ViewGroup viewGroup) {
        this.a = 4;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_concert_header, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.day_of_week);
        this.d = (TextView) inflate.findViewById(R.id.day_of_month);
        this.e = (TextView) inflate.findViewById(R.id.month);
        this.f = (TextView) inflate.findViewById(R.id.concert_title);
        this.g = (TextView) inflate.findViewById(R.id.concert_brief_info);
        this.h = (TextView) inflate.findViewById(R.id.concert_cashback_info);
        this.i = (TextView) inflate.findViewById(R.id.purchase_ticket);
        TextView textView = (TextView) this.f;
        if (Build.VERSION.SDK_INT >= 27) {
            fx1.n(textView);
        } else if (textView instanceof oa2) {
            ((oa2) textView).setAutoSizeTextTypeWithDefaults(1);
        }
    }

    public cr(hgp hgpVar, Context context, nfw nfwVar, ydw ydwVar, y8p y8pVar, vy7 vy7Var, anw anwVar, dgw dgwVar, hnw hnwVar, vtm vtmVar, elw elwVar, ifw ifwVar) {
        this.a = 28;
        y8pVar.getClass();
        vy7Var.getClass();
        vtmVar.getClass();
        this.c = hgpVar;
        this.b = context;
        this.d = ydwVar;
        this.e = y8pVar;
        this.f = vy7Var;
        this.g = dgwVar;
        this.h = vtmVar;
        this.i = btf.b(new dxv(18, this));
    }

    public cr(Activity activity, y yVar, kxi kxiVar, nrf nrfVar) {
        this.a = 9;
        activity.getClass();
        yVar.getClass();
        kxiVar.getClass();
        this.b = activity;
        this.c = yVar;
        this.d = kxiVar;
        this.e = nrfVar;
        this.i = btf.b(new sxd(14));
        final int i = 0;
        this.f = btf.b(new Function0(this) { // from class: j0f
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ayk((Activity) this.b.b);
                    default:
                        cr crVar = this.b;
                        return new ljf((Activity) crVar.b, (y) crVar.c, (kxi) crVar.d);
                }
            }
        });
        final int i2 = 1;
        this.g = btf.b(new Function0(this) { // from class: j0f
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ayk((Activity) this.b.b);
                    default:
                        cr crVar = this.b;
                        return new ljf((Activity) crVar.b, (y) crVar.c, (kxi) crVar.d);
                }
            }
        });
        this.h = l18.b.b(hag.I(x0h.class), true);
    }

    public cr(qdc qdcVar, qdc qdcVar2, xiu xiuVar, xiu xiuVar2, t tVar, apo apoVar) {
        this.a = 8;
        tVar.getClass();
        this.b = qdcVar;
        this.c = qdcVar2;
        this.d = xiuVar;
        this.e = xiuVar2;
        this.f = apoVar;
        this.g = tVar;
        ecg ecgVar = fcg.a;
        b1o g = com.bumptech.glide.a.a(tVar).e.g(tVar);
        g.getClass();
        this.h = g;
        this.i = new cag(qdcVar, tVar, g, new pv9(8, this));
        qdcVar.H("GlideBitmapDownloader", "init", "Created with 5 preload count.", new Object[0]);
        if (apoVar != null) {
            qdcVar.H("GlideBitmapDownloader", "init", "Using workhelper.", new Object[0]);
        }
        kma kmaVar = new kma(13, this);
        t tVar2 = (t) this.g;
        if (tVar2 != null) {
            kmaVar.invoke(tVar2);
        }
    }

    public cr(mpf mpfVar) {
        this.a = 12;
        this.b = mpfVar;
        ane aneVar = new ane(mpfVar);
        this.c = aneVar;
        this.d = aneVar;
        i4s i4sVar = aneVar.X;
        this.e = i4sVar;
        this.f = i4sVar;
    }

    public cr(j9l j9lVar, jyr jyrVar, jyr jyrVar2, zgh zghVar, iuh iuhVar, kuh kuhVar) {
        this.a = 20;
        this.b = j9lVar;
        this.c = zghVar;
        this.d = iuhVar;
        this.e = kuhVar;
        this.i = jyrVar;
        this.f = jyrVar2;
        this.g = gld.e(dm6.b.plus(a4g.n()).plus(new im6("SessionCallback")));
    }

    public cr(xdr xdrVar, vw5 vw5Var, bjt bjtVar, n3m n3mVar, yks yksVar, a aVar, ae aeVar) {
        this.a = 16;
        aVar.getClass();
        this.b = xdrVar;
        this.c = vw5Var;
        this.d = bjtVar;
        this.e = n3mVar;
        this.f = yksVar;
        this.g = aVar;
        this.h = aeVar;
        this.i = rqi.a();
    }

    public /* synthetic */ cr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public cr(xw3 xw3Var, CardNumberInput cardNumberInput, Space space, Space space2, ImageView imageView, CvnInput cvnInput, TextView textView, ExpirationDateInput expirationDateInput, Space space3) {
        this.a = 13;
        this.b = xw3Var;
        this.c = cardNumberInput;
        this.d = space;
        this.e = imageView;
        this.f = cvnInput;
        this.g = textView;
        this.h = expirationDateInput;
        this.i = space3;
    }

    public cr(Context context, y yVar, kxi kxiVar, qyf qyfVar, s63 s63Var) {
        this.a = 11;
        context.getClass();
        yVar.getClass();
        kxiVar.getClass();
        qyfVar.getClass();
        s63Var.getClass();
        this.b = context;
        this.c = yVar;
        this.d = kxiVar;
        this.e = qyfVar;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.i = l18Var.b(I, true);
        this.f = l18Var.b(hag.I(z5l.class), true);
        this.g = l18Var.b(hag.I(yr.class), true);
        this.h = ((m4j) s63Var.a).a;
    }

    public cr(nur nurVar, MessengerParams messengerParams) {
        this.a = 25;
        messengerParams.getClass();
        this.i = nurVar;
        this.b = messengerParams;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
    }

    public cr(l13 l13Var) {
        this.a = 14;
        this.i = l13Var.b(hag.I(yr.class), true);
        this.b = l13Var.b(hag.I(cut.class), true);
        this.c = l13Var.b(hag.I(k21.class), true);
        this.d = l13Var.b(hag.I(l0t.class), true);
        this.e = l13Var.b(hag.I(joc.class), true);
        this.f = l13Var.b(hag.I(b8u.class), true);
        this.g = (y3l) l13Var.a.D(hag.I(y3l.class), l13Var, l13Var.b);
        this.h = c5b.a;
    }
}
