package androidx.glance;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public interface GlanceModifier {

    public final class Companion implements GlanceModifier {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.glance.GlanceModifier
        public final boolean all() {
            return true;
        }

        @Override // androidx.glance.GlanceModifier
        public final boolean any(Function1 function1) {
            return false;
        }

        @Override // androidx.glance.GlanceModifier
        public final Object foldIn(Object obj, Function2 function2) {
            return obj;
        }

        @Override // androidx.glance.GlanceModifier
        public final GlanceModifier then(GlanceModifier glanceModifier) {
            return glanceModifier;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface Element extends GlanceModifier {
        @Override // androidx.glance.GlanceModifier
        default boolean all() {
            return Boolean.TRUE.booleanValue();
        }

        @Override // androidx.glance.GlanceModifier
        default boolean any(Function1 function1) {
            return ((Boolean) function1.invoke(this)).booleanValue();
        }

        @Override // androidx.glance.GlanceModifier
        default Object foldIn(Object obj, Function2 function2) {
            return function2.invoke(obj, this);
        }
    }

    boolean all();

    boolean any(Function1 function1);

    Object foldIn(Object obj, Function2 function2);

    default GlanceModifier then(GlanceModifier glanceModifier) {
        return glanceModifier == Companion.$$INSTANCE ? this : new CombinedGlanceModifier(this, glanceModifier);
    }
}
