package com.squareup.cash.formview.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class ButtonIcon {

    public final class ArcadeIcon extends ButtonIcon {
        public final String arcadeId;

        public ArcadeIcon(String str) {
            this.arcadeId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArcadeIcon) && this.arcadeId.equals(((ArcadeIcon) obj).arcadeId);
        }

        public final int hashCode() {
            return this.arcadeId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArcadeIcon(arcadeId=", this.arcadeId, ")");
        }
    }
}
