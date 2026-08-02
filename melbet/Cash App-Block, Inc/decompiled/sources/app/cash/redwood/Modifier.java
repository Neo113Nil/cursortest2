package app.cash.redwood;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public interface Modifier {

    public final class Companion implements Modifier {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // app.cash.redwood.Modifier
        public final void forEach(Function1 function1) {
        }

        @Override // app.cash.redwood.Modifier
        public final void forEachScoped(Function1 function1) {
        }

        @Override // app.cash.redwood.Modifier
        public final void forEachUnscoped(Function1 function1) {
        }

        @Override // app.cash.redwood.Modifier
        public final Modifier then(Modifier modifier) {
            modifier.getClass();
            return modifier;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface Element extends Modifier {
        @Override // app.cash.redwood.Modifier
        default void forEach(Function1 function1) {
            function1.invoke(this);
        }
    }

    public interface ScopedElement extends Element {
        @Override // app.cash.redwood.Modifier
        default void forEachScoped(Function1 function1) {
            function1.invoke(this);
        }

        @Override // app.cash.redwood.Modifier
        default void forEachUnscoped(Function1 function1) {
        }
    }

    public interface UnscopedElement extends Element {
        @Override // app.cash.redwood.Modifier
        default void forEachScoped(Function1 function1) {
        }

        @Override // app.cash.redwood.Modifier
        default void forEachUnscoped(Function1 function1) {
            function1.invoke(this);
        }
    }

    void forEach(Function1 function1);

    void forEachScoped(Function1 function1);

    void forEachUnscoped(Function1 function1);

    default Modifier then(Modifier modifier) {
        modifier.getClass();
        if (modifier == Companion.$$INSTANCE) {
            return this;
        }
        if (!(modifier instanceof CombinedModifier)) {
            return new CombinedModifier(this, modifier);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this;
        ((CombinedModifier) modifier).forEach(new Modifier$$ExternalSyntheticLambda0(0, ref$ObjectRef));
        return (Modifier) ref$ObjectRef.element;
    }
}
