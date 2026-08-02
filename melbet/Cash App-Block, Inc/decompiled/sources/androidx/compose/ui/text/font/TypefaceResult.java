package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;

/* loaded from: classes.dex */
public interface TypefaceResult extends State {

    /* loaded from: classes3.dex */
    public final class Async implements TypefaceResult, State {
        public final AsyncFontListLoader current;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean getCacheable() {
            return this.current.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.current.value$delegate.getValue();
        }
    }

    public final class Immutable implements TypefaceResult {
        public final boolean cacheable;
        public final Object value;

        public Immutable(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public final boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public final Object getValue() {
            return this.value;
        }
    }

    boolean getCacheable();
}
