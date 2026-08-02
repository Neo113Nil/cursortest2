package app.cash.broadway.ui;

import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TransitionFactory {

    public abstract class AnimatorTransition implements Transition {
    }

    public final class CustomTransition implements Transition {
        public final EnterTransitionImpl enter;
        public final ExitTransitionImpl exit;
        public final boolean incomingContentBelow;

        public CustomTransition(EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, boolean z) {
            enterTransitionImpl.getClass();
            exitTransitionImpl.getClass();
            this.enter = enterTransitionImpl;
            this.exit = exitTransitionImpl;
            this.incomingContentBelow = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Interpolator {
        public static final /* synthetic */ Interpolator[] $VALUES;
        public static final Interpolator EaseIn;
        public static final Interpolator EaseOut;
        public static final Interpolator Linear;

        static {
            Interpolator interpolator = new Interpolator("EaseIn", 0);
            EaseIn = interpolator;
            Interpolator interpolator2 = new Interpolator("EaseOut", 1);
            EaseOut = interpolator2;
            Interpolator interpolator3 = new Interpolator("Linear", 2);
            Linear = interpolator3;
            $VALUES = new Interpolator[]{interpolator, interpolator2, interpolator3};
        }

        public static Interpolator valueOf(String str) {
            return (Interpolator) Enum.valueOf(Interpolator.class, str);
        }

        public static Interpolator[] values() {
            return (Interpolator[]) $VALUES.clone();
        }
    }

    public interface StandardTransition extends Transition {

        public final class Crossfade implements StandardTransition {
            public static final Crossfade INSTANCE = new Crossfade();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Crossfade);
            }

            public final int hashCode() {
                return 991904032;
            }

            public final String toString() {
                return "Crossfade";
            }
        }

        public final class FadeIn implements StandardTransition {
            public final Integer duration;
            public final Interpolator interpolator;

            public FadeIn(Interpolator interpolator, Integer num) {
                this.interpolator = interpolator;
                this.duration = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FadeIn)) {
                    return false;
                }
                FadeIn fadeIn = (FadeIn) obj;
                return this.interpolator == fadeIn.interpolator && Intrinsics.areEqual(this.duration, fadeIn.duration);
            }

            public final int hashCode() {
                Interpolator interpolator = this.interpolator;
                int hashCode = (interpolator == null ? 0 : interpolator.hashCode()) * 31;
                Integer num = this.duration;
                return hashCode + (num != null ? num.hashCode() : 0);
            }

            public final String toString() {
                return "FadeIn(interpolator=" + this.interpolator + ", duration=" + this.duration + ")";
            }
        }

        public final class FadeOut implements StandardTransition {
            public static final FadeOut INSTANCE = new FadeOut();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FadeOut);
            }

            public final int hashCode() {
                return -1990182250;
            }

            public final String toString() {
                return "FadeOut";
            }
        }

        public final class FadeOutThenIn implements StandardTransition {
            public static final FadeOutThenIn INSTANCE = new FadeOutThenIn();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FadeOutThenIn);
            }

            public final int hashCode() {
                return -1091329448;
            }

            public final String toString() {
                return "FadeOutThenIn";
            }
        }

        public final class Immediate implements StandardTransition {
            public static final Immediate INSTANCE = new Immediate();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Immediate);
            }

            public final int hashCode() {
                return 718383637;
            }

            public final String toString() {
                return "Immediate";
            }
        }

        public final class InFromBottom implements StandardTransition {
            public static final InFromBottom INSTANCE = new InFromBottom();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InFromBottom);
            }

            public final int hashCode() {
                return -550537066;
            }

            public final String toString() {
                return "InFromBottom";
            }
        }

        public final class InFromRight implements StandardTransition {
            public static final InFromRight INSTANCE = new InFromRight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InFromRight);
            }

            public final int hashCode() {
                return -1388647855;
            }

            public final String toString() {
                return "InFromRight";
            }
        }

        public final class OutToBottom implements StandardTransition {
            public static final OutToBottom INSTANCE = new OutToBottom();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OutToBottom);
            }

            public final int hashCode() {
                return 146758488;
            }

            public final String toString() {
                return "OutToBottom";
            }
        }

        public final class OutToLeft implements StandardTransition {
            public static final OutToLeft INSTANCE = new OutToLeft();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OutToLeft);
            }

            public final int hashCode() {
                return 961333364;
            }

            public final String toString() {
                return "OutToLeft";
            }
        }

        public final class OutToRight implements StandardTransition {
            public static final OutToRight INSTANCE = new OutToRight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OutToRight);
            }

            public final int hashCode() {
                return -257775793;
            }

            public final String toString() {
                return "OutToRight";
            }
        }

        public final class Push implements StandardTransition {
            public final boolean back;

            public Push(boolean z) {
                this.back = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Push) && this.back == ((Push) obj).back;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.back);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Push(back=", ")", this.back);
            }
        }

        /* loaded from: classes3.dex */
        public final class PushLeft implements StandardTransition {
            public static final PushLeft INSTANCE = new PushLeft();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PushLeft);
            }

            public final int hashCode() {
                return -315566243;
            }

            public final String toString() {
                return "PushLeft";
            }
        }

        /* loaded from: classes3.dex */
        public final class PushRight implements StandardTransition {
            public static final PushRight INSTANCE = new PushRight();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PushRight);
            }

            public final int hashCode() {
                return -1186957946;
            }

            public final String toString() {
                return "PushRight";
            }
        }
    }

    public interface Transition {
    }

    Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8);
}
