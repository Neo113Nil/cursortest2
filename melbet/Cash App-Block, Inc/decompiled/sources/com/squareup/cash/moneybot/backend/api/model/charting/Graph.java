package com.squareup.cash.moneybot.backend.api.model.charting;

import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface Graph {

    public final class AxisLabel {
        public final String text;
        public final long value;

        public AxisLabel(String str, long j) {
            this.text = str;
            this.value = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AxisLabel)) {
                return false;
            }
            AxisLabel axisLabel = (AxisLabel) obj;
            return this.text.equals(axisLabel.text) && this.value == axisLabel.value;
        }

        public final int hashCode() {
            return Long.hashCode(this.value) + (this.text.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("AxisLabel(text=", this.text, ", value=", this.value);
            m.append(")");
            return m.toString();
        }
    }
}
