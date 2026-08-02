package ru.yandex.taxi.transition;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.ec3;
import defpackage.g18;
import defpackage.k4o;
import defpackage.zi;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public abstract class AttachableViewHolder {
    public final zi a = new zi(6, this);
    public g18 b = g18.u1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/transition/AttachableViewHolder$TransitionType;", "", "APPEAR", "DISAPPEAR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TransitionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransitionType[] $VALUES;
        public static final TransitionType APPEAR;
        public static final TransitionType DISAPPEAR;

        static {
            TransitionType transitionType = new TransitionType("APPEAR", 0);
            APPEAR = transitionType;
            TransitionType transitionType2 = new TransitionType("DISAPPEAR", 1);
            DISAPPEAR = transitionType2;
            TransitionType[] transitionTypeArr = {transitionType, transitionType2};
            $VALUES = transitionTypeArr;
            $ENTRIES = kotlin.enums.a.a(transitionTypeArr);
        }

        public static TransitionType valueOf(String str) {
            return (TransitionType) Enum.valueOf(TransitionType.class, str);
        }

        public static TransitionType[] values() {
            return (TransitionType[]) $VALUES.clone();
        }
    }

    public static final class a {
    }

    public void B0() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, ec3] */
    public final void I(a aVar) {
        B0();
        View h = h();
        ViewTreeObserver viewTreeObserver = h.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        final boolean z = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.transition.AttachableViewHolder$notifyAttach$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                this.h().postDelayed(this.a, 300L);
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, h, 0);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.b = (g18) ref$ObjectRef.element;
    }

    public void M1(b bVar) {
        this.b.cancel();
        h().removeCallbacks(this.a);
    }

    public abstract View h();

    public abstract void requestFocus();

    public static final class b {
        public final boolean a;
        public final boolean b;
        public final Runnable c;

        public b(int i, Runnable runnable) {
            boolean z = (i & 1) == 0;
            boolean z2 = (i & 2) == 0;
            runnable = (i & 4) != 0 ? null : runnable;
            this.a = z;
            this.b = z2;
            this.c = runnable;
        }

        public b() {
            this(7, null);
        }
    }
}
