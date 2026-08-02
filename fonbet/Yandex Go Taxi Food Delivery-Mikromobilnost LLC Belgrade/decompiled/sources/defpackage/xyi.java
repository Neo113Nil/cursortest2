package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment;
import com.yandex.go.performance_class.experiment.DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer;
import com.yandex.go.performance_class.experiment.a;
import com.yandex.go.performance_class.experiment.c;
import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;
import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment$DiscoveryTab$$serializer;
import com.yandex.go.places.experiments.tabbar.d;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;
import com.yandex.quark.dialog.DialogType;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final /* synthetic */ class xyi implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ xyi(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zyi zyiVar = azi.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                j8j j8jVar = k8j.Companion;
                return new p53(tjl0.a, 0);
            case 2:
                a aVar = DevicePerformanceClassExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 3:
                c cVar = DevicePerformanceClassExperiment.DeviceGlobalStats.Companion;
                return new p53(DevicePerformanceClassExperiment$DeviceGlobalStats$Cluster$$serializer.INSTANCE, 0);
            case 4:
                Context context = rcj.a;
                return new dne0(context != null ? context : null).b();
            case 5:
                Context context2 = rcj.a;
                File file = new File((context2 != null ? context2 : null).getFilesDir(), "diagnostic");
                if (!file.exists()) {
                    file.mkdir();
                }
                File file2 = new File(file, "diagnostic_log.txt");
                try {
                    if (file2.exists()) {
                        file2.delete();
                    }
                } catch (Exception unused) {
                    jst.e.getClass();
                }
                return new BufferedWriter(new FileWriter(file2));
            case 6:
                return new o4o("com.yandex.quark.dialog.DialogType", (Enum[]) DialogType.values());
            case 7:
                return l76.A;
            case 8:
                com.yandex.go.places.experiments.tabbar.c cVar2 = DiscoveryTabbarExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 9:
                com.yandex.go.places.experiments.tabbar.c cVar3 = DiscoveryTabbarExperiment.Companion;
                return new p53(DiscoveryTabbarExperiment$DiscoveryTab$$serializer.INSTANCE, 0);
            case 10:
                d dVar = DiscoveryTabbarExperiment.DiscoveryTab.Companion;
                return DiscoveryTabbarExperiment.DiscoveryTabType.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment.DiscoveryTabType", DiscoveryTabbarExperiment.DiscoveryTabType.values(), new String[]{"native_tab", "flex_tab"}, new Annotation[][]{null, null});
            case 12:
                return new p53(tgc.Companion.serializer(), 0);
            case 13:
                return new o4o("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto.HorizontalRuleDto", (Enum[]) DisplayRulesDto$HorizontalRuleDto.values());
            case 14:
                return new o4o("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto.VerticalRuleDto", (Enum[]) DisplayRulesDto$VerticalRuleDto.values());
            case 15:
                return vzj.Companion.serializer();
            case 16:
                return new o4o("Fill", qzj.INSTANCE, new Annotation[0]);
            case 17:
                return new o4o("Fit", rzj.INSTANCE, new Annotation[0]);
            case 18:
                byk bykVar = DivKitScaffoldPadding.Companion;
                return h690.Companion.serializer();
            case 19:
                return new p53(DivkitSnippet.Companion.serializer(), 0);
            case 20:
                return DivkitSnippet.Companion.serializer();
            case 21:
                return DivkitSnippet.Companion.serializer();
            case 22:
                return mw5.Companion.serializer();
            case 23:
                return new k8u(auu0.a, new oke(qoi0.a(kr.class), null, new KSerializer[0]), 1);
            case 24:
                return DivkitSnippet.Companion.serializer();
            case 25:
                return DivkitSnippet.Companion.serializer();
            case 26:
                return DivkitSnippet.Companion.serializer();
            case 27:
                return ThemedColor.Companion.serializer();
            case 28:
                return DivkitSnippet.Companion.serializer();
            default:
                return Integer.valueOf(View.generateViewId());
        }
    }
}
