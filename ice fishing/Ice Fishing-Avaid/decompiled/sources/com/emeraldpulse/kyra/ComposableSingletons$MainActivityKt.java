package com.emeraldpulse.kyra;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.createyourself.policy.PolicyGateKt;
import com.createyourself.policy.PolicyWebViewHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$897871288 = ComposableLambdaKt.composableLambdaInstance(897871288, false, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$897871288$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C85@3666L17:MainActivity.kt#f5odrr");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897871288, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$897871288.<anonymous> (MainActivity.kt:85)");
            }
            MainActivityKt.EmeraldPulseApp(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-307036538, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f44lambda$307036538 = ComposableLambdaKt.composableLambdaInstance(-307036538, false, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-307036538$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C79@3405L26,80@3448L253:MainActivity.kt#f5odrr");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307036538, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-307036538.<anonymous> (MainActivity.kt:79)");
            }
            PolicyGateKt.PolicyGate(PolicyGateKt.rememberPolicyController(null, composer, 0, 1), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PolicyWebViewHost.POLICY_BASE_URL, null, false, null, null, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$897871288$app_release(), composer, 100666416, 244);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-959614609, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f46lambda$959614609 = ComposableLambdaKt.composableLambdaInstance(-959614609, false, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-959614609$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C78@3346L369:MainActivity.kt#f5odrr");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-959614609, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-959614609.<anonymous> (MainActivity.kt:78)");
            }
            MainActivityKt.EmeraldPulseTheme(ComposableSingletons$MainActivityKt.INSTANCE.m10378getLambda$307036538$app_release(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-438824786, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f45lambda$438824786 = ComposableLambdaKt.composableLambdaInstance(-438824786, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-438824786$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C356@13455L33:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438824786, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-438824786.<anonymous> (MainActivity.kt:356)");
            }
            TextKt.m4292TextNvy7gAk("Restore starter inventory", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1534059554, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f39lambda$1534059554 = ComposableLambdaKt.composableLambdaInstance(-1534059554, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-1534059554$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C450@17528L43:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1534059554, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-1534059554.<anonymous> (MainActivity.kt:450)");
            }
            TextKt.m4292TextNvy7gAk("Reset to Emerald Pulse starter plan", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$884247033 = ComposableLambdaKt.composableLambdaInstance(884247033, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$884247033$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            ComposerKt.sourceInformation(composer, "C561@22453L25:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(884247033, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$884247033.<anonymous> (MainActivity.kt:561)");
            }
            TextKt.m4292TextNvy7gAk("Reset room checks", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1610882868 = ComposableLambdaKt.composableLambdaInstance(1610882868, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$1610882868$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C580@23692L10:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1610882868, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$1610882868.<anonymous> (MainActivity.kt:580)");
            }
            TextKt.m4292TextNvy7gAk("-1", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-273883797, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f43lambda$273883797 = ComposableLambdaKt.composableLambdaInstance(-273883797, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-273883797$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C582@23893L10:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273883797, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-273883797.<anonymous> (MainActivity.kt:582)");
            }
            TextKt.m4292TextNvy7gAk("+1", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-252865539, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f42lambda$252865539 = ComposableLambdaKt.composableLambdaInstance(-252865539, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-252865539$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C602@25096L17:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-252865539, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-252865539.<anonymous> (MainActivity.kt:602)");
            }
            TextKt.m4292TextNvy7gAk("Completed", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1824038271 = ComposableLambdaKt.composableLambdaInstance(1824038271, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$1824038271$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            ComposerKt.sourceInformation(composer, "C605@25246L17:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1824038271, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$1824038271.<anonymous> (MainActivity.kt:605)");
            }
            TextKt.m4292TextNvy7gAk("Snooze 7d", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$576726389 = ComposableLambdaKt.composableLambdaInstance(576726389, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$576726389$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            ComposerKt.sourceInformation(composer, "C625@26231L19:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576726389, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$576726389.<anonymous> (MainActivity.kt:625)");
            }
            TextKt.m4292TextNvy7gAk("Remove note", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1426846012 = ComposableLambdaKt.composableLambdaInstance(1426846012, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$1426846012$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C674@28621L22:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426846012, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$1426846012.<anonymous> (MainActivity.kt:674)");
            }
            TextKt.m4292TextNvy7gAk("Add first item", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1244719592 = ComposableLambdaKt.composableLambdaInstance(1244719592, false, new Function2<Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$1244719592$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C:MainActivity.kt#f5odrr");
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1244719592, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$1244719592.<anonymous> (MainActivity.kt:785)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1656301401, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f41lambda$1656301401 = ComposableLambdaKt.composableLambdaInstance(-1656301401, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-1656301401$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            ComposerKt.sourceInformation(composer, "C786@33930L14:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1656301401, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-1656301401.<anonymous> (MainActivity.kt:786)");
            }
            TextKt.m4292TextNvy7gAk("Cancel", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1547540640, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f40lambda$1547540640 = ComposableLambdaKt.composableLambdaInstance(-1547540640, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt$lambda$-1547540640$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            ComposerKt.sourceInformation(composer, "C798@34485L12:MainActivity.kt#f5odrr");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1547540640, i, -1, "com.emeraldpulse.kyra.ComposableSingletons$MainActivityKt.lambda$-1547540640.<anonymous> (MainActivity.kt:798)");
            }
            TextKt.m4292TextNvy7gAk("Save", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1534059554$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10373getLambda$1534059554$app_release() {
        return f39lambda$1534059554;
    }

    /* renamed from: getLambda$-1547540640$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10374getLambda$1547540640$app_release() {
        return f40lambda$1547540640;
    }

    /* renamed from: getLambda$-1656301401$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10375getLambda$1656301401$app_release() {
        return f41lambda$1656301401;
    }

    /* renamed from: getLambda$-252865539$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10376getLambda$252865539$app_release() {
        return f42lambda$252865539;
    }

    /* renamed from: getLambda$-273883797$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10377getLambda$273883797$app_release() {
        return f43lambda$273883797;
    }

    /* renamed from: getLambda$-307036538$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10378getLambda$307036538$app_release() {
        return f44lambda$307036538;
    }

    /* renamed from: getLambda$-438824786$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10379getLambda$438824786$app_release() {
        return f45lambda$438824786;
    }

    /* renamed from: getLambda$-959614609$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10380getLambda$959614609$app_release() {
        return f46lambda$959614609;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1244719592$app_release() {
        return lambda$1244719592;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1426846012$app_release() {
        return lambda$1426846012;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1610882868$app_release() {
        return lambda$1610882868;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1824038271$app_release() {
        return lambda$1824038271;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$576726389$app_release() {
        return lambda$576726389;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$884247033$app_release() {
        return lambda$884247033;
    }

    public final Function2<Composer, Integer, Unit> getLambda$897871288$app_release() {
        return lambda$897871288;
    }
}
