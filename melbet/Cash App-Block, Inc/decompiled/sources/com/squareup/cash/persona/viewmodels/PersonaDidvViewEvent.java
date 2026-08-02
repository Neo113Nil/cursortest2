package com.squareup.cash.persona.viewmodels;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PersonaDidvViewEvent {

    public final class DialogCanceled extends PersonaDidvViewEvent {
        public final Screen screen;

        public DialogCanceled(Screen screen) {
            screen.getClass();
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogCanceled) && Intrinsics.areEqual(this.screen, ((DialogCanceled) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "DialogCanceled(screen=", ")");
        }
    }

    public final class DialogResult extends PersonaDidvViewEvent {
        public final Object result;
        public final Screen screen;

        public DialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screen = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogResult)) {
                return false;
            }
            DialogResult dialogResult = (DialogResult) obj;
            return Intrinsics.areEqual(this.screen, dialogResult.screen) && Intrinsics.areEqual(this.result, dialogResult.result);
        }

        public final int hashCode() {
            int hashCode = this.screen.hashCode() * 31;
            Object obj = this.result;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "DialogResult(screen=" + this.screen + ", result=" + this.result + ")";
        }
    }
}
