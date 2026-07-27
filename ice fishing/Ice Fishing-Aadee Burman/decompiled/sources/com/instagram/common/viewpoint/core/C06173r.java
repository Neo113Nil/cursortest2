package com.instagram.common.viewpoint.core;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06173r extends E2 {
    public static byte[] A01;
    public final /* synthetic */ C06163q A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C06173r(C06163q c06163q) {
        this.A00 = c06163q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.get() == null) goto L6;
     */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(E3 e32) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        weakReference = this.A00.A00;
        if (weakReference != null) {
            weakReference3 = this.A00.A00;
        }
        this.A00.A00 = new WeakReference(new C1740f6(this));
        AudioManager audioManager = (AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71));
        weakReference2 = this.A00.A00;
        audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) weakReference2.get(), 3, 1);
    }
}
