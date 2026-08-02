package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum W implements Internal.EnumLite {
    URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION(0),
    URL_BEHAVIOR_PREFER_UNIVERSAL_LINK(1),
    UNRECOGNIZED(-1);

    public static final int URL_BEHAVIOR_PREFER_UNIVERSAL_LINK_VALUE = 1;
    public static final int URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION_VALUE = 0;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<W> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final W findValueByNumber(int i) {
            return W.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return W.forNumber(i) != null;
        }
    }

    W(int i) {
        this.a = i;
    }

    public static W forNumber(int i) {
        if (i == 0) {
            return URL_BEHAVIOR_SUBMIT_OAUTH_CONTINUATION;
        }
        if (i != 1) {
            return null;
        }
        return URL_BEHAVIOR_PREFER_UNIVERSAL_LINK;
    }

    public static Internal.EnumLiteMap<W> internalGetValueMap() {
        return b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static W valueOf(int i) {
        return forNumber(i);
    }
}
