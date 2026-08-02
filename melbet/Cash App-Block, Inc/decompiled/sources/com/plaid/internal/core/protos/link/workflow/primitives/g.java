package com.plaid.internal.core.protos.link.workflow.primitives;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum g implements Internal.EnumLite {
    CLIENT_TYPE_UNKNOWN(0),
    CLIENT_TYPE_ANDROID(1),
    CLIENT_TYPE_IOS(2),
    CLIENT_TYPE_WEB(3),
    CLIENT_TYPE_REACTNATIVEANDROID(4),
    CLIENT_TYPE_REACTNATIVEIOS(5),
    CLIENT_TYPE_LINK_WEB_SDK(6),
    CLIENT_TYPE_FLUTTERIOS(7),
    CLIENT_TYPE_FLUTTERANDROID(8),
    CLIENT_TYPE_HOSTED_LINK(9),
    UNRECOGNIZED(-1);

    public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
    public static final int CLIENT_TYPE_FLUTTERANDROID_VALUE = 8;
    public static final int CLIENT_TYPE_FLUTTERIOS_VALUE = 7;
    public static final int CLIENT_TYPE_HOSTED_LINK_VALUE = 9;
    public static final int CLIENT_TYPE_IOS_VALUE = 2;
    public static final int CLIENT_TYPE_LINK_WEB_SDK_VALUE = 6;
    public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
    public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
    public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int CLIENT_TYPE_WEB_VALUE = 3;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<g> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final g findValueByNumber(int i) {
            return g.forNumber(i);
        }
    }

    public static final class b implements Internal.EnumVerifier {
        public static final b a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return g.forNumber(i) != null;
        }
    }

    g(int i) {
        this.a = i;
    }

    public static g forNumber(int i) {
        switch (i) {
            case 0:
                return CLIENT_TYPE_UNKNOWN;
            case 1:
                return CLIENT_TYPE_ANDROID;
            case 2:
                return CLIENT_TYPE_IOS;
            case 3:
                return CLIENT_TYPE_WEB;
            case 4:
                return CLIENT_TYPE_REACTNATIVEANDROID;
            case 5:
                return CLIENT_TYPE_REACTNATIVEIOS;
            case 6:
                return CLIENT_TYPE_LINK_WEB_SDK;
            case 7:
                return CLIENT_TYPE_FLUTTERIOS;
            case 8:
                return CLIENT_TYPE_FLUTTERANDROID;
            case 9:
                return CLIENT_TYPE_HOSTED_LINK;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<g> internalGetValueMap() {
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
    public static g valueOf(int i) {
        return forNumber(i);
    }
}
