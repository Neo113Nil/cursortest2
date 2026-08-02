package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.multimodal_route.ui.detailed_card.g;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import com.yandex.messaging.input.quote.QuotePresenter$QuoteType;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.PfmAnalyticsItemStatePfm;
import com.ybsdk.core.analytics.generated.PfmDetailsButtonPfm;
import com.ybsdk.core.utils.date.YbDateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.rt.ebs.cryptosdk.core.registration.controllers.IRegistrationController;
import ru.rt.ebs.cryptosdk.core.registration.di.IRegistrationComponent;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.postcard.presentation.ui.d;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;

/* loaded from: classes13.dex */
public final class xv10 implements a9b, cbi0, ec90, wni, IRegistrationComponent {
    public final Object a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    public xv10(kk2 kk2Var, ety0 ety0Var, List list, fwi fwiVar, dyr dyrVar) {
        int i;
        String str;
        int i2;
        List list2;
        kk2 kk2Var2 = kk2Var;
        ety0 ety0Var2 = ety0Var;
        this.a = kk2Var2;
        this.b = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i3 = 0;
        this.c = a.b(lazyThreadSafetyMode, new sls(this) { // from class: im40
            public final /* synthetic */ xv10 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                dc90 dc90Var = null;
                int i5 = 1;
                xv10 xv10Var = this.b;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xv10Var.x;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b = ((dc90) r0).a.b();
                            int f = scc.f(arrayList);
                            boolean z = r0;
                            if (1 <= f) {
                                while (true) {
                                    Object obj = arrayList.get(i5);
                                    float b2 = ((dc90) obj).a.b();
                                    r0 = z;
                                    if (Float.compare(b, b2) < 0) {
                                        r0 = obj;
                                        b = b2;
                                    }
                                    if (i5 != f) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            dc90Var = r0;
                        }
                        dc90 dc90Var2 = dc90Var;
                        return Float.valueOf(dc90Var2 != null ? dc90Var2.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xv10Var.x;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((dc90) r02).a.B.c();
                            int f2 = scc.f(arrayList2);
                            boolean z2 = r02;
                            if (1 <= f2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i5);
                                    float c2 = ((dc90) obj2).a.B.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i5 != f2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            dc90Var = r02;
                        }
                        dc90 dc90Var3 = dc90Var;
                        return Float.valueOf(dc90Var3 != null ? dc90Var3.a.B.c() : 0.0f);
                }
            }
        });
        final int i4 = 1;
        this.w = a.b(lazyThreadSafetyMode, new sls(this) { // from class: im40
            public final /* synthetic */ xv10 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.sls
            public final Object invoke() {
                int i42 = i4;
                dc90 dc90Var = null;
                int i5 = 1;
                xv10 xv10Var = this.b;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) xv10Var.x;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b = ((dc90) r0).a.b();
                            int f = scc.f(arrayList);
                            boolean z = r0;
                            if (1 <= f) {
                                while (true) {
                                    Object obj = arrayList.get(i5);
                                    float b2 = ((dc90) obj).a.b();
                                    r0 = z;
                                    if (Float.compare(b, b2) < 0) {
                                        r0 = obj;
                                        b = b2;
                                    }
                                    if (i5 != f) {
                                        i5++;
                                        z = r0;
                                    }
                                }
                            }
                            dc90Var = r0;
                        }
                        dc90 dc90Var2 = dc90Var;
                        return Float.valueOf(dc90Var2 != null ? dc90Var2.a.b() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) xv10Var.x;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((dc90) r02).a.B.c();
                            int f2 = scc.f(arrayList2);
                            boolean z2 = r02;
                            if (1 <= f2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i5);
                                    float c2 = ((dc90) obj2).a.B.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i5 != f2) {
                                        i5++;
                                        z2 = r02;
                                    }
                                }
                            }
                            dc90Var = r02;
                        }
                        dc90 dc90Var3 = dc90Var;
                        return Float.valueOf(dc90Var3 != null ? dc90Var3.a.B.c() : 0.0f);
                }
            }
        });
        gc90 gc90Var = ety0Var2.b;
        kk2 kk2Var3 = mk2.a;
        ArrayList arrayList = kk2Var2.w;
        String str2 = kk2Var2.b;
        EmptyList emptyList = EmptyList.a;
        List x0 = arrayList != null ? kotlin.collections.a.x0(arrayList, new lk2()) : emptyList;
        ArrayList arrayList2 = new ArrayList();
        x43 x43Var = new x43();
        int size = x0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            ik2 ik2Var = (ik2) x0.get(i5);
            ik2 a = ik2.a(ik2Var, gc90Var.a((gc90) ik2Var.a), i3, 14);
            Object obj = a.a;
            int i7 = a.c;
            int i8 = a.b;
            while (i6 < i8 && !x43Var.isEmpty()) {
                ik2 ik2Var2 = (ik2) x43Var.last();
                List list3 = x0;
                int i9 = ik2Var2.c;
                EmptyList emptyList2 = emptyList;
                Object obj2 = ik2Var2.a;
                if (i8 < i9) {
                    arrayList2.add(new ik2(obj2, i6, i8));
                    i6 = i8;
                    x0 = list3;
                    emptyList = emptyList2;
                } else {
                    int i10 = size;
                    arrayList2.add(new ik2(obj2, i6, i9));
                    i6 = ik2Var2.c;
                    while (!x43Var.isEmpty() && i6 == ((ik2) x43Var.last()).c) {
                        x43Var.removeLast();
                    }
                    x0 = list3;
                    emptyList = emptyList2;
                    size = i10;
                }
            }
            List list4 = x0;
            EmptyList emptyList3 = emptyList;
            int i11 = size;
            if (i6 < i8) {
                arrayList2.add(new ik2(gc90Var, i6, i8));
                i6 = i8;
            }
            ik2 ik2Var3 = (ik2) x43Var.h();
            if (ik2Var3 != null) {
                int i12 = ik2Var3.c;
                Object obj3 = ik2Var3.a;
                int i13 = ik2Var3.b;
                if (i13 == i8 && i12 == i7) {
                    x43Var.removeLast();
                    x43Var.addLast(new ik2(((gc90) obj3).a((gc90) obj), i8, i7));
                } else if (i13 == i12) {
                    arrayList2.add(new ik2(obj3, i13, i12));
                    x43Var.removeLast();
                    x43Var.addLast(new ik2(obj, i8, i7));
                } else {
                    if (i12 < i7) {
                        w511.q();
                        throw null;
                    }
                    x43Var.addLast(new ik2(((gc90) obj3).a((gc90) obj), i8, i7));
                }
            } else {
                x43Var.addLast(new ik2(obj, i8, i7));
            }
            i5++;
            x0 = list4;
            emptyList = emptyList3;
            size = i11;
            i3 = 0;
        }
        EmptyList emptyList4 = emptyList;
        while (i6 <= str2.length() && !x43Var.isEmpty()) {
            ik2 ik2Var4 = (ik2) x43Var.last();
            Object obj4 = ik2Var4.a;
            int i14 = ik2Var4.c;
            arrayList2.add(new ik2(obj4, i6, i14));
            while (!x43Var.isEmpty() && i14 == ((ik2) x43Var.last()).c) {
                x43Var.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new ik2(gc90Var, i6, str2.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new ik2(gc90Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            ik2 ik2Var5 = (ik2) arrayList2.get(i15);
            int i16 = ik2Var5.b;
            int i17 = ik2Var5.c;
            String substring = i16 != i17 ? str2.substring(i16, i17) : "";
            List c = mk2.c(kk2Var2, i16, i17, new f22(18));
            kk2 kk2Var4 = new kk2(substring, c == null ? emptyList4 : c);
            gc90 gc90Var2 = (gc90) ik2Var5.a;
            if (gc90Var2.b == 0) {
                str = str2;
                i2 = size2;
                gc90Var2 = new gc90(gc90Var2.a, gc90Var.b, gc90Var2.c, gc90Var2.d, gc90Var2.e, gc90Var2.f, gc90Var2.g, gc90Var2.h, gc90Var2.i);
            } else {
                str = str2;
                i2 = size2;
            }
            ety0 ety0Var3 = new ety0(ety0Var2.a, gc90Var.a(gc90Var2));
            ?? r5 = kk2Var4.a;
            EmptyList emptyList5 = r5 == 0 ? emptyList4 : r5;
            List list5 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i18 = 0;
            while (i18 < size3) {
                ik2 ik2Var6 = (ik2) list5.get(i18);
                int i19 = ik2Var6.b;
                gc90 gc90Var3 = gc90Var;
                int i20 = ik2Var6.c;
                if (mk2.d(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        jxv.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new ik2(ik2Var6.a, i19 - i16, i20 - i16));
                } else {
                    list2 = list5;
                }
                i18++;
                list5 = list2;
                gc90Var = gc90Var3;
            }
            arrayList3.add(new dc90(new ib2(substring, ety0Var3, emptyList5, arrayList4, dyrVar, fwiVar), i16, i17));
            i15++;
            kk2Var2 = kk2Var;
            ety0Var2 = ety0Var;
            str2 = str;
            size2 = i2;
        }
        this.x = arrayList3;
    }

    public static void g(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static ArrayList p(String str, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof g9b0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g9b0 g9b0Var = (g9b0) it.next();
            arrayList2.add(new i9b0(g9b0Var.a, str == null ? false : g9b0Var.b.equals(str) ? PfmAnalyticsItemStatePfm.SELECTED : PfmAnalyticsItemStatePfm.NOT_SELECTED));
        }
        return arrayList2;
    }

    @Override // defpackage.ec90
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.x;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((dc90) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ec90
    public float b() {
        return ((Number) ((i3y) this.c).getValue()).floatValue();
    }

    @Override // defpackage.cbi0
    public void c(ServerMessageRef serverMessageRef, long j, MessageReactions messageReactions) {
        ((Handler) this.x).post(new wv10(this, serverMessageRef, j, messageReactions));
    }

    @Override // defpackage.a9b
    public void close() {
        z83.g(null, ((Handler) this.x).getLooper(), Looper.myLooper());
        this.b = null;
        this.w = null;
    }

    @Override // defpackage.ec90
    public float d() {
        return ((Number) ((i3y) this.w).getValue()).floatValue();
    }

    public Bitmap e(zwy0 zwy0Var) {
        Bitmap a;
        tcc0 tcc0Var = (tcc0) this.b;
        i3y i3yVar = (i3y) this.c;
        int intValue = ((Number) i3yVar.getValue()).intValue();
        int intValue2 = ((Number) i3yVar.getValue()).intValue();
        i3y i3yVar2 = (i3y) this.w;
        a = tcc0Var.a(zwy0Var, intValue, intValue2, (r24 & 8) != 0 ? 0 : ((Number) i3yVar2.getValue()).intValue(), (r24 & 16) != 0 ? 0 : ((Number) i3yVar2.getValue()).intValue(), (r24 & 32) != 0 ? 0 : ((Number) ((i3y) this.x).getValue()).intValue(), (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? 0 : 0, (r24 & 256) == 0, null, null);
        return a;
    }

    public rs10 f() {
        if (((rd2) this.c) == null) {
            this.c = new rd2(this);
        }
        return (rd2) this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.registration.di.IRegistrationComponent
    public IRegistrationController getRegistrationController() {
        wqi0 wqi0Var = (wqi0) this.x;
        if (wqi0Var != null) {
            return wqi0Var;
        }
        IKeyStorage prefsKeyStorage = ((hwo0) this.a).prefsKeyStorage(((mpe) this.w).e);
        qwu j = ((boj0) this.b).j(k4w.b);
        wqi0 wqi0Var2 = new wqi0(new eri0(new h9e(1, j), prefsKeyStorage), ((ht10) this.c).getMetadataController());
        this.x = wqi0Var2;
        return wqi0Var2;
    }

    public void h() {
        if (((pey) this.a).getLifecycle().b() == Lifecycle.State.DESTROYED) {
            jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
        } else {
            ((sey) this.c).b(new t9b0(8, this));
        }
    }

    public void i(y0c0 y0c0Var, b1c0 b1c0Var) {
        if (((pey) this.a).getLifecycle().b() == Lifecycle.State.DESTROYED) {
            jst.e.r("Why you try to register MapApi on destroyed lifecycleOwner?", new IllegalStateException());
        } else {
            ((sey) this.c).b(new kub0(this, y0c0Var, b1c0Var, 0));
        }
    }

    public void j(String str, PfmDetailsButtonPfm pfmDetailsButtonPfm) {
        l0p l0pVar = ((AppAnalyticsReporter) this.a).R;
        LinkedHashMap w = g8e.w(2, "filter_id", str);
        w.put("button", pfmDetailsButtonPfm.getOriginalValue());
        l0pVar.a.a("pfm.analytics.filter.details.button.click", w);
    }

    public void k(String str, String str2, boolean z) {
        l0p l0pVar = ((AppAnalyticsReporter) this.a).R;
        PfmAnalyticsItemStatePfm pfmAnalyticsItemStatePfm = z ? PfmAnalyticsItemStatePfm.SELECTED : PfmAnalyticsItemStatePfm.NOT_SELECTED;
        LinkedHashMap w = g8e.w(3, "filter_id", str);
        LinkedHashMap w2 = g8e.w(2, "id", str2);
        w2.put(ClidProvider.STATE, pfmAnalyticsItemStatePfm.getOriginalValue());
        w.put(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, w2);
        l0pVar.a.a("pfm.analytics.filter.details.item.click", w);
    }

    public void l(Set set, Set set2, Set set3, String str, String str2) {
        ((AppAnalyticsReporter) this.a).R.f(null, r(str2, set, set2), null, p(str, set3));
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.a, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1581863555, new tfe0(this, 0), true));
        return composeView;
    }

    public void n(Runnable runnable) {
        Context context = (Context) this.w;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public p9b0 o(l4r l4rVar) {
        Calendar calendar = l4rVar.c;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.x;
        String format = simpleDateFormat.format(calendar.getTime());
        String format2 = simpleDateFormat.format(kdb1.e().getTime());
        Calendar calendar2 = l4rVar.f;
        String format3 = calendar2 != null ? simpleDateFormat.format(calendar2.getTime()) : null;
        Calendar calendar3 = l4rVar.g;
        return new p9b0(format, format2, format3, calendar3 != null ? simpleDateFormat.format(calendar3.getTime()) : null);
    }

    public yab0 q(j4r j4rVar, Set set, String str) {
        PfmAnalyticsItemStatePfm pfmAnalyticsItemStatePfm;
        ArrayList arrayList;
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (jl40.l(((vcb0) it.next()).a(), j4rVar.a)) {
                    pfmAnalyticsItemStatePfm = PfmAnalyticsItemStatePfm.SELECTED;
                    break;
                }
            }
        }
        pfmAnalyticsItemStatePfm = PfmAnalyticsItemStatePfm.NOT_SELECTED;
        ((vab0) this.b).getClass();
        s4r a = vab0.a(j4rVar, set, str);
        String str2 = j4rVar.a;
        if (a instanceof l4r) {
            return new yab0(str2, pfmAnalyticsItemStatePfm, o((l4r) a), null);
        }
        if (!(a instanceof r4r)) {
            w511.b();
            return null;
        }
        q4r q4rVar = ((r4r) a).c;
        if (q4rVar instanceof n4r) {
            n4r n4rVar = (n4r) q4rVar;
            String str3 = n4rVar.a;
            List list = n4rVar.b;
            arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str4 = ((m4r) it2.next()).d;
                arrayList.add(new zab0(str4, str3 == null ? false : str4.equals(str3) ? PfmAnalyticsItemStatePfm.SELECTED : PfmAnalyticsItemStatePfm.NOT_SELECTED));
            }
        } else {
            if (!(q4rVar instanceof p4r)) {
                w511.b();
                return null;
            }
            Set set3 = ((p4r) q4rVar).a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set3) {
                if (((o4r) obj).c) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new tab0(((o4r) it3.next()).b));
            }
            Set N0 = kotlin.collections.a.N0(arrayList3);
            arrayList = new ArrayList(tcc.n(set3, 10));
            Iterator it4 = set3.iterator();
            while (it4.hasNext()) {
                String str5 = ((o4r) it4.next()).b;
                arrayList.add(new zab0(str5, N0.contains(new tab0(str5)) ? PfmAnalyticsItemStatePfm.SELECTED : PfmAnalyticsItemStatePfm.NOT_SELECTED));
            }
        }
        return new yab0(str2, pfmAnalyticsItemStatePfm, null, arrayList);
    }

    public ArrayList r(String str, Set set, Set set2) {
        Set set3 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
        Iterator it = set3.iterator();
        while (it.hasNext()) {
            arrayList.add(q((j4r) it.next(), set2, str));
        }
        return arrayList;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        this.x = null;
    }

    public void s() {
        epb0 epb0Var = (epb0) this.x;
        dpb0 dpb0Var = (dpb0) epb0Var.a.getValue();
        cpb0 cpb0Var = dpb0Var instanceof cpb0 ? (cpb0) dpb0Var : null;
        if (cpb0Var != null) {
            epb0Var.a(new cpb0(cpb0Var.a, zob0.a));
        }
    }

    @Override // defpackage.a9b
    public e1k w(s020 s020Var) {
        return ((fw10) ((m8g) s020Var).v0.get()).c((TimestampRange) this.a, this, (Long[]) this.c, (f5b) this.w);
    }

    public xv10(bri0 bri0Var, hwo0 hwo0Var, boj0 boj0Var, ht10 ht10Var, mpe mpeVar) {
        this.a = hwo0Var;
        this.b = boj0Var;
        this.c = ht10Var;
        this.w = mpeVar;
    }

    public xv10(uk10 uk10Var, ht10 ht10Var) {
        this.a = uk10Var;
        this.b = ht10Var;
        this.c = Executors.newSingleThreadExecutor();
        this.x = new Handler(Looper.getMainLooper());
        new d240(25, this);
        new jq50(1, this);
        this.w = new AtomicBoolean(false);
    }

    public xv10(flex.engine.a aVar, y7c0 y7c0Var, String str, q6c0 q6c0Var) {
        this.a = aVar;
        this.b = y7c0Var;
        this.c = str;
        this.w = q6c0Var;
        this.x = new kn5(1, this);
    }

    public xv10(Context context, tcc0 tcc0Var) {
        this.a = context;
        this.b = tcc0Var;
        int i = 28;
        this.c = a.a(new xw90(i, this, new sfc0(1)));
        this.w = a.a(new xw90(i, this, new sfc0(2)));
        this.x = a.a(new xw90(i, this, new sfc0(3)));
    }

    public xv10(h3y h3yVar, xdf0 xdf0Var, at2 at2Var, h3y h3yVar2) {
        this.a = h3yVar;
        this.b = xdf0Var;
        this.c = at2Var;
        this.w = h3yVar2;
    }

    public xv10(f fVar, z711 z711Var, g gVar, es40 es40Var) {
        this.a = fVar;
        this.b = z711Var;
        this.c = gVar;
        this.w = es40Var;
        this.x = a.a(new d240(7, this));
    }

    public xv10(Context context, hwy0 hwy0Var, d dVar, dci dciVar) {
        this.a = context;
        this.b = hwy0Var;
        this.c = dVar;
        this.w = dciVar;
        this.x = UUID.randomUUID().toString();
    }

    public xv10(AppAnalyticsReporter appAnalyticsReporter, vab0 vab0Var) {
        this.a = appAnalyticsReporter;
        this.b = vab0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YbDateFormat.ISO_8601_Z.getPattern(), Locale.ROOT);
        simpleDateFormat.setLenient(false);
        this.x = simpleDateFormat;
    }

    public xv10(TimestampRange timestampRange, cbi0 cbi0Var, Long[] lArr, f5b f5bVar) {
        this.a = timestampRange;
        this.b = cbi0Var;
        this.c = lArr;
        this.w = f5bVar;
        this.x = new Handler();
    }

    public /* synthetic */ xv10(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
    }

    public /* synthetic */ xv10(String str, List list, QuotePresenter$QuoteType quotePresenter$QuoteType, String str2, g720 g720Var, int i) {
        this(str, list, quotePresenter$QuoteType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : g720Var);
    }

    public xv10(tt5 tt5Var, Context context, orr orrVar) {
        this.a = tt5Var;
        this.b = new w4u(new g191(new pd2(tt5Var)));
        this.w = context;
        this.x = orrVar;
    }
}
