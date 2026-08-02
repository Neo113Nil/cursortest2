package androidx.compose.ui;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface Alignment {

    public final class Companion implements CoroutineContext.Key {
        public static final BiasAlignment TopStart = new BiasAlignment(-1.0f, -1.0f);
        public static final BiasAlignment TopCenter = new BiasAlignment(RecyclerView.DECELERATION_RATE, -1.0f);
        public static final BiasAlignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        public static final BiasAlignment CenterStart = new BiasAlignment(-1.0f, RecyclerView.DECELERATION_RATE);
        public static final BiasAlignment Center = new BiasAlignment(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        public static final BiasAlignment CenterEnd = new BiasAlignment(1.0f, RecyclerView.DECELERATION_RATE);
        public static final BiasAlignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        public static final BiasAlignment BottomCenter = new BiasAlignment(RecyclerView.DECELERATION_RATE, 1.0f);
        public static final BiasAlignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        public static final BiasAlignment.Vertical Top = new BiasAlignment.Vertical(-1.0f);
        public static final BiasAlignment.Vertical CenterVertically = new BiasAlignment.Vertical(RecyclerView.DECELERATION_RATE);
        public static final BiasAlignment.Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        public static final BiasAlignment.Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        public static final BiasAlignment.Horizontal CenterHorizontally = new BiasAlignment.Horizontal(RecyclerView.DECELERATION_RATE);
        public static final BiasAlignment.Horizontal End = new BiasAlignment.Horizontal(1.0f);
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    public interface Horizontal {
        int align(int i, int i2, LayoutDirection layoutDirection);
    }

    /* renamed from: align-KFBX0sM, reason: not valid java name */
    long mo584alignKFBX0sM(long j, long j2, LayoutDirection layoutDirection);
}
