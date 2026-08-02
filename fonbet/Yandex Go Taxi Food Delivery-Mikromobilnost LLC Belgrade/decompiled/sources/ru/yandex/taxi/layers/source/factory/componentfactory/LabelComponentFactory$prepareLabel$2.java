package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import defpackage.avj0;
import defpackage.cdc;
import defpackage.f0k;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.hqx;
import defpackage.if61;
import defpackage.jqx;
import defpackage.kjz;
import defpackage.kzg0;
import defpackage.mqg0;
import defpackage.mqx;
import defpackage.mvg;
import defpackage.nqx;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uqx;
import defpackage.vm00;
import defpackage.vng;
import defpackage.vxs;
import defpackage.w511;
import defpackage.w610;
import defpackage.wa60;
import defpackage.wbz0;
import defpackage.wls;
import defpackage.xqx;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.map_object.LabelType;
import ru.yandex.taxi.widget.OutlineSpan;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljqx;", "<anonymous>", "(Ltse;)Ljqx;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.LabelComponentFactory$prepareLabel$2", f = "LabelComponentFactory.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LabelComponentFactory$prepareLabel$2 extends SuspendLambda implements wls {
    final /* synthetic */ vm00 $animation;
    final /* synthetic */ f0k $displaySettings;
    final /* synthetic */ zzs $geometry;
    final /* synthetic */ String $hostMapObjectId;
    final /* synthetic */ hqx $label;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelComponentFactory$prepareLabel$2(zzs zzsVar, hqx hqxVar, x xVar, f0k f0kVar, String str, vm00 vm00Var, Continuation continuation) {
        super(2, continuation);
        this.$geometry = zzsVar;
        this.$label = hqxVar;
        this.this$0 = xVar;
        this.$displaySettings = f0kVar;
        this.$hostMapObjectId = str;
        this.$animation = vm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LabelComponentFactory$prepareLabel$2(this.$geometry, this.$label, this.this$0, this.$displaySettings, this.$hostMapObjectId, this.$animation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LabelComponentFactory$prepareLabel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        uqx uqxVar;
        NinePatchDrawable ninePatchDrawable;
        List list;
        Object b;
        Set set;
        if61 if61Var;
        String str2;
        ?? arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Point F = ru.yandex.taxi.map.utils.a.F(this.$geometry);
            LabelType labelType = this.$label.b;
            if (labelType == null) {
                ny61.g("Required value was null.");
                return null;
            }
            int i2 = mqx.a[labelType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    x xVar = this.this$0;
                    hqx hqxVar = this.$label;
                    f0k f0kVar = this.$displaySettings;
                    kjz kjzVar = xVar.e;
                    Context context = xVar.a;
                    uqx uqxVar2 = xVar.f;
                    avj0 avj0Var = (avj0) xVar.d;
                    int a = avj0Var.a(mqg0.component_paste_yellow_450);
                    ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                    int w = (int) tje.w(90, contextThemeWrapper);
                    Float f = f0kVar.a;
                    if (f == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    float floatValue = f.floatValue();
                    Drawable t = vng.t(f1h0.pickup_label_white_left_top_bg, contextThemeWrapper);
                    if (t == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    wa60 wa60Var = x.l;
                    wa60 wa60Var2 = x.k;
                    nqx l = wbz0.l(kjzVar.c(t, wa60Var2, wa60Var), 0.0f, 0.0f, 0.8f, 0.8f, a, Integer.valueOf(w));
                    uqxVar2.getClass();
                    xqx xqxVar = new xqx(context, l);
                    Drawable t2 = vng.t(f1h0.pickup_label_white_left_bottom_bg, contextThemeWrapper);
                    if (t2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    xqx xqxVar2 = new xqx(context, wbz0.l(kjzVar.c(t2, wa60Var2, wa60Var), 0.0f, 1.0f, -0.8f, 0.8f, a, Integer.valueOf(w)));
                    Drawable t3 = vng.t(f1h0.pickup_label_white_right_top_bg, contextThemeWrapper);
                    obj2 = null;
                    if (t3 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    xqx xqxVar3 = new xqx(context, wbz0.l(kjzVar.c(t3, wa60Var2, wa60Var), 1.0f, 0.0f, 0.8f, -0.8f, a, Integer.valueOf(w)));
                    Drawable t4 = vng.t(f1h0.pickup_label_white_right_bottom_bg, contextThemeWrapper);
                    if (t4 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    List<xqx> g = scc.g(xqxVar, xqxVar2, xqxVar3, new xqx(context, wbz0.l(kjzVar.c(t4, wa60Var2, wa60Var), 1.0f, 1.0f, -0.8f, -0.8f, a, Integer.valueOf(w))));
                    arrayList = new ArrayList(tcc.n(g, 10));
                    for (xqx xqxVar4 : g) {
                        xqxVar4.d(hqxVar.a);
                        arrayList.add(ru.yandex.taxi.layers.source.factory.a.f(xqxVar4, floatValue));
                    }
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    x xVar2 = this.this$0;
                    hqx hqxVar2 = this.$label;
                    f0k f0kVar2 = this.$displaySettings;
                    uqx uqxVar3 = xVar2.f;
                    Context context2 = xVar2.a;
                    kjz kjzVar2 = xVar2.e;
                    Drawable t5 = vng.t(kzg0.ic_zone_area_label, ((avj0) xVar2.d).a);
                    if (t5 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    nqx nqxVar = new nqx(kjzVar2.c(t5, x.i, x.j), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    uqxVar3.getClass();
                    xqx xqxVar5 = new xqx(context2, nqxVar);
                    xqxVar5.d(hqxVar2.a);
                    Float f2 = f0kVar2.a;
                    if (f2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    arrayList = Collections.singletonList(ru.yandex.taxi.layers.source.factory.a.f(xqxVar5, f2.floatValue()));
                    obj2 = null;
                }
                str = "Required value was null.";
                list = arrayList;
            } else {
                obj2 = null;
                hqx hqxVar3 = this.$label;
                Integer num4 = hqxVar3.e;
                Boolean bool = hqxVar3.h;
                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                hqx hqxVar4 = this.$label;
                Float f3 = hqxVar4.j;
                String str3 = hqxVar4.a;
                Float f4 = hqxVar4.k;
                Integer num5 = hqxVar4.i;
                Integer num6 = hqxVar4.f;
                Float f5 = hqxVar4.g;
                Integer num7 = hqxVar4.l;
                Integer num8 = hqxVar4.m;
                Integer num9 = hqxVar4.n;
                x xVar3 = this.this$0;
                boolean z = booleanValue;
                f0k f0kVar3 = this.$displaySettings;
                zuj0 zuj0Var = xVar3.d;
                Context context3 = xVar3.a;
                if (num8 != null) {
                    float intValue = num8.intValue();
                    num = num9;
                    str = "Required value was null.";
                    float applyDimension = TypedValue.applyDimension(2, 13.0f, context3.getResources().getDisplayMetrics());
                    TextPaint textPaint = new TextPaint(1);
                    textPaint.setTextSize(applyDimension);
                    num2 = Integer.valueOf((int) (textPaint.measureText(String.valueOf('M')) * intValue));
                } else {
                    num = num9;
                    str = "Required value was null.";
                    num2 = null;
                }
                uqx uqxVar4 = xVar3.f;
                if (z) {
                    kjz kjzVar3 = xVar3.e;
                    num3 = num2;
                    Drawable t6 = vng.t(f1h0.pickup_label_plain_bg, ((avj0) zuj0Var).a);
                    if (t6 == null) {
                        ny61.g(str);
                        return null;
                    }
                    uqxVar = uqxVar4;
                    ninePatchDrawable = kjzVar3.c(t6, x.g, x.h);
                } else {
                    num3 = num2;
                    uqxVar = uqxVar4;
                    ninePatchDrawable = null;
                }
                nqx nqxVar2 = new nqx(ninePatchDrawable, num4 != null ? num4.intValue() : ((avj0) zuj0Var).a(mqg0.component_paste_yellow_450), f3 != null ? f3.floatValue() : 0.5f, f4 != null ? f4.floatValue() : 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, num5 != null ? num5.intValue() : 3, num != null ? num.intValue() : 2, num3 != null ? num3.intValue() : Integer.MAX_VALUE, num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                uqxVar.getClass();
                xqx xqxVar6 = new xqx(context3, nqxVar2);
                if (num4 == null || num6 == null || f5 == null) {
                    xqxVar6.d(str3);
                } else {
                    SpannableString spannableString = new SpannableString(str3);
                    Regex regex = new Regex("\\S+");
                    if (str3 == null) {
                        str3 = "";
                    }
                    vxs vxsVar = new vxs(Regex.c(regex, str3));
                    while (vxsVar.hasNext()) {
                        w610 w610Var = (w610) vxsVar.next();
                        spannableString.setSpan(new OutlineSpan(s8o.m(new cdc(num4.intValue()), context3), s8o.m(new cdc(num6.intValue()), context3), tje.x(context3, f5.floatValue())), w610Var.b().a, w610Var.b().b + 1, 33);
                    }
                    xqxVar6.d(spannableString);
                }
                Float f6 = f0kVar3.a;
                if (f6 == null) {
                    ny61.g(str);
                    return null;
                }
                list = Collections.singletonList(ru.yandex.taxi.layers.source.factory.a.f(xqxVar6, f6.floatValue()));
            }
            Float[] fArr = this.$label.c;
            if (fArr == null) {
                ny61.g(str);
                return null;
            }
            if61 l2 = ru.yandex.taxi.layers.source.factory.a.l(fArr);
            String str4 = this.$hostMapObjectId;
            Set N0 = kotlin.collections.a.N0(list);
            ru.yandex.taxi.map_common.map.utils.a aVar = this.this$0.c;
            Object obj3 = obj2;
            this.L$0 = obj3;
            this.L$1 = obj3;
            this.L$2 = l2;
            this.L$3 = str4;
            this.L$4 = N0;
            this.label = 1;
            b = aVar.b(F, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            set = N0;
            if61Var = l2;
            str2 = str4;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set2 = (Set) this.L$4;
            String str5 = (String) this.L$3;
            if61 if61Var2 = (if61) this.L$2;
            kotlin.b.b(obj);
            set = set2;
            if61Var = if61Var2;
            str2 = str5;
            b = obj;
        }
        XYPoint xYPoint = (XYPoint) b;
        vm00 vm00Var = this.$animation;
        f4c0 f4c0Var = new f4c0(ru.yandex.taxi.map.utils.a.F(this.$geometry), null, 6);
        f0k f0kVar4 = this.$displaySettings;
        f4c0Var.i(false);
        Float f7 = f0kVar4.a;
        if (f7 != null) {
            f4c0Var.k(f7.floatValue());
        }
        Float f8 = this.$label.o;
        jqx jqxVar = new jqx(if61Var, str2, xYPoint, set, MapObjectComponentType.LABEL, vm00Var, f8 != null ? f8.floatValue() : 0.0f);
        jqxVar.h = f4c0Var;
        return jqxVar;
    }
}
