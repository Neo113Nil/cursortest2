package com.squareup.cash.arcade;

import androidx.compose.material.ripple.RippleAlpha;

/* loaded from: classes.dex */
public final class RippleAlphas {
    public final Component component;

    /* renamed from: default, reason: not valid java name */
    public final RippleAlpha f231default;

    public final class Component {
        public final RippleAlpha buttonProminent;

        public Component(RippleAlpha rippleAlpha) {
            this.buttonProminent = rippleAlpha;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Component) && this.buttonProminent.equals(((Component) obj).buttonProminent);
        }

        public final int hashCode() {
            return this.buttonProminent.hashCode();
        }

        public final String toString() {
            return "Component(buttonProminent=" + this.buttonProminent + ")";
        }
    }

    public RippleAlphas(RippleAlpha rippleAlpha, Component component) {
        this.f231default = rippleAlpha;
        this.component = component;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RippleAlphas)) {
            return false;
        }
        RippleAlphas rippleAlphas = (RippleAlphas) obj;
        return this.f231default.equals(rippleAlphas.f231default) && this.component.equals(rippleAlphas.component);
    }

    public final int hashCode() {
        return this.component.buttonProminent.hashCode() + (this.f231default.hashCode() * 31);
    }

    public final String toString() {
        return "RippleAlphas(default=" + this.f231default + ", component=" + this.component + ")";
    }
}
