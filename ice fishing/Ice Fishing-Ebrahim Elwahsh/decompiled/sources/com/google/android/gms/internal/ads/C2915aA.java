package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2915aA {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f29178a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4108wE f29179b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC4108wE f29180c = null;

    public final boolean a(S7 s72) {
        byte[] a9 = s72.A().B().B().a();
        byte[] a10 = s72.A().D().a();
        try {
            try {
                if (!this.f29178a.getAndSet(true)) {
                    try {
                        IJ.a();
                        C2593Hm a11 = AbstractC3406jD.a(new String(PA.x("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false)));
                        Dr dr = AbstractC3194fG.f30670r0;
                        this.f29179b = (InterfaceC4108wE) a11.z(dr, InterfaceC4108wE.class);
                        this.f29180c = (InterfaceC4108wE) AbstractC3406jD.a(new String(PA.x("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).z(dr, InterfaceC4108wE.class);
                    } catch (Exception e6) {
                        throw new GeneralSecurityException("Failed to verify program", e6);
                    }
                }
                InterfaceC4108wE interfaceC4108wE = this.f29179b;
                if (interfaceC4108wE == null) {
                    throw new GeneralSecurityException();
                }
                interfaceC4108wE.a(a9, a10);
                return true;
            } catch (GeneralSecurityException unused) {
                InterfaceC4108wE interfaceC4108wE2 = this.f29180c;
                if (interfaceC4108wE2 != null) {
                    interfaceC4108wE2.a(a9, a10);
                    return true;
                }
                return false;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
