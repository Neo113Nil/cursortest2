package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.fragment.app.o;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.domainitem.ArtistDomainItemDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ThenNowComparisonSlideItemDto;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.ThenNowComparisonSlideTrackDto;
import com.yandex.passport.common.mvi.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class pcg {
    public static int A(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final String B(Resources resources, int i) {
        String str;
        String str2;
        if (resources == null) {
            return "#" + Integer.toHexString(i);
        }
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) != 127) {
            str = resources.getResourcePackageName(i);
            str.getClass();
            str2 = StringUtils.PROCESS_POSTFIX_DELIMITER;
        } else {
            str = "";
            str2 = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(resourceEntryName.length() + resourceTypeName.length() + str2.length() + str.length() + 1 + 1);
        su4.v(sb, "@", str, str2, resourceTypeName);
        return su4.o(sb, "/", resourceEntryName);
    }

    public static ColorStateList C(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!F("tint", xmlPullParser)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = o95.a;
        try {
            return o95.a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static x0 D(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        x0 x0Var;
        boolean F = F(str, xmlPullParser);
        Object obj = null;
        int i2 = 0;
        if (F) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new x0(obj, obj, typedValue.data, 3);
            }
            try {
                x0Var = x0.w(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                x0Var = null;
            }
            if (x0Var != null) {
                return x0Var;
            }
        }
        return new x0(obj, obj, i2, 3);
    }

    public static final String E(dd5 dd5Var) {
        dd5Var.getClass();
        if (dd5Var instanceof ad5) {
            return ((ad5) dd5Var).c;
        }
        if ((dd5Var instanceof zc5) || (dd5Var instanceof xc5) || (dd5Var instanceof yc5) || (dd5Var instanceof cd5)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static boolean F(String str, XmlPullParser xmlPullParser) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final void G(yvn yvnVar) {
        ArrayList arrayList = yvnVar.b;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((c3b) it.next()) instanceof k3b)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c3b c3bVar = (c3b) it2.next();
                c3bVar.getClass();
                ArrayList arrayList2 = ((k3b) c3bVar).b;
                if (arrayList2.size() != 1) {
                    e3b e3bVar = new e3b();
                    z75.t(e3bVar.b, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(e3bVar);
                }
            }
            H(yvnVar);
            T(yvnVar);
        }
        if (arrayList.size() != 1) {
            e3b e3bVar2 = new e3b();
            z75.t(e3bVar2.b, arrayList);
            arrayList.clear();
            arrayList.add(e3bVar2);
        }
        H(yvnVar);
        T(yvnVar);
    }

    public static final void H(n3b n3bVar) {
        ArrayList arrayList = n3bVar.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c3b c3bVar = (c3b) it.next();
            if (c3bVar instanceof n3b) {
                H((n3b) c3bVar);
            }
        }
        bxd bxdVar = (bxd) n3bVar.b().a(null, xce.K);
        u38 u38Var = s38.a;
        if (((bxdVar != null ? bxdVar.a : u38Var) instanceof s38) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                bxd bxdVar2 = (bxd) ((c3b) it2.next()).b().a(null, xce.X);
                if ((bxdVar2 != null ? bxdVar2.a : null) instanceof p38) {
                    n3bVar.a(n3bVar.b().d(new bxd(p38.a)));
                    break;
                }
            }
        }
        yov yovVar = (yov) n3bVar.b().a(null, xce.L);
        if (yovVar != null) {
            u38Var = yovVar.a;
        }
        if (u38Var instanceof s38) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    yov yovVar2 = (yov) ((c3b) it3.next()).b().a(null, xce.Y);
                    if ((yovVar2 != null ? yovVar2.a : null) instanceof p38) {
                        n3bVar.a(o5g.A(n3bVar.b()));
                        return;
                    }
                }
            }
        }
    }

    public static TypedArray I(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01df, code lost:
    
        r0 = defpackage.uop.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e3, code lost:
    
        defpackage.i4w.w(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f2s J(xjo xjoVar, String str) {
        Map b;
        mnp mnpVar;
        xjoVar.getClass();
        cko D0 = xjoVar.D0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (D0.q()) {
                int o = s7g.o(D0, "name");
                int o2 = s7g.o(D0, "type");
                int o3 = s7g.o(D0, "notnull");
                int o4 = s7g.o(D0, "pk");
                int o5 = s7g.o(D0, "dflt_value");
                f9h f9hVar = new f9h();
                do {
                    String x0 = D0.x0(o);
                    f9hVar.put(x0, new c2s((int) D0.getLong(o4), 2, x0, D0.x0(o2), D0.isNull(o5) ? null : D0.x0(o5), D0.getLong(o3) != 0));
                } while (D0.q());
                b = f9hVar.b();
                i4w.w(D0, null);
            } else {
                b = e5b.a;
                b.getClass();
                i4w.w(D0, null);
            }
            D0 = xjoVar.D0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int o6 = s7g.o(D0, ConnectableDevice.KEY_ID);
                int o7 = s7g.o(D0, "seq");
                int o8 = s7g.o(D0, "table");
                int o9 = s7g.o(D0, "on_delete");
                int o10 = s7g.o(D0, "on_update");
                List e0 = hdg.e0(D0);
                D0.reset();
                mnp mnpVar2 = new mnp();
                while (D0.q()) {
                    if (D0.getLong(o7) == j) {
                        int i = (int) D0.getLong(o6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = o6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : e0) {
                            int i3 = o7;
                            List list = e0;
                            if (((xrc) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            o7 = i3;
                            e0 = list;
                        }
                        int i4 = o7;
                        List list2 = e0;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            xrc xrcVar = (xrc) it.next();
                            arrayList.add(xrcVar.c);
                            arrayList2.add(xrcVar.d);
                        }
                        mnpVar2.add(new d2s(D0.x0(o8), D0.x0(o9), D0.x0(o10), arrayList, arrayList2));
                        o6 = i2;
                        o7 = i4;
                        e0 = list2;
                        j = 0;
                    }
                }
                mnp a = uop.a(mnpVar2);
                i4w.w(D0, null);
                D0 = xjoVar.D0("PRAGMA index_list(`" + str + "`)");
                try {
                    int o11 = s7g.o(D0, "name");
                    int o12 = s7g.o(D0, "origin");
                    int o13 = s7g.o(D0, "unique");
                    if (o11 == -1 || o12 == -1 || o13 == -1) {
                        i4w.w(D0, null);
                        mnpVar = null;
                    } else {
                        mnp mnpVar3 = new mnp();
                        while (true) {
                            if (!D0.q()) {
                                break;
                            }
                            if ("c".equals(D0.x0(o12))) {
                                e2s f0 = hdg.f0(xjoVar, D0.x0(o11), D0.getLong(o13) == 1);
                                if (f0 == null) {
                                    i4w.w(D0, null);
                                    mnpVar = null;
                                    break;
                                }
                                mnpVar3.add(f0);
                            }
                        }
                    }
                    return new f2s(str, b, a, mnpVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final void K(View view, Function0 function0) {
        if (view instanceof i39) {
            ((i39) view).setImageChangeCallback(function0);
        } else if (view instanceof ViewGroup) {
            c7 c7Var = new c7(8, (ViewGroup) view);
            while (c7Var.hasNext()) {
                K((View) c7Var.next(), function0);
            }
        }
    }

    public static final void L(ImageView imageView, View view) {
        Bitmap bitmap;
        if (!(view instanceof yp8)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (wyf.K(view)) {
            x(imageView, view);
        } else if (!wyf.K(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new v09(2, imageView, view));
        } else {
            x(imageView, view);
        }
    }

    public static final void M(o oVar, muv muvVar, dvv dvvVar, rmb rmbVar, Function0 function0) {
        oVar.getClass();
        muvVar.getClass();
        dvvVar.getClass();
        rmbVar.getClass();
        cvo cvoVar = cvo.i;
        fxf.O(oVar, o6m.b(wjb.WizardEntryPointScreen, null, 6), null, pd.t(new qzm[0]), function0, new wn5(new fb1(17, muvVar, dvvVar, rmbVar), -1874764304, true), 6);
    }

    public static final long N(ynn ynnVar) {
        float f = ynnVar.c - ynnVar.a;
        float f2 = ynnVar.d - ynnVar.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long O(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final pw5 P(wy5 wy5Var, uu5 uu5Var, h06 h06Var, uy5 uy5Var) {
        ru5 ru5Var;
        String str = h06Var.b;
        ru5 ru5Var2 = h06Var.m;
        String str2 = h06Var.g;
        ZonedDateTime zonedDateTime = h06Var.f;
        zonedDateTime.getClass();
        String I = ((sld) uu5Var.g).I(zonedDateTime);
        Locale locale = Locale.ROOT;
        String lowerCase = I.toLowerCase(locale);
        lowerCase.getClass();
        String a0 = StringsKt.a0(lowerCase, ".");
        ((ju5) uu5Var.d).getClass();
        String upperCase = String.valueOf(zonedDateTime.getDayOfMonth()).toUpperCase(locale);
        upperCase.getClass();
        String lowerCase2 = ((sld) uu5Var.f).I(zonedDateTime).toLowerCase(locale);
        lowerCase2.getClass();
        String str3 = h06Var.d;
        String str4 = h06Var.e;
        String I2 = ((sld) uu5Var.e).I(zonedDateTime);
        String a = uu5Var.a(uy5Var, wy5Var);
        String str5 = h06Var.k;
        Integer num = h06Var.l;
        String I3 = ((sld) uu5Var.k).I(zonedDateTime);
        Integer num2 = h06Var.l;
        StringBuilder sb = new StringBuilder();
        if (num2 != null) {
            int intValue = num2.intValue();
            Context context = (Context) uu5Var.a;
            ((wy5) uu5Var.b).getClass();
            ru5Var = ru5Var2;
            sb.append(context.getString(R.string.concert_full_cashback_percent_text, Integer.valueOf(intValue)));
        } else {
            ru5Var = ru5Var2;
        }
        return new pw5(str, ru5Var, str2, a0, upperCase, lowerCase2, str3, str4, I2, a, null, str5, num, I3, sb.toString());
    }

    public static final PendingIntent Q(Intent intent, Context context, int i, int i2) {
        intent.getClass();
        context.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, i2 | 67108864);
        activity.getClass();
        return activity;
    }

    public static final lpl R(b3l b3lVar) {
        b3lVar.getClass();
        if (Intrinsics.d(b3lVar, y2l.a)) {
            return ipl.a;
        }
        if (Intrinsics.d(b3lVar, r2l.a)) {
            return bpl.a;
        }
        if (Intrinsics.d(b3lVar, z2l.a)) {
            return jpl.a;
        }
        if (Intrinsics.d(b3lVar, s2l.a)) {
            return cpl.a;
        }
        if (Intrinsics.d(b3lVar, t2l.a)) {
            return dpl.a;
        }
        if (Intrinsics.d(b3lVar, u2l.a)) {
            return epl.a;
        }
        if (Intrinsics.d(b3lVar, v2l.a)) {
            return fpl.a;
        }
        if (Intrinsics.d(b3lVar, x2l.a)) {
            return hpl.a;
        }
        if (Intrinsics.d(b3lVar, w2l.a)) {
            return gpl.a;
        }
        if (Intrinsics.d(b3lVar, a3l.a)) {
            return kpl.a;
        }
        b6e.s();
        return null;
    }

    public static final jfs S(ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto) {
        String description;
        ThenNowComparisonSlideTrackDto track;
        String title;
        List<ArtistDomainItemDto> artists;
        EntityCoverDto cover;
        u9b V;
        String label = thenNowComparisonSlideItemDto.getLabel();
        if (label == null || (description = thenNowComparisonSlideItemDto.getDescription()) == null || (track = thenNowComparisonSlideItemDto.getTrack()) == null || (title = track.getTitle()) == null || (artists = thenNowComparisonSlideItemDto.getTrack().getArtists()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ArtistDomainItemDto artistDomainItemDto : artists) {
            u51 K = artistDomainItemDto != null ? ltg.K(artistDomainItemDto) : null;
            if (K != null) {
                arrayList.add(K);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null || (cover = thenNowComparisonSlideItemDto.getTrack().getCover()) == null || (V = c3x.V(cover)) == null) {
            return null;
        }
        return new jfs(label, description, title, arrayList2, V);
    }

    public static final void T(n3b n3bVar) {
        k9i k9iVar = k9i.Z;
        Iterator it = n3bVar.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            c3b c3bVar = (c3b) k9iVar.invoke((c3b) next);
            n3bVar.b.set(i, c3bVar);
            if (c3bVar instanceof n3b) {
                T((n3b) c3bVar);
            }
            i = i2;
        }
    }

    public static final LinkedHashMap U(n3b n3bVar) {
        ArrayList arrayList = n3bVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            c3b c3bVar = (c3b) next;
            ukd b = c3bVar.b();
            Pair pair = b.c(k9i.X) ? (Pair) b.a(new Pair(null, skd.a), xce.I) : new Pair(null, b);
            jg jgVar = (jg) pair.a;
            ukd ukdVar = (ukd) pair.b;
            od odVar = jgVar != null ? jgVar.a : null;
            Pair pair2 = odVar instanceof vif ? new Pair(odVar, ukdVar) : new Pair(null, ukdVar);
            if (c3bVar instanceof n3b) {
                for (Map.Entry entry : U((n3b) c3bVar).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static boolean V(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        boolean z2;
        boolean z3;
        boolean z4;
        Object K;
        int i4;
        boolean z5;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1764619145);
        if ((i & 6) == 0) {
            i3 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function05 = function0;
            i3 |= oq5Var.h(function05) ? 32 : 16;
        } else {
            function05 = function0;
        }
        if ((i & 384) == 0) {
            function06 = function02;
            i3 |= oq5Var.h(function06) ? 256 : 128;
        } else {
            function06 = function02;
        }
        if ((i & 3072) == 0) {
            function07 = function03;
            i3 |= oq5Var.h(function07) ? 2048 : 1024;
        } else {
            function07 = function03;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((74899 & i3) == 74898 || !oq5Var.z()) {
                z3 = i5 == 0 ? false : z2;
                yci m = d.m(vci.a, f);
                z4 = ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384);
                K = oq5Var.K();
                if (!z4 || K == gq5.a) {
                    i4 = 1;
                    q9v q9vVar = new q9v(function04, function07, function05, function06, 1);
                    oq5Var.k0(q9vVar);
                    K = q9vVar;
                } else {
                    i4 = 1;
                }
                yci a = a.a(m, (Function1) K);
                if (z3) {
                    oq5Var.Z(-630016977);
                    gae.b(a0g.E(R.drawable.wave_words_sparkle_no_margins, 0, oq5Var), null, d.x(a, null, i4), d85.f, oq5Var, 3120, 0);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-630318979);
                    xcs.b("AI", d.x(a, null, i4), d85.f, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, ges.b(nu0.j(), 0L, v7g.y(17.85d), null, null, 0L, 0, v7g.y(21.42d), null, null, 0, 0, 16646141), oq5Var, 390, 0, 65016);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                }
                z5 = z3;
            } else {
                oq5Var.S();
                z5 = z2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mo6(f, function0, function02, function03, function04, z5, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((74899 & i3) == 74898) {
        }
        if (i5 == 0) {
        }
        yci m2 = d.m(vci.a, f);
        if ((57344 & i3) != 16384) {
        }
        z4 = ((i3 & 896) != 256) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384);
        K = oq5Var.K();
        if (z4) {
        }
        i4 = 1;
        q9v q9vVar2 = new q9v(function04, function07, function05, function06, 1);
        oq5Var.k0(q9vVar2);
        K = q9vVar2;
        yci a2 = a.a(m2, (Function1) K);
        if (z3) {
        }
        z5 = z3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(String str, d85 d85Var, yci yciVar, hq5 hq5Var, int i) {
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1156025854);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(d85Var) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            kfh d = ug3.d(b2c.c, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            float f = 8;
            yci s = s(xp3.u(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.d(vciVar, 1.0f), f, 0.0f, 2), o5g.F(oq5Var)));
            d85 d85Var2 = d85Var != null ? new d85(d85.b(d85Var.a, 0.5f, 0.0f, 0.0f, 0.0f, 14)) : null;
            if (d85Var2 == null) {
                oq5Var.Z(2029486535);
                j = ((dq0) oq5Var.j(eq0.a)).c.c;
                oq5Var.p(false);
            } else {
                oq5Var.Z(2029484768);
                oq5Var.p(false);
                j = d85Var2.a;
            }
            ug3.a(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(s, j, vnj.i), "background_color_cover"), oq5Var, 0);
            irf.y(str, qo6.m, androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), false, true, null, null, o5g.F(oq5Var), oq5Var, (i2 & 14) | 25008, 104);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new c6i(str, d85Var, yciVar, i, 0);
        }
    }

    public static final void c(nb6 nb6Var, xsq xsqVar, int i, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        hvq hvqVar2;
        xsqVar.getClass();
        zd3 zd3Var = xsqVar.d;
        hvqVar.getClass();
        zsqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(666562917);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(nb6Var) : oq5Var.h(nb6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(xsqVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= oq5Var.d(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if ((i2 & 3072) == 0) {
            hvqVar2 = hvqVar;
            i3 |= oq5Var.h(hvqVar2) ? 2048 : 1024;
        } else {
            hvqVar2 = hvqVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? oq5Var.f(zsqVar) : oq5Var.h(zsqVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f = zd3Var != null ? zd3Var.a + xvq.c : gwq.a;
            vci vciVar = vci.a;
            yci e = d.e(d.d(vciVar, 1.0f), f);
            kfh d = ug3.d(b2c.c, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (zd3Var == null) {
                oq5Var.Z(-396982424);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-396982423);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new xnq(11);
                    oq5Var.k0(K);
                }
                int i6 = i3 << 3;
                hvq hvqVar3 = hvqVar2;
                int i7 = i4;
                pd.d(zd3Var, nb6Var, hvqVar3, i7, zsqVar, d.u(androidx.compose.foundation.layout.a.o(nfp.b(vciVar, false, (Function1) K), xvq.d, 0.0f, 2), b2c.m, true), oq5Var, (i3 & 57344) | (i6 & 7168) | (i6 & 112) | ((i3 >> 3) & 896));
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(nb6Var, xsqVar, i, hvqVar, zsqVar, i2);
        }
    }

    public static final void d(w7v w7vVar, fk0 fk0Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1831653546);
        int i2 = (oq5Var.d(w7vVar.ordinal()) ? 4 : 2) | i | (oq5Var.h(fk0Var) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new ov6(0.71f, 0.0f, 0.28f, 1.0f);
                oq5Var.k0(K);
            }
            ov6 ov6Var = (ov6) K;
            int ordinal = w7vVar.ordinal();
            Continuation continuation = null;
            boolean z = true;
            if (ordinal == 0) {
                oq5Var.Z(-768367962);
                Unit unit = Unit.a;
                if ((i2 & 112) != 32 && !oq5Var.h(fk0Var)) {
                    z = false;
                }
                Object K2 = oq5Var.K();
                if (z || K2 == kjnVar) {
                    K2 = new r9v(fk0Var, ov6Var, continuation, 1);
                    oq5Var.k0(K2);
                }
                gld.w(oq5Var, unit, (Function2) K2);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(-767501109);
                Unit unit2 = Unit.a;
                if ((i2 & 112) != 32 && !oq5Var.h(fk0Var)) {
                    z = false;
                }
                Object K3 = oq5Var.K();
                if (z || K3 == kjnVar) {
                    K3 = new h0t(ov6Var, fk0Var, continuation, 22);
                    oq5Var.k0(K3);
                }
                gld.w(oq5Var, unit2, (Function2) K3);
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -717523430, false);
                }
                oq5Var.Z(-767935450);
                Unit unit3 = Unit.a;
                if ((i2 & 112) != 32 && !oq5Var.h(fk0Var)) {
                    z = false;
                }
                Object K4 = oq5Var.K();
                if (z || K4 == kjnVar) {
                    K4 = new r9v(fk0Var, ov6Var, continuation, 2);
                    oq5Var.k0(K4);
                }
                gld.w(oq5Var, unit3, (Function2) K4);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(w7vVar, fk0Var, i, 5);
        }
    }

    public static final void e(d6i d6iVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-86341046);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(d6iVar) : oq5Var2.h(d6iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.d(yciVar, 1.0f), 1.0f), o5g.C(oq5Var2));
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new or(26, function0);
                oq5Var2.k0(K);
            }
            yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7), "mix_grid_item");
            kfh d = ug3.d(b2c.c, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 4, 0.0f, 0.0f, 13);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, q);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            String str = d6iVar.d;
            d85 d85Var = d6iVar.e;
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            b(str, d85Var, new LayoutWeightElement(true, 1.0f), oq5Var2, 0);
            u1g.l(oq5Var2, d.e(vciVar, 12));
            xcs.b(d6iVar.b, null, ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 2, null, nu0.j(), oq5Var2, 0, 27696, 38394);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(d6iVar, function0, yciVar, i, 17);
        }
    }

    public static final void f(String str, dvi dviVar, tmb tmbVar, hq5 hq5Var, int i) {
        jvi jviVar;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1057767440);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(dviVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            jvi jviVar2 = (jvi) szf.Q(dviVar.c, oq5Var).getValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(jviVar2 instanceof fvi, jviVar2 instanceof gvi, null, oq5Var, 4096, 4);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                jviVar = jviVar2;
                sui suiVar = new sui(0, dviVar, dvi.class, "onBackClick", "onBackClick()V", 0, 0);
                oq5Var.k0(suiVar);
                K = suiVar;
            } else {
                jviVar = jviVar2;
            }
            xp3.d(str, a, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(863874298, new up(jviVar, dviVar, tmbVar, a, 21), oq5Var), oq5Var, i2 & 14, 48, 2020);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(str, dviVar, tmbVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    public static final void g(ham hamVar, wdj wdjVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        Function0 function03;
        wdj wdjVar2;
        oq5 oq5Var;
        int i2;
        saj sajVar;
        kb5 kb5Var;
        vci vciVar;
        boolean z;
        kb5 kb5Var2;
        kb5 kb5Var3;
        ?? r1;
        oq5 oq5Var2;
        Object obj;
        kb5 kb5Var4;
        int i3;
        oq5 oq5Var3;
        int i4;
        oq5 oq5Var4;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var5 = (oq5) hq5Var;
        oq5Var5.b0(1880772461);
        int i5 = i | (oq5Var5.f(hamVar) ? 4 : 2) | (oq5Var5.h(wdjVar) ? 32 : 16) | (oq5Var5.h(function0) ? 256 : 128) | (oq5Var5.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var5.P(i5 & 1, (i5 & 9363) != 9362)) {
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a = sa5.a(kx0Var, gz2Var, oq5Var5, 0);
            int i6 = oq5Var5.P;
            androidx.compose.runtime.internal.a l = oq5Var5.l();
            yci H = vnj.H(oq5Var5, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var5.d0();
            if (oq5Var5.O) {
                oq5Var5.k(grbVar);
            } else {
                oq5Var5.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var5, a, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var5, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var5, i6, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var5, H, kb5Var8);
            String str = hamVar.a;
            saj sajVar2 = hamVar.e;
            vci vciVar2 = vci.a;
            if (str == null) {
                oq5Var5.Z(1577935992);
                oq5Var5.p(false);
                i2 = i5;
                r1 = 0;
                kb5Var = kb5Var8;
                kb5Var3 = kb5Var7;
                vciVar = vciVar2;
                sajVar = sajVar2;
                z = true;
                oq5Var2 = oq5Var5;
                kb5Var2 = kb5Var6;
            } else {
                oq5Var5.Z(1577935993);
                i2 = i5;
                float f = 16;
                yci a2 = androidx.compose.ui.platform.a.a(d.d(wyf.C(androidx.compose.foundation.layout.a.q(vciVar2, f, 0.0f, f, 12, 2), function0, 0.0f, 0.0f, 14), 1.0f), "non_music_description_block");
                ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var5, 0);
                int i7 = oq5Var5.P;
                androidx.compose.runtime.internal.a l2 = oq5Var5.l();
                yci H2 = vnj.H(oq5Var5, a2);
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(oq5Var5, a3, kb5Var5);
                g0g.U(oq5Var5, l2, kb5Var6);
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var5, i7, kb5Var7);
                }
                g0g.U(oq5Var5, H2, kb5Var8);
                ges j = nu0.j();
                agr agrVar = eq0.a;
                long j2 = ((dq0) oq5Var5.j(agrVar)).b.a;
                sajVar = sajVar2;
                kb5Var = kb5Var8;
                vciVar = vciVar2;
                z = true;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var7;
                xcs.b(str, null, j2, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, j, oq5Var5, 0, 3120, 55290);
                xcs.b(rvf.M(R.string.non_music_screen_read_more, oq5Var5), null, ((dq0) oq5Var5.j(agrVar)).b.d, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var5, 0, 3120, 55290);
                oq5 oq5Var6 = oq5Var5;
                oq5Var6.p(true);
                r1 = 0;
                oq5Var6.p(false);
                oq5Var2 = oq5Var6;
            }
            String str2 = hamVar.b;
            Object obj2 = gq5.a;
            if (str2 == null) {
                oq5Var2.Z(1578903564);
                oq5Var2.p(r1);
                kb5Var4 = kb5Var3;
                obj = obj2;
                i3 = 16;
                oq5Var3 = oq5Var2;
            } else {
                oq5Var2.Z(1578903565);
                oq5Var2.Z(50933482);
                kn0 kn0Var = new kn0();
                String str3 = hamVar.c;
                agr agrVar2 = eq0.a;
                mn0 a4 = nn0.a(str3, new c4r(((dq0) oq5Var2.j(agrVar2)).b.b, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                mn0 a5 = nn0.a(StringUtil.SPACE.concat(str2), new c4r(((dq0) oq5Var2.j(agrVar2)).b.a, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                boolean z2 = z;
                jn0 jn0Var = new jn0(nu0.j().b, kn0Var.a.length(), (int) r1, 12);
                ArrayList arrayList = kn0Var.b;
                arrayList.add(jn0Var);
                kn0Var.c.add(jn0Var);
                int size = arrayList.size() - 1;
                try {
                    kn0Var.b(a4);
                    kn0Var.b(a5);
                    kn0Var.f(size);
                    mn0 h = kn0Var.h();
                    oq5Var2.p(r1);
                    float f2 = 16;
                    float f3 = 4;
                    yci p = androidx.compose.foundation.layout.a.p(vciVar, f2, f3, f2, f3);
                    Object K = oq5Var2.K();
                    if (K == obj2) {
                        K = new k7m(29);
                        oq5Var2.k0(K);
                    }
                    hq5 hq5Var2 = oq5Var2;
                    obj = obj2;
                    kb5Var4 = kb5Var3;
                    i3 = 16;
                    xcs.c(h, nfp.b(p, z2, (Function1) K), 0L, 0L, null, 0L, null, 0L, 2, false, 3, 0, null, null, null, hq5Var2, 0, 3120, 251900);
                    oq5 oq5Var7 = hq5Var2;
                    oq5Var7.p(r1);
                    oq5Var3 = oq5Var7;
                } catch (Throwable th) {
                    kn0Var.f(size);
                    throw th;
                }
            }
            if (hamVar.d) {
                oq5Var3.Z(1579952667);
                float f4 = i3;
                float f5 = 4;
                yci p2 = androidx.compose.foundation.layout.a.p(vciVar, f4, f5, f4, f5);
                Object K2 = oq5Var3.K();
                if (K2 == obj) {
                    K2 = new fam(r1);
                    oq5Var3.k0(K2);
                }
                yci b = nfp.b(p2, true, (Function1) K2);
                nho a6 = lho.a(qx0.a, b2c.k, oq5Var3, r1);
                int i8 = oq5Var3.P;
                androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                yci H3 = vnj.H(oq5Var3, b);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, a6, kb5Var5);
                g0g.U(oq5Var3, l3, kb5Var2);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var3, i8, kb5Var4);
                }
                g0g.U(oq5Var3, H3, kb5Var);
                String M = rvf.M(R.string.non_music_screen_age_restriction, oq5Var3);
                ges j3 = nu0.j();
                agr agrVar3 = eq0.a;
                oq5 oq5Var8 = oq5Var3;
                i4 = 1576261931;
                xcs.b(M, null, ((dq0) oq5Var3.j(agrVar3)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j3, oq5Var8, 0, 3120, 55290);
                xcs.b(" 18+", d.d(vciVar, 1.0f), ((dq0) oq5Var8.j(agrVar3)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var8, 54, 3120, 55288);
                oq5 oq5Var9 = oq5Var8;
                oq5Var9.p(true);
                oq5Var4 = oq5Var9;
            } else {
                i4 = 1576261931;
                oq5Var3.Z(1576261931);
                oq5Var4 = oq5Var3;
            }
            oq5Var4.p(r1);
            if (wdjVar == null || sajVar == null) {
                wdjVar2 = wdjVar;
                function03 = function02;
                oq5Var4.Z(i4);
            } else {
                oq5Var4.Z(1580966987);
                raj rajVar = sajVar.a;
                yci a7 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 12, 0.0f, 0.0f, 13), "preview_track");
                Object K3 = oq5Var4.K();
                if (K3 == obj) {
                    function03 = function02;
                    K3 = new g1j(11, function03);
                    oq5Var4.k0(K3);
                } else {
                    function03 = function02;
                }
                Function0 function04 = (Function0) K3;
                a7.getClass();
                function04.getClass();
                wdjVar2 = wdjVar;
                o5g.d(rajVar, wdjVar2, androidx.compose.ui.layout.a.d(a7, new ex(2, function04)), oq5Var4, i2 & 112);
            }
            oq5Var4.p(r1);
            oq5Var4.p(true);
            oq5Var = oq5Var4;
        } else {
            function03 = function02;
            oq5 oq5Var10 = oq5Var5;
            wdjVar2 = wdjVar;
            oq5Var10.S();
            oq5Var = oq5Var10;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 9, hamVar, wdjVar2, function0, function03, yciVar);
        }
    }

    public static final void h(mvi mviVar, t1f t1fVar, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        zab zabVar = mviVar.a;
        t1fVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-143972409);
        int i2 = i | (oq5Var.f(mviVar) ? 4 : 2) | (oq5Var.f(t1fVar) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            String str = zabVar.a;
            vci vciVar = vci.a;
            float f = 24;
            y2x.f(str, androidx.compose.ui.platform.a.a(vciVar, "my_shelf_promo_title"), 0, null, t9b.a(14, f), oq5Var, 48, 12);
            asq.e((eti) CollectionsKt.Q(zabVar.b), 0, t1fVar, o70.Promo, androidx.compose.ui.platform.a.a(vciVar, "my_shelf_promo_item"), oq5Var, ((i2 << 3) & 896) | 27696);
            oq5Var = oq5Var;
            lx0 lx0Var = qx0.f;
            hz2 hz2Var = b2c.l;
            yci n = androidx.compose.foundation.layout.a.n(vciVar, 16, f);
            nho a = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, n);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.my_shelf_promo_hide_button, oq5Var);
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "my_shelf_hide_button");
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            float f2 = 48;
            hdg.t(M, function0, d.e(a2.f(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f)), f2), null, oq5Var, (i2 >> 3) & 112, 8);
            u1g.l(oq5Var, d.m(vciVar, 8));
            String M2 = rvf.M(R.string.my_shelf_promo_save_button, oq5Var);
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "my_shelf_save_button");
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            hdg.t(M2, function02, d.e(a3.f(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f)), f2), null, oq5Var, (i2 >> 6) & 112, 8);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 15, mviVar, t1fVar, function0, function02);
        }
    }

    public static final void i(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        wn5 wn5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1075498320);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            ydp ydpVar = (ydp) aqiVar.getValue();
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new kf0(aqiVar, 7);
                oq5Var.k0(K2);
            }
            Function1 function1 = (Function1) K2;
            vci vciVar = vci.a;
            wn5Var2 = wn5Var;
            j(vciVar, ydpVar, function1, wn5Var2, oq5Var, 3462);
            yciVar = vciVar;
        } else {
            wn5Var2 = wn5Var;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bep(yciVar, wn5Var2, i, 0);
        }
    }

    public static final void j(yci yciVar, ydp ydpVar, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2078139907);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(ydpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            bfp bfpVar = (bfp) o2g.g0(new Object[0], bfp.l, xuj.A0, oq5Var, 3072, 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new xep(bfpVar);
                oq5Var.k0(K);
            }
            xep xepVar = (xep) K;
            kp4 kp4Var = (kp4) oq5Var.j(es5.f);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = gld.R(g.a, oq5Var);
                oq5Var.k0(K2);
            }
            mm6 mm6Var = (mm6) K2;
            xepVar.e = (msd) oq5Var.j(es5.l);
            boolean f = oq5Var.f(mm6Var) | oq5Var.f(kp4Var);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                K3 = new gcp(1, mm6Var, kp4Var);
                oq5Var.k0(K3);
            }
            xepVar.f = (Function1) K3;
            xepVar.g = (hes) oq5Var.j(es5.q);
            xepVar.d = new gcp(2, xepVar, function1);
            xepVar.m(ydpVar);
            dep depVar = new dep(xepVar, 3);
            Unit unit = Unit.a;
            ul6 ul6Var = new ul6(2, xepVar, depVar);
            yci yciVar2 = vci.a;
            yci a = androidx.compose.ui.input.key.a.a(eur.a(androidx.compose.foundation.a.k(androidx.compose.ui.focus.a.b(androidx.compose.ui.focus.a.a(androidx.compose.ui.layout.a.d(eur.a(yciVar2, unit, ul6Var), new fep(xepVar, 4)), xepVar.h), new fep(xepVar, 5)), true, null), 8675309, new ff6(1, new fep(xepVar, 6))), new fep(xepVar, 7));
            if (xepVar.d() != null && xepVar.g()) {
                ydp e = xepVar.e();
                if (!(e != null ? Intrinsics.d(e.a, e.b) : true) && x4h.a()) {
                    yciVar2 = vnj.q(yciVar2, new wk0(9, xepVar));
                }
            }
            tyf.h(yciVar.f(a.f(yciVar2)), ild.C(-1869667463, new eep(xepVar, bfpVar, wn5Var), oq5Var), oq5Var, 48);
            boolean h = oq5Var.h(xepVar);
            Object K4 = oq5Var.K();
            if (h || K4 == kjnVar) {
                K4 = new fep(xepVar, 0);
                oq5Var.k0(K4);
            }
            gld.k(xepVar, (Function1) K4, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new un5(yciVar, ydpVar, function1, wn5Var, i, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a5, code lost:
    
        if ((r24 & 4) != 0) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(ua5 ua5Var, String str, nb6 nb6Var, o0k o0kVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        o0k o0kVar2;
        boolean z;
        boolean z2;
        int i4;
        ua5Var.getClass();
        nb6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1923079696);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ua5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(nb6Var) : oq5Var.h(nb6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 4) == 0) {
                o0kVar2 = o0kVar;
                if (oq5Var.f(o0kVar2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                o0kVar2 = o0kVar;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            o0kVar2 = o0kVar;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                if ((i2 & 4) != 0) {
                    o0kVar2 = androidx.compose.foundation.layout.a.c(0.0f, str == null ? gwq.e : 0, 0.0f, gwq.d, 5);
                    i3 &= -7169;
                }
                oq5Var.q();
                vci vciVar = vci.a;
                yci l = androidx.compose.foundation.layout.a.l(((wa5) ua5Var).b(1.0f, vciVar, true), o0kVar2);
                kfh d = ug3.d(b2c.b, false);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, l);
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
                g0g.U(oq5Var, l2, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                oq5Var.Z(1539171148);
                if (nb6Var.d) {
                    um0 um0Var = ((Boolean) oq5Var.j(koe.a)).booleanValue() ? um0.a : nb6Var.c ? um0.a : um0.b;
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i6 = oq5Var.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, vciVar);
                    oq5Var.d0();
                    int i7 = i3;
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, kb5Var);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    if (str == null) {
                        oq5Var.Z(1700137772);
                        z = false;
                    } else {
                        z = false;
                        oq5Var.Z(1700137773);
                        wdg.g(str, um0Var, new HorizontalAlignElement(b2c.o), oq5Var, 0);
                    }
                    oq5Var.p(z);
                    wn5Var.invoke(um0Var, oq5Var, Integer.valueOf((i7 >> 9) & 112));
                    z2 = true;
                    oq5Var.p(true);
                    oq5Var.p(z);
                } else {
                    oq5Var.p(false);
                    z2 = true;
                }
                oq5Var.p(z2);
            } else {
                oq5Var.S();
            }
        }
        o0k o0kVar3 = o0kVar2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cj(ua5Var, str, nb6Var, o0kVar3, wn5Var, i, i2, 17);
        }
    }

    public static final void l(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1085048040);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci b = d.b(vci.a, 1.0f);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(wa5.a, oq5Var, 54);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ion(i, 10, wn5Var);
        }
    }

    public static final void m(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, wn5 wn5Var4, hq5 hq5Var, int i) {
        Function2 function2;
        Function2 function22;
        Function2 function23;
        Function2 function24;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(912289944);
        if ((i & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function23 = wn5Var;
            function24 = wn5Var2;
            function22 = wn5Var3;
            function2 = wn5Var4;
        } else {
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            function2 = wn5Var4;
            function2.invoke(oq5Var, 6);
            function22 = wn5Var3;
            function22.invoke(oq5Var, 6);
            function23 = wn5Var;
            function23.invoke(oq5Var, 6);
            yci q = androidx.compose.foundation.layout.a.q(d.b(vciVar, 1.0f), 0.0f, gwq.a, 0.0f, 0.0f, 13);
            WeakHashMap weakHashMap = rqv.w;
            yci l2 = androidx.compose.foundation.layout.a.l(q, p6g.n(z7l.h(oq5Var).f, oq5Var));
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, l2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            function24 = wn5Var2;
            function24.invoke(oq5Var, 6);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 26, function23, function24, function22, function2);
        }
    }

    public static final void n(rru rruVar, Function0 function0, fvf fvfVar, o0k o0kVar, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(910024463);
        int i2 = i | (oq5Var.f(rruVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(fvfVar) ? 256 : 128) | (oq5Var.f(o0kVar) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wje f = pm0.f(oq5Var);
            boolean f2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | oq5Var.f(f);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new zzq(19, rruVar, function0, f);
                oq5Var.k0(K);
            }
            int i3 = i2 >> 3;
            weo.g(yciVar, fvfVar, o0kVar, null, null, null, false, (Function1) K, oq5Var, (i3 & 112) | 6 | (i3 & 896), 248);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(rruVar, function0, fvfVar, o0kVar, yciVar, i);
        }
    }

    public static final void o(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1004217737);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            lsq.i(hld.e, hld.f, hld.g, null, yciVar2, null, null, oq5Var, ((i2 << 12) & 57344) | 3510, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(final wl3 wl3Var, final yci yciVar, float f, float f2, float f3, hq5 hq5Var, final int i) {
        int i2;
        float f4;
        float f5;
        float f6;
        boolean z;
        float f7;
        boolean c;
        Object K;
        boolean c2;
        Object K2;
        boolean c3;
        Object K3;
        boolean f8;
        Object K4;
        boolean c4;
        Object K5;
        boolean c5;
        Object K6;
        boolean c6;
        Object K7;
        boolean f9;
        Object K8;
        boolean c7;
        Object K9;
        boolean c8;
        Object K10;
        boolean c9;
        Object K11;
        Object K12;
        boolean c10;
        Object K13;
        boolean c11;
        Object K14;
        boolean c12;
        Object K15;
        boolean h;
        Object K16;
        final float f10;
        final float f11;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1728965563);
        int i3 = i | (oq5Var.h(wl3Var) ? 4 : 2) | 11648;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            f11 = f;
            f10 = f2;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                i2 = i3 & (-57345);
                f4 = (float) 17.1d;
                f5 = (float) 9.5d;
                f6 = f5;
            } else {
                oq5Var.S();
                f5 = f2;
                f6 = f3;
                i2 = i3 & (-57345);
                f4 = f;
            }
            oq5Var.q();
            Object K17 = oq5Var.K();
            Object obj = gq5.a;
            if (K17 == obj) {
                K17 = vq2.a(0.0f);
                oq5Var.k0(K17);
            }
            final fk0 fk0Var = (fk0) K17;
            float f12 = 3;
            final float f13 = f5 / f4;
            float f14 = f4 / 2.0f;
            final float f15 = (f4 / (2.0f / f13)) + f14;
            final float f16 = (f12 * f13) + f14;
            float f17 = f6 / f4;
            float f18 = (f4 / (2.0f / f17)) + f14;
            float f19 = (f12 * f17) + f14;
            iz2 iz2Var = b2c.f;
            float f20 = f4;
            yci f21 = d.x(vci.a, null, 1).f(yciVar);
            kfh d = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f21);
            xp5.T.getClass();
            int i5 = i2;
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w7v w7vVar = (w7v) wl3Var.invoke(oq5Var, Integer.valueOf(i5 & 14));
            d(w7vVar, fk0Var, oq5Var, 64);
            act S = weo.S(200, 0, lya.a, 2);
            int ordinal = w7vVar.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    f7 = 1.0f;
                    float f22 = f5;
                    f3 = f6;
                    final sdr b = pk0.b(f7, S, "sparkle_ai_alpha", null, oq5Var, 3072, 20);
                    oq5Var = oq5Var;
                    c = oq5Var.c(f15) | oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K = oq5Var.K();
                    if (!c || K == obj) {
                        final int i6 = 0;
                        K = new Function0() { // from class: u9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        float f23 = f15;
                                        float f24 = ((float) 1.5d) + f23;
                                        return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                                    case 1:
                                        float f25 = f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                                    case 2:
                                        float f26 = -f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                                    default:
                                        float f27 = -f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                                }
                            }
                        };
                        oq5Var.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    c2 = oq5Var.c(f16) | oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K2 = oq5Var.K();
                    if (!c2 || K2 == obj) {
                        final int i7 = 3;
                        K2 = new Function0() { // from class: u9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        float f23 = f16;
                                        float f24 = ((float) 1.5d) + f23;
                                        return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                                    case 1:
                                        float f25 = f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                                    case 2:
                                        float f26 = -f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                                    default:
                                        float f27 = -f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                                }
                            }
                        };
                        oq5Var.k0(K2);
                    }
                    Function0 function02 = (Function0) K2;
                    c3 = oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K3 = oq5Var.K();
                    if (!c3 || K3 == obj) {
                        K3 = new p9v(f13, fk0Var, 13);
                        oq5Var.k0(K3);
                    }
                    Function0 function03 = (Function0) K3;
                    f8 = oq5Var.f(b) | oq5Var.h(fk0Var);
                    K4 = oq5Var.K();
                    if (!f8 || K4 == obj) {
                        final int i8 = 1;
                        K4 = new Function0() { // from class: v9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * (1.0f - ((Number) b.getValue()).floatValue()));
                                    default:
                                        return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * ((Number) b.getValue()).floatValue());
                                }
                            }
                        };
                        oq5Var.k0(K4);
                    }
                    a(f20, function0, function02, function03, (Function0) K4, true, oq5Var, 196614, 0);
                    c4 = oq5Var.c(f15) | oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K5 = oq5Var.K();
                    if (!c4 || K5 == obj) {
                        final int i9 = 1;
                        K5 = new Function0() { // from class: u9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        float f23 = f15;
                                        float f24 = ((float) 1.5d) + f23;
                                        return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                                    case 1:
                                        float f25 = f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                                    case 2:
                                        float f26 = -f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                                    default:
                                        float f27 = -f15;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                                }
                            }
                        };
                        oq5Var.k0(K5);
                    }
                    Function0 function04 = (Function0) K5;
                    c5 = oq5Var.c(f16) | oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K6 = oq5Var.K();
                    if (!c5 || K6 == obj) {
                        final int i10 = 2;
                        K6 = new Function0() { // from class: u9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i10) {
                                    case 0:
                                        float f23 = f16;
                                        float f24 = ((float) 1.5d) + f23;
                                        return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                                    case 1:
                                        float f25 = f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                                    case 2:
                                        float f26 = -f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                                    default:
                                        float f27 = -f16;
                                        return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                                }
                            }
                        };
                        oq5Var.k0(K6);
                    }
                    Function0 function05 = (Function0) K6;
                    c6 = oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K7 = oq5Var.K();
                    if (!c6 || K7 == obj) {
                        K7 = new p9v(f13, fk0Var, 6);
                        oq5Var.k0(K7);
                    }
                    Function0 function06 = (Function0) K7;
                    f9 = oq5Var.f(b) | oq5Var.h(fk0Var);
                    K8 = oq5Var.K();
                    if (!f9 || K8 == obj) {
                        final int i11 = 0;
                        K8 = new Function0() { // from class: v9v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * (1.0f - ((Number) b.getValue()).floatValue()));
                                    default:
                                        return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * ((Number) b.getValue()).floatValue());
                                }
                            }
                        };
                        oq5Var.k0(K8);
                    }
                    a(f20, function04, function05, function06, (Function0) K8, false, oq5Var, 196614, 0);
                    c7 = oq5Var.c(f15) | oq5Var.h(fk0Var);
                    K9 = oq5Var.K();
                    if (!c7 || K9 == obj) {
                        K9 = new p9v(f15, fk0Var, 7);
                        oq5Var.k0(K9);
                    }
                    Function0 function07 = (Function0) K9;
                    c8 = oq5Var.c(f16) | oq5Var.h(fk0Var);
                    K10 = oq5Var.K();
                    if (!c8 || K10 == obj) {
                        K10 = new p9v(f16, fk0Var, 8);
                        oq5Var.k0(K10);
                    }
                    Function0 function08 = (Function0) K10;
                    c9 = oq5Var.c(f13) | oq5Var.h(fk0Var);
                    K11 = oq5Var.K();
                    if (!c9 || K11 == obj) {
                        K11 = new p9v(f13, fk0Var, 9);
                        oq5Var.k0(K11);
                    }
                    Function0 function09 = (Function0) K11;
                    K12 = oq5Var.K();
                    if (K12 == obj) {
                        K12 = new s2(28);
                        oq5Var.k0(K12);
                    }
                    a(f20, function07, function08, function09, (Function0) K12, false, oq5Var, 24582, 32);
                    c10 = oq5Var.c(f18) | oq5Var.h(fk0Var);
                    K13 = oq5Var.K();
                    if (!c10 || K13 == obj) {
                        K13 = new p9v(f18, fk0Var, 10);
                        oq5Var.k0(K13);
                    }
                    Function0 function010 = (Function0) K13;
                    c11 = oq5Var.c(f19) | oq5Var.h(fk0Var);
                    K14 = oq5Var.K();
                    if (!c11 || K14 == obj) {
                        K14 = new p9v(f19, fk0Var, 11);
                        oq5Var.k0(K14);
                    }
                    Function0 function011 = (Function0) K14;
                    c12 = oq5Var.c(f17) | oq5Var.h(fk0Var);
                    K15 = oq5Var.K();
                    if (!c12 || K15 == obj) {
                        K15 = new p9v(f17, fk0Var, 12);
                        oq5Var.k0(K15);
                    }
                    Function0 function012 = (Function0) K15;
                    h = oq5Var.h(fk0Var);
                    K16 = oq5Var.K();
                    if (!h || K16 == obj) {
                        K16 = new gn6(fk0Var, 9);
                        oq5Var.k0(K16);
                    }
                    a(f20, function010, function011, function012, (Function0) K16, false, oq5Var, 6, 32);
                    oq5Var.p(true);
                    f10 = f22;
                    f11 = f20;
                }
            } else {
                z = true;
            }
            f7 = 0.0f;
            float f222 = f5;
            f3 = f6;
            final sdr b2 = pk0.b(f7, S, "sparkle_ai_alpha", null, oq5Var, 3072, 20);
            oq5Var = oq5Var;
            c = oq5Var.c(f15) | oq5Var.c(f13) | oq5Var.h(fk0Var);
            K = oq5Var.K();
            if (!c) {
            }
            final int i62 = 0;
            K = new Function0() { // from class: u9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i62) {
                        case 0:
                            float f23 = f15;
                            float f24 = ((float) 1.5d) + f23;
                            return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                        case 1:
                            float f25 = f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                        case 2:
                            float f26 = -f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                        default:
                            float f27 = -f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                    }
                }
            };
            oq5Var.k0(K);
            Function0 function013 = (Function0) K;
            c2 = oq5Var.c(f16) | oq5Var.c(f13) | oq5Var.h(fk0Var);
            K2 = oq5Var.K();
            if (!c2) {
            }
            final int i72 = 3;
            K2 = new Function0() { // from class: u9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i72) {
                        case 0:
                            float f23 = f16;
                            float f24 = ((float) 1.5d) + f23;
                            return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                        case 1:
                            float f25 = f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                        case 2:
                            float f26 = -f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                        default:
                            float f27 = -f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                    }
                }
            };
            oq5Var.k0(K2);
            Function0 function022 = (Function0) K2;
            c3 = oq5Var.c(f13) | oq5Var.h(fk0Var);
            K3 = oq5Var.K();
            if (!c3) {
            }
            K3 = new p9v(f13, fk0Var, 13);
            oq5Var.k0(K3);
            Function0 function032 = (Function0) K3;
            f8 = oq5Var.f(b2) | oq5Var.h(fk0Var);
            K4 = oq5Var.K();
            if (!f8) {
            }
            final int i82 = 1;
            K4 = new Function0() { // from class: v9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i82) {
                        case 0:
                            return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * (1.0f - ((Number) b2.getValue()).floatValue()));
                        default:
                            return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * ((Number) b2.getValue()).floatValue());
                    }
                }
            };
            oq5Var.k0(K4);
            a(f20, function013, function022, function032, (Function0) K4, true, oq5Var, 196614, 0);
            c4 = oq5Var.c(f15) | oq5Var.c(f13) | oq5Var.h(fk0Var);
            K5 = oq5Var.K();
            if (!c4) {
            }
            final int i92 = 1;
            K5 = new Function0() { // from class: u9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i92) {
                        case 0:
                            float f23 = f15;
                            float f24 = ((float) 1.5d) + f23;
                            return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                        case 1:
                            float f25 = f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                        case 2:
                            float f26 = -f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                        default:
                            float f27 = -f15;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                    }
                }
            };
            oq5Var.k0(K5);
            Function0 function042 = (Function0) K5;
            c5 = oq5Var.c(f16) | oq5Var.c(f13) | oq5Var.h(fk0Var);
            K6 = oq5Var.K();
            if (!c5) {
            }
            final int i102 = 2;
            K6 = new Function0() { // from class: u9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i102) {
                        case 0:
                            float f23 = f16;
                            float f24 = ((float) 1.5d) + f23;
                            return new cma(hrg.f((Number) fk0Var.e(), f23 * f13, f24));
                        case 1:
                            float f25 = f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f25, f25));
                        case 2:
                            float f26 = -f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f26, f26));
                        default:
                            float f27 = -f16;
                            return new cma(hrg.f((Number) fk0Var.e(), f13 * f27, f27));
                    }
                }
            };
            oq5Var.k0(K6);
            Function0 function052 = (Function0) K6;
            c6 = oq5Var.c(f13) | oq5Var.h(fk0Var);
            K7 = oq5Var.K();
            if (!c6) {
            }
            K7 = new p9v(f13, fk0Var, 6);
            oq5Var.k0(K7);
            Function0 function062 = (Function0) K7;
            f9 = oq5Var.f(b2) | oq5Var.h(fk0Var);
            K8 = oq5Var.K();
            if (!f9) {
            }
            final int i112 = 0;
            K8 = new Function0() { // from class: v9v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i112) {
                        case 0:
                            return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * (1.0f - ((Number) b2.getValue()).floatValue()));
                        default:
                            return Float.valueOf((1.0f - ((Number) fk0Var.e()).floatValue()) * ((Number) b2.getValue()).floatValue());
                    }
                }
            };
            oq5Var.k0(K8);
            a(f20, function042, function052, function062, (Function0) K8, false, oq5Var, 196614, 0);
            c7 = oq5Var.c(f15) | oq5Var.h(fk0Var);
            K9 = oq5Var.K();
            if (!c7) {
            }
            K9 = new p9v(f15, fk0Var, 7);
            oq5Var.k0(K9);
            Function0 function072 = (Function0) K9;
            c8 = oq5Var.c(f16) | oq5Var.h(fk0Var);
            K10 = oq5Var.K();
            if (!c8) {
            }
            K10 = new p9v(f16, fk0Var, 8);
            oq5Var.k0(K10);
            Function0 function082 = (Function0) K10;
            c9 = oq5Var.c(f13) | oq5Var.h(fk0Var);
            K11 = oq5Var.K();
            if (!c9) {
            }
            K11 = new p9v(f13, fk0Var, 9);
            oq5Var.k0(K11);
            Function0 function092 = (Function0) K11;
            K12 = oq5Var.K();
            if (K12 == obj) {
            }
            a(f20, function072, function082, function092, (Function0) K12, false, oq5Var, 24582, 32);
            c10 = oq5Var.c(f18) | oq5Var.h(fk0Var);
            K13 = oq5Var.K();
            if (!c10) {
            }
            K13 = new p9v(f18, fk0Var, 10);
            oq5Var.k0(K13);
            Function0 function0102 = (Function0) K13;
            c11 = oq5Var.c(f19) | oq5Var.h(fk0Var);
            K14 = oq5Var.K();
            if (!c11) {
            }
            K14 = new p9v(f19, fk0Var, 11);
            oq5Var.k0(K14);
            Function0 function0112 = (Function0) K14;
            c12 = oq5Var.c(f17) | oq5Var.h(fk0Var);
            K15 = oq5Var.K();
            if (!c12) {
            }
            K15 = new p9v(f17, fk0Var, 12);
            oq5Var.k0(K15);
            Function0 function0122 = (Function0) K15;
            h = oq5Var.h(fk0Var);
            K16 = oq5Var.K();
            if (!h) {
            }
            K16 = new gn6(fk0Var, 9);
            oq5Var.k0(K16);
            a(f20, function0102, function0112, function0122, (Function0) K16, false, oq5Var, 6, 32);
            oq5Var.p(true);
            f10 = f222;
            f11 = f20;
        }
        final float f23 = f3;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(yciVar, f11, f10, f23, i) { // from class: w9v
                public final /* synthetic */ yci b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int R = rvf.R(49);
                    pcg.p(wl3.this, this.b, this.c, this.d, this.e, (hq5) obj2, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final q7q q(t7q t7qVar) {
        t7qVar.getClass();
        if (t7qVar instanceof q7q) {
            return (q7q) t7qVar;
        }
        if (Intrinsics.d(t7qVar, r7q.a) || (t7qVar instanceof s7q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final Object r(lcg lcgVar, cg6 cg6Var) {
        try {
            if (lcgVar.isDone()) {
                return k9.h(lcgVar);
            }
            zt3 zt3Var = new zt3(1, qxe.b(cg6Var));
            lcgVar.a(new uks(lcgVar, zt3Var, 1), g48.a);
            zt3Var.u(new ybg(4, lcgVar));
            Object q = zt3Var.q();
            nm6 nm6Var = nm6.a;
            return q;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                Intrinsics.i();
            }
            throw cause;
        }
    }

    public static final yci s(yci yciVar) {
        yciVar.getClass();
        return a.b(yciVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535).f(androidx.compose.ui.draw.a.c(vci.a, new p1i(6)));
    }

    public static final ukd t(ArrayList arrayList) {
        ukd d;
        Iterator it = arrayList.iterator();
        skd skdVar = skd.a;
        while (it.hasNext()) {
            ukd ukdVar = (ukd) it.next();
            if (ukdVar != null && (d = skdVar.d(ukdVar)) != null) {
                skdVar = d;
            }
        }
        return skdVar;
    }

    public static xr7 u(ovn ovnVar, Object obj, wc3 wc3Var, Function0 function0, sqn sqnVar) {
        ovnVar.getClass();
        sqnVar.getClass();
        h hVar = (h) function0.invoke();
        xr7 xr7Var = new xr7(obj, wc3Var, hVar, sqnVar);
        l7h.a();
        if (!xr7Var.h) {
            xr7Var.h = true;
            int i = 0;
            int i2 = 1;
            xr7Var.d.c(zdg.A(new o57(i2, xr7Var, xr7.class, "onIntent", "onIntent(Ljava/lang/Object;)V", i, 2)));
            xr7Var.e.c(zdg.A(new o57(i2, xr7Var, xr7.class, "onAction", "onAction(Ljava/lang/Object;)V", i, 3)));
            q6k.y(hVar.a, new wr7(xr7Var));
            if (wc3Var != null) {
                wc3Var.d(new az6(12, xr7Var));
            }
            if (wc3Var != null) {
                wc3Var.invoke();
            }
        }
        return xr7Var;
    }

    public static final View v(View view, ViewGroup viewGroup, dyj dyjVar, int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        L(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(R.id.save_overlay_view, imageView);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        int i = 4;
        view.setVisibility(4);
        overlay.add(imageView);
        dyjVar.b(new eto(1, view, overlay, imageView));
        K(view, new j5n(19, imageView, view));
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new ac8(imageView, view, i));
            return imageView;
        }
        K(view, null);
        return imageView;
    }

    public static final q7q w(g4q g4qVar) {
        g4qVar.getClass();
        return q((t7q) ((xdr) g4qVar.getState()).getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void x(ImageView imageView, View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        imageView.setImageBitmap(createBitmap);
        yp8 yp8Var = view instanceof yp8 ? (yp8) view : null;
        if (yp8Var == null || yp8Var.getDivBorderDrawer() == null) {
            return;
        }
        imageView.setClipToOutline(view.getClipToOutline());
        imageView.setOutlineProvider(view.getOutlineProvider());
    }

    public static void y(jpa jpaVar, ocg ocgVar, ai3 ai3Var, float f, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        boolean z = ocgVar instanceof ayj;
        dbc dbcVar = dbc.a;
        if (z) {
            ynn ynnVar = ((ayj) ocgVar).j;
            float f3 = ynnVar.a;
            jpaVar.F0(ai3Var, (Float.floatToRawIntBits(ynnVar.b) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), N(ynnVar), f2, dbcVar, null, 3);
            return;
        }
        if (!(ocgVar instanceof byj)) {
            if (ocgVar instanceof zxj) {
                jpaVar.e0(((zxj) ocgVar).j, ai3Var, f2, dbcVar, 3);
                return;
            } else {
                b6e.s();
                return;
            }
        }
        byj byjVar = (byj) ocgVar;
        nh0 nh0Var = byjVar.k;
        if (nh0Var != null) {
            jpaVar.e0(nh0Var, ai3Var, f2, dbcVar, 3);
            return;
        }
        jgo jgoVar = byjVar.j;
        float intBitsToFloat = Float.intBitsToFloat((int) (jgoVar.h >> 32));
        float f4 = jgoVar.a;
        jpaVar.l0(ai3Var, (Float.floatToRawIntBits(jgoVar.b) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32), (Float.floatToRawIntBits(jgoVar.b()) << 32) | (Float.floatToRawIntBits(jgoVar.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f2, dbcVar);
    }

    public static void z(jpa jpaVar, ocg ocgVar, long j, amr amrVar, int i) {
        kpa kpaVar = (i & 8) != 0 ? dbc.a : amrVar;
        if (ocgVar instanceof ayj) {
            ynn ynnVar = ((ayj) ocgVar).j;
            float f = ynnVar.a;
            jpaVar.v0(j, (Float.floatToRawIntBits(ynnVar.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), N(ynnVar), 1.0f, kpaVar, null, 3);
            return;
        }
        if (!(ocgVar instanceof byj)) {
            if (ocgVar instanceof zxj) {
                jpaVar.f(((zxj) ocgVar).j, j, 1.0f, kpaVar);
                return;
            } else {
                b6e.s();
                return;
            }
        }
        byj byjVar = (byj) ocgVar;
        nh0 nh0Var = byjVar.k;
        if (nh0Var != null) {
            jpaVar.f(nh0Var, j, 1.0f, kpaVar);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (byjVar.j.h >> 32));
        jpaVar.H(j, (Float.floatToRawIntBits(r0.a) << 32) | (Float.floatToRawIntBits(r0.b) & 4294967295L), (Float.floatToRawIntBits(r0.b()) << 32) | (Float.floatToRawIntBits(r0.a()) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), kpaVar);
    }
}
