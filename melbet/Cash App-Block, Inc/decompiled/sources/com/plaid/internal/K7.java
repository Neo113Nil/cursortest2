package com.plaid.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes5.dex */
public final class K7 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.values().length];
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.WEBVIEW_FALLBACK_BACKGROUND_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.UNRECOGNIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static final boolean a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Z z) {
        z.getClass();
        int i = a.a[z.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }
}
