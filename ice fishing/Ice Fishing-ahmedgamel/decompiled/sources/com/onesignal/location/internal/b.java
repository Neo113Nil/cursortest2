package com.onesignal.location.internal;

import a5.InterfaceC0441a;
import kotlin.jvm.internal.e;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class b implements InterfaceC0441a {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // a5.InterfaceC0441a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // a5.InterfaceC0441a
    public Object requestPermission(InterfaceC5240d interfaceC5240d) {
        throw Companion.getEXCEPTION();
    }

    @Override // a5.InterfaceC0441a
    public void setShared(boolean z6) {
        throw Companion.getEXCEPTION();
    }
}
