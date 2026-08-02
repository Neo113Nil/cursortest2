package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class bh0 extends ezc implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(nwf nwfVar) {
        super(1, lxe.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.b = nwfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                float[] fArr = ((feh) obj).a;
                wof wofVar = (wof) ((nwf) this.b).r.getValue();
                if (wofVar != null) {
                    if (!wofVar.d()) {
                        wofVar = null;
                    }
                    if (wofVar != null) {
                        wofVar.E(fArr);
                    }
                }
                break;
            default:
                cds cdsVar = (cds) obj;
                cdsVar.getClass();
                ((t6k) this.b).h(((int) (cdsVar.c & 4294967295L)) - cdsVar.e);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh0(t6k t6kVar) {
        super(1, lxe.class, "updateMaxBaseline", "TrackInfo$lambda$0$0$4$1$updateMaxBaseline(Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/ui/text/TextLayoutResult;)V", 0);
        this.b = t6kVar;
    }
}
