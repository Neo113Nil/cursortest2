package androidx.glance.appwidget;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.Applier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SizeBoxKt$SizeBox$1 extends Lambda implements Function2 {
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ long $size;
    public final /* synthetic */ SizeMode $sizeMode;

    /* renamed from: androidx.glance.appwidget.SizeBoxKt$SizeBox$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1(0, EmittableSizeBox.class, "<init>", "<init>()V", 0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new EmittableSizeBox();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeBoxKt$SizeBox$1(int i, long j, SizeMode sizeMode, Function2 function2) {
        super(2);
        this.$sizeMode = sizeMode;
        this.$size = j;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    GapComposer gapComposer = (GapComposer) composer;
                    if (gapComposer.getSkipping()) {
                        gapComposer.skipToGroupEnd();
                        return Unit.INSTANCE;
                    }
                }
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceableGroup(578571862);
                gapComposer2.startReplaceableGroup(-548224868);
                if (!(gapComposer2.applier instanceof Applier)) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(anonymousClass1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, new DpSize(this.$size), SizeBoxKt$SizeBox$1$2$1.INSTANCE);
                Updater.m576setimpl(gapComposer2, this.$sizeMode, SizeBoxKt$SizeBox$1$2$1.INSTANCE$19);
                Recorder$$ExternalSyntheticOutline2.m(0, this.$content, gapComposer2, true, false);
                gapComposer2.end(false);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                Function2 function2 = this.$content;
                SizeBoxKt.m1118ForEachSizeeVKgIn8(1, this.$size, (Composer) obj, this.$sizeMode, function2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeBoxKt$SizeBox$1(Function2 function2, long j, SizeMode sizeMode) {
        super(2);
        this.$content = function2;
        this.$size = j;
        this.$sizeMode = sizeMode;
    }
}
