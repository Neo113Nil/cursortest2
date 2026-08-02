package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.androidx.media3.extractor.ExtractorsFactory;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07829o {
    public static byte[] A08;
    public static String[] A09 = {"634gowWrnODsCbHJW3RM2adSB8UjvpNK", "SJrAWOr70TCHX", "EwIuJu9eGNp0k", "E6EVZDT", "sHeITXs", "FXQ6HdUX", "YL7g5rxYaYN1DF5ZV43is2fGGs0zV37S", "j2oNEgxbTlE4krYsb5twTfwtoUHd8Sk9"};
    public DC A02;
    public String A05;
    public final C5Y A06;
    public final Object A07;
    public A6 A01 = A3.A01();
    public FF A03 = new C2227n9();
    public int A00 = o.f8528d;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC2101ku<InterfaceExecutorC0914Fb> A04 = new InterfaceC2101ku() { // from class: com.facebook.ads.redexgen.X.nj
        @Override // com.instagram.common.viewpoint.core.InterfaceC2101ku
        public final Object get() {
            return C07829o.A01();
        }
    };

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[7].charAt(23) != 't') {
                throw new RuntimeException();
            }
            A09[4] = "2gbF6ls";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 26);
            i9++;
        }
    }

    public static void A03() {
        A08 = new byte[]{20, 35, 35, 62, 35, 113, 56, c.f17105c, 34, 37, 48, c.f17105c, 37, 56, 48, 37, 56, c.f17105c, 54, 113, 21, 52, 55, 48, 36, 61, 37, 20, 41, 37, 35, 48, 50, 37, 62, 35, 34, 23, 48, 50, 37, 62, 35, 40, 106, 102, 100, 39, 111, 104, 106, 108, 107, 102, 102, 98, 39, 104, 109, 122, 39, 104, 103, 109, 123, 102, 96, 109, 113, 39, 100, 108, 109, 96, 104, 58, 39, 108, 113, 125, 123, 104, 106, 125, 102, 123, 39, 77, 108, 111, 104, 124, 101, 125, 76, 113, 125, 123, 104, 106, 125, 102, 123, 122, 79, 104, 106, 125, 102, 123, 112};
    }

    static {
        A03();
    }

    public C07829o(C5Y c5y) {
        this.A06 = c5y;
    }

    public static /* synthetic */ C2274nu A00(HD hd, C8O c8o) {
        return new C2274nu(hd);
    }

    public static /* synthetic */ InterfaceExecutorC0914Fb A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final C07819n A04(Uri uri) {
        String A02 = A02(0, 44, 75);
        if (this.A02 == null) {
            try {
                Constructor<? extends ExtractorsFactory> constructor = Class.forName(A02(44, 67, 19)).asSubclass(HD.class).getConstructor(new Class[0]);
                final HD hd = (HD) constructor.newInstance(new Object[0]);
                this.A02 = new DC() { // from class: com.facebook.ads.redexgen.X.nl
                    @Override // com.instagram.common.viewpoint.core.DC
                    public final DD A5X(C8O c8o) {
                        return C07829o.A00(HD.this, c8o);
                    }
                };
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(A02, e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(A02, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(A02, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(A02, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(A02, e13);
            }
        }
        return new C07819n(new C06162u().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
