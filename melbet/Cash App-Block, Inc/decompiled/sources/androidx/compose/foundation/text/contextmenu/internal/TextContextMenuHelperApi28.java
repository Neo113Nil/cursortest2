package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class TextContextMenuHelperApi28 {
    public static final TextContextMenuHelperApi28 INSTANCE = new TextContextMenuHelperApi28();

    public final void IconBox(final Icon icon, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2116504409);
        int i2 = (gapComposer.changedInstance(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer.changed(icon) | gapComposer.changed(context);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = icon.loadDrawable(context);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Drawable drawable = (Drawable) rememberedValue;
            if (drawable == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this, icon, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda4
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ TextContextMenuHelperApi28 f$0;
                        public final /* synthetic */ Icon f$1;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Icon icon2 = this.f$1;
                            TextContextMenuHelperApi28 textContextMenuHelperApi28 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    textContextMenuHelperApi28.IconBox(icon2, composer2, Updater.updateChangedFlags(49));
                                    break;
                                default:
                                    textContextMenuHelperApi28.IconBox(icon2, composer2, Updater.updateChangedFlags(49));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            IconBox(drawable, gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this, icon, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$$ExternalSyntheticLambda4
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ TextContextMenuHelperApi28 f$0;
                public final /* synthetic */ Icon f$1;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    Icon icon2 = this.f$1;
                    TextContextMenuHelperApi28 textContextMenuHelperApi28 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            textContextMenuHelperApi28.IconBox(icon2, composer2, Updater.updateChangedFlags(49));
                            break;
                        default:
                            textContextMenuHelperApi28.IconBox(icon2, composer2, Updater.updateChangedFlags(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void IconBox(Drawable drawable, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(257732500);
        int i2 = (gapComposer.changedInstance(drawable) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, ContextMenuSpec.IconSize);
            boolean changedInstance = gapComposer.changedInstance(drawable);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ObjectList$$ExternalSyntheticLambda0(drawable, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(ClipKt.drawBehind(m285size3ABfNKs, (Function1) rememberedValue), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(this, drawable, i, 14);
        }
    }
}
