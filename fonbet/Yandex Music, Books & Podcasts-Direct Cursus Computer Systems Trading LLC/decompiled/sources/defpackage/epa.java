package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Trace;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.plus.bdui.plus.webview.navigation.a;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.c;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.OverlappingImagesView;
import com.yandex.plus.home.repository.api.model.user.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class epa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ epa(mb5 mb5Var, lvf lvfVar, lti ltiVar, boolean z) {
        this.a = 1;
        this.c = mb5Var;
        this.d = lvfVar;
        this.e = ltiVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterable iterable;
        int i = this.a;
        int i2 = 8;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj2;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                jpa.B(jpaVar, c3x.M(d85.b(((d85) ((pj2) obj4).a.b.getValue()).a, 0.88f, 0.0f, 0.0f, 0.0f, 14), d85.b(d85.b, z ? ((Number) function0.invoke()).floatValue() * 0.88f : 0.0f, 0.0f, 0.0f, 0.0f, 14), ((Number) function02.invoke()).floatValue()), 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 1:
                lvf lvfVar = (lvf) obj3;
                lti ltiVar = (lti) obj2;
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                qu2 qu2Var = ((mb5) obj4).c;
                if ((qu2Var instanceof nfg) && qu2Var.a && lvfVar.d() == 0) {
                    vuf.Y(vufVar, null, zsd.e, 3);
                } else {
                    vufVar.Z(lvfVar.d(), new u8b(9, lvfVar), new u8b(i2, lvfVar), new wn5(new jv(11, lvfVar, ltiVar), -332800242, true));
                    vuf.Y(vufVar, null, new wn5(new o91(lvfVar, z, 5), 1115423671, true), 3);
                }
                return Unit.a;
            case 2:
                lhk lhkVar = (lhk) obj4;
                bve bveVar = (bve) obj3;
                iv8 iv8Var = (iv8) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (z && booleanValue) {
                    i3 = 1;
                }
                String str = iv8Var.b;
                if (str != null) {
                    lhkVar.getClass();
                    if (!StringsKt.U(str)) {
                        lhkVar.l.a(lhkVar.k, lhkVar.n, str);
                    }
                }
                rdk rdkVar = lhkVar.s;
                if (rdkVar != null) {
                    x3n x3nVar = (x3n) rdkVar.e;
                    if (x3nVar != null) {
                        nmb d0 = x3nVar.d0();
                        wkj wkjVar = (wkj) x3nVar.d;
                        String R = x3n.R(wkjVar.a);
                        String R2 = x3n.R(wkjVar.b);
                        String R3 = x3n.R(wkjVar.c);
                        String str2 = (String) x3nVar.a;
                        d0.getClass();
                        str2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("offersBatchId", R);
                        linkedHashMap.put("offersPositionIds", R2);
                        linkedHashMap.put("billingProductIds", R3);
                        dfi.p(1, "communication_id", str2, "_meta", linkedHashMap);
                        d0.C("PurchaseFullscreen.Tapped", linkedHashMap);
                    }
                    ((lkj) ((kkj) ((jyr) rdkVar.d).getValue())).a(bveVar);
                }
                x97.y(ot0.F(lhkVar), null, null, new cg1((Object) lhkVar, (Object) bveVar, (boolean) i3, (Continuation) null, 12), 3);
                return Unit.a;
            case 3:
                ucg ucgVar = (ucg) obj4;
                String str3 = (String) obj3;
                n5w n5wVar = (n5w) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof c5w) {
                    ucgVar.c.compareAndSet(-256, ((c5w) th).a);
                }
                if (z && str3 != null) {
                    ogp ogpVar = n5wVar.e.m;
                    int hashCode = n5wVar.a.hashCode();
                    ogpVar.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        aqs.b(y7g.X(str3), hashCode);
                    } else {
                        String X = y7g.X(str3);
                        try {
                            if (y7g.d == null) {
                                y7g.d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            y7g.d.invoke(null, Long.valueOf(y7g.a), X, Integer.valueOf(hashCode));
                        } catch (Exception e) {
                            y7g.E("asyncTraceEnd", e);
                        }
                    }
                }
                return Unit.a;
            default:
                c cVar = (c) obj4;
                d dVar = (d) obj3;
                b bVar = (b) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                viewGroup.getClass();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams == null) {
                    jj4.j("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (!z && cVar.a.f) {
                    i3 = cVar.m;
                }
                marginLayoutParams.setMarginStart(i3);
                viewGroup.setLayoutParams(marginLayoutParams);
                ArrayList arrayList = cVar.n;
                if (arrayList.isEmpty()) {
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.b bVar2 = cVar.a;
                    int i4 = dVar.a;
                    if (i4 <= 0) {
                        i4 = dVar.c.size() + 1;
                    }
                    OverlappingImagesView overlappingImagesView = bVar2.c;
                    if (overlappingImagesView != null) {
                        boolean z2 = bVar2.f;
                        int i5 = z2 ? bVar2.g : bVar2.h;
                        int i6 = z2 ? bVar2.i : bVar2.j;
                        int i7 = bVar2.k;
                        overlappingImagesView.a = i5;
                        overlappingImagesView.b = i6;
                        overlappingImagesView.c = i7;
                        Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        overlappingImagesView.h = new Canvas(createBitmap);
                        overlappingImagesView.i = createBitmap;
                    }
                    OverlappingImagesView overlappingImagesView2 = bVar2.c;
                    if (overlappingImagesView2 != null) {
                        overlappingImagesView2.setMask(R.drawable.plus_sdk_ic_family_empty_new);
                    }
                    OverlappingImagesView overlappingImagesView3 = bVar2.c;
                    if (overlappingImagesView3 != null) {
                        overlappingImagesView3.setImagesCount(i4);
                    }
                    OverlappingImagesView overlappingImagesView4 = bVar2.c;
                    if (overlappingImagesView4 == null || (iterable = jhp.k(jhp.e(new o7t(new wz0(i2, overlappingImagesView4), new a(25))))) == null) {
                        iterable = c5b.a;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Boolean.valueOf(arrayList.add(new com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.a((ImageView) it.next(), cVar.b, bVar))));
                    }
                }
                cVar.i(z, dVar);
                return Unit.a;
        }
    }

    public /* synthetic */ epa(lhk lhkVar, bve bveVar, boolean z, iv8 iv8Var) {
        this.a = 2;
        this.c = lhkVar;
        this.d = bveVar;
        this.b = z;
        this.e = iv8Var;
    }

    public /* synthetic */ epa(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }
}
