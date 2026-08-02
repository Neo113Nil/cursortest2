package com.bumptech.glide;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.util.Util;

/* loaded from: classes4.dex */
public final class GenericTransitionOptions implements Cloneable {
    public NoTransition.NoAnimationFactory transitionFactory;

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final GenericTransitionOptions m1908clone() {
        try {
            return (GenericTransitionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericTransitionOptions) && equals$com$bumptech$glide$TransitionOptions(obj);
    }

    public final boolean equals$com$bumptech$glide$TransitionOptions(Object obj) {
        if (obj instanceof GenericTransitionOptions) {
            return Util.bothNullOrEqual(this.transitionFactory, ((GenericTransitionOptions) obj).transitionFactory);
        }
        return false;
    }

    public final int hashCode() {
        return hashCode$com$bumptech$glide$TransitionOptions();
    }

    public final int hashCode$com$bumptech$glide$TransitionOptions() {
        NoTransition.NoAnimationFactory noAnimationFactory = this.transitionFactory;
        if (noAnimationFactory != null) {
            return noAnimationFactory.hashCode();
        }
        return 0;
    }
}
