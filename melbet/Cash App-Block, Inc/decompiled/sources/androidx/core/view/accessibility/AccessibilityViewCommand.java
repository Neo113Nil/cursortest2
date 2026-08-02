package androidx.core.view.accessibility;

import android.view.View;
import coil3.size.DimensionKt;

/* loaded from: classes.dex */
public interface AccessibilityViewCommand {

    public abstract class MoveAtGranularityArguments extends DimensionKt {
    }

    public abstract class MoveHtmlArguments extends DimensionKt {
    }

    public abstract class MoveWindowArguments extends DimensionKt {
    }

    public abstract class ScrollToPositionArguments extends DimensionKt {
    }

    public abstract class SetProgressArguments extends DimensionKt {
    }

    public abstract class SetSelectionArguments extends DimensionKt {
    }

    public abstract class SetTextArguments extends DimensionKt {
    }

    boolean perform(View view);
}
