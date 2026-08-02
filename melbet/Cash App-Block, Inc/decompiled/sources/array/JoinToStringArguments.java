package array;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import type.JsonLogicList;

/* loaded from: classes3.dex */
public final class JoinToStringArguments {
    public final JsonLogicList elementsToJoin;
    public final int limit;
    public final String postfix;
    public final String prefix;
    public final String separator;
    public final String truncated;

    public JoinToStringArguments(JsonLogicList jsonLogicList, String str, String str2, String str3, int i, String str4) {
        this.elementsToJoin = jsonLogicList;
        this.separator = str;
        this.prefix = str2;
        this.postfix = str3;
        this.limit = i;
        this.truncated = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoinToStringArguments) {
            JoinToStringArguments joinToStringArguments = (JoinToStringArguments) obj;
            if (this.elementsToJoin == joinToStringArguments.elementsToJoin && this.separator.equals(joinToStringArguments.separator) && this.prefix.equals(joinToStringArguments.prefix) && this.postfix.equals(joinToStringArguments.postfix) && this.limit == joinToStringArguments.limit && this.truncated.equals(joinToStringArguments.truncated)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.truncated.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.limit, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elementsToJoin.hashCode() * 31, 31, this.separator), 31, this.prefix), 31, this.postfix), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinToStringArguments(elementsToJoin=");
        sb.append(this.elementsToJoin);
        sb.append(", separator=");
        sb.append(this.separator);
        sb.append(", prefix=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.prefix, ", postfix=", this.postfix, ", limit=");
        sb.append(this.limit);
        sb.append(", truncated=");
        sb.append(this.truncated);
        sb.append(")");
        return sb.toString();
    }
}
