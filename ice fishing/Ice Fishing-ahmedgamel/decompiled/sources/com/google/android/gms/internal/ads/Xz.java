package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Xz {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f29395a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4064vE f29396b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4064vE f29397c = null;

    public final boolean a(W7 w72) {
        byte[] a9 = w72.A().B().B().a();
        byte[] a10 = w72.A().D().a();
        try {
            try {
                if (!this.f29395a.getAndSet(true)) {
                    try {
                        AbstractC4231yJ.a();
                        S0.l a11 = AbstractC3364iD.a(new String(AbstractC2792Sd.r("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        C3609mr c3609mr = AbstractC2792Sd.f28292I;
                        this.f29396b = (InterfaceC4064vE) a11.Q(c3609mr, InterfaceC4064vE.class);
                        this.f29397c = (InterfaceC4064vE) AbstractC3364iD.a(new String(AbstractC2792Sd.r("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).Q(c3609mr, InterfaceC4064vE.class);
                    } catch (Exception e9) {
                        throw new GeneralSecurityException("Failed to verify program", e9);
                    }
                }
                InterfaceC4064vE interfaceC4064vE = this.f29396b;
                if (interfaceC4064vE == null) {
                    throw new GeneralSecurityException();
                }
                interfaceC4064vE.a(a9, a10);
                return true;
            } catch (GeneralSecurityException unused) {
                InterfaceC4064vE interfaceC4064vE2 = this.f29397c;
                if (interfaceC4064vE2 != null) {
                    interfaceC4064vE2.a(a9, a10);
                    return true;
                }
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
