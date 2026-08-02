package defpackage;

import com.yandex.go.flex.common.api.actions.ShowOnboardingAction;
import com.yandex.go.flex.common.api.actions.m0;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.shortcuts.dto.request.StackItemTypeFeature;
import com.yandex.go.shortcuts.dto.request.t;
import com.yandex.go.shortcuts.dto.response.StackCommon$StackItemType;
import com.yandex.go.special_needs_menu.experiment.SpecialNeedsMenuItemExperiment;
import com.yandex.go.special_needs_menu.experiment.a;
import com.yandex.go.splash.v2.SplashScreenV2Experiment;
import com.yandex.plus.home.common.utils.d;
import flex.engine.section.model.Side;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;

/* loaded from: classes.dex */
public final /* synthetic */ class s7s0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ s7s0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m0 m0Var = ShowOnboardingAction.Companion;
                return new oke(qoi0.a(FormattedText.class), w7s.a, new KSerializer[0]);
            case 1:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 2:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 3:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 4:
                return vez0.g("flex.engine.section.model.Side", Side.values(), new String[]{"top", "bottom"}, new Annotation[][]{null, null});
            case 5:
                return vez0.g("ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition", SkipAlertCondition.values(), new String[]{"requirement_not_selected", "never", "always"}, new Annotation[][]{null, null, null});
            case 6:
                return new u2l(eg90.b);
            case 7:
                sos0 sos0Var = tos0.Companion;
                return new p53(auu0.a, 0);
            case 8:
                sos0 sos0Var2 = tos0.Companion;
                return new p53(auu0.a, 0);
            case 9:
                return new r5z0(System.currentTimeMillis());
            case 10:
                return new o4o("regular", g4t0.INSTANCE, new Annotation[0]);
            case 11:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 12:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 14:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 15:
                cot0 cot0Var = dot0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 16:
                cot0 cot0Var2 = dot0.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 17:
                cot0 cot0Var3 = dot0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 18:
                cot0 cot0Var4 = dot0.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 19:
                cot0 cot0Var5 = dot0.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 20:
                a aVar = SpecialNeedsMenuItemExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 21:
                return new o4o("ru.yandex.taxi.shortcuts.dto.response.superapp.SplashObject.Unsupported", crt0.INSTANCE, new Annotation[0]);
            case 22:
                xby.l(jst.e, "SplashScreenDetachListener", null, null, "Action is empty", 6);
                return zy11.a;
            case 23:
                return Boolean.FALSE;
            case 24:
                com.yandex.go.splash.v2.a aVar2 = SplashScreenV2Experiment.Companion;
                auu0 auu0Var7 = auu0.a;
                return new k8u(auu0Var7, auu0Var7, 1);
            case 25:
                return vez0.g("com.yandex.go.shortcuts.dto.response.StackCommon.StackItemType", StackCommon$StackItemType.values(), new String[]{null, "thumb", "info", "button", "rating", "price"}, new Annotation[][]{null, null, null, null, null, null});
            case 26:
                t tVar = StackItemTypeFeature.Companion;
                return StackCommon$StackItemType.Companion.serializer();
            case 27:
                return new d();
            case 28:
                return Mode.Companion.serializer();
            default:
                return Screen.Companion.serializer();
        }
    }
}
