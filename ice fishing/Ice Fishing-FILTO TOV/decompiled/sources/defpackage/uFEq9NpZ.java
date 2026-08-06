package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class uFEq9NpZ implements Runnable {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ uFEq9NpZ(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x01be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c2, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3 = this.OOA6hdeuvCS;
        Object obj = this.EljAMC1QTz;
        switch (i3) {
            case 0:
                ((WIEu4Ya2g8) obj).X1lG3V04pd();
                return;
            case 1:
                i iVar = (i) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    iVar.encWxUiV2.Y6hRI1cF8(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        iVar.EljAMC1QTz();
                        Trace.endSection();
                        iVar.rezfBrjOrqK = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                w wVar = (w) obj;
                boolean encWxUiV2 = wVar.encWxUiV2();
                c cVar = wVar.OOA6hdeuvCS;
                if (encWxUiV2) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        cVar.Y6hRI1cF8(true);
                        rf0 rf0Var = wVar.iwATDS1i01k;
                        int[] iArr = rf0Var.Yi7zF1RB1;
                        long[] jArr = rf0Var.GWasM1elztuh;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!wVar.AvO7iQsrTN().GWasM1elztuh(i7)) {
                                                i2 = i4;
                                                wVar.encWxUiV2.add(new hg(i7, wVar.uFEq9NpZ, ig.EljAMC1QTz, null));
                                                wVar.E7jCp8Ls.mE4lRynR(kc1.GWasM1elztuh);
                                                j >>= 8;
                                                i6++;
                                                i4 = i2;
                                            }
                                        }
                                        i2 = i4;
                                        j >>= 8;
                                        i6++;
                                        i4 = i2;
                                    }
                                    int i8 = i4;
                                    if (i5 == 8) {
                                        i = i8;
                                    }
                                } else {
                                    i = i4;
                                }
                                if (i != length) {
                                    i4 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        wVar.JFJ3QoxA(cVar.getSemanticsOwner().GWasM1elztuh(), wVar.WIEu4Ya2g8);
                        Trace.endSection();
                        wVar.EljAMC1QTz(wVar.AvO7iQsrTN());
                        wVar.uFEq9NpZ();
                        wVar.YmKjaVtbfp5Z = false;
                        return;
                    } finally {
                    }
                }
                return;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                fd.EljAMC1QTz((fd) obj);
                return;
            case 4:
                cd cdVar = (cd) obj;
                Runnable runnable = cdVar.EljAMC1QTz;
                if (runnable != null) {
                    runnable.run();
                    cdVar.EljAMC1QTz = null;
                    return;
                }
                return;
            case 5:
                dm.xqGvceK5x((dm) obj);
                return;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                hu huVar = (hu) obj;
                synchronized (huVar.xqGvceK5x) {
                    try {
                        if (huVar.encWxUiV2 == null) {
                            return;
                        }
                        try {
                            ru X1lG3V04pd = huVar.X1lG3V04pd();
                            int i9 = X1lG3V04pd.EljAMC1QTz;
                            if (i9 == 2) {
                                synchronized (huVar.xqGvceK5x) {
                                }
                            }
                            if (i9 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            }
                            try {
                                int i10 = aa1.GWasM1elztuh;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                vt vtVar = huVar.X1lG3V04pd;
                                Context context = huVar.GWasM1elztuh;
                                vtVar.getClass();
                                ru[] ruVarArr = {X1lG3V04pd};
                                q70 q70Var = jb1.GWasM1elztuh;
                                l60.encWxUiV2("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface rQPn8YBR = jb1.GWasM1elztuh.rQPn8YBR(context, ruVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer k8h8IjolWQ = o50.k8h8IjolWQ(huVar.GWasM1elztuh, X1lG3V04pd.GWasM1elztuh);
                                    if (k8h8IjolWQ == null || rQPn8YBR == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        rx0 rx0Var = new rx0(rQPn8YBR, b70.EXrPz3p7hFb(k8h8IjolWQ));
                                        Trace.endSection();
                                        synchronized (huVar.xqGvceK5x) {
                                            try {
                                                vc0 vc0Var = huVar.encWxUiV2;
                                                if (vc0Var != null) {
                                                    vc0Var.k8h8IjolWQ(rx0Var);
                                                }
                                            } finally {
                                            }
                                        }
                                        huVar.Yi7zF1RB1();
                                        return;
                                    } finally {
                                        int i11 = aa1.GWasM1elztuh;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (huVar.xqGvceK5x) {
                                try {
                                    vc0 vc0Var2 = huVar.encWxUiV2;
                                    if (vc0Var2 != null) {
                                        vc0Var2.M3K9sHhK(th);
                                    }
                                    huVar.Yi7zF1RB1();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                bs0 bs0Var = (bs0) obj;
                w90 w90Var = bs0Var.JFJ3QoxA;
                if (bs0Var.EljAMC1QTz == 0) {
                    bs0Var.AvO7iQsrTN = true;
                    w90Var.xqGvceK5x(l90.ON_PAUSE);
                }
                if (bs0Var.OOA6hdeuvCS == 0 && bs0Var.AvO7iQsrTN) {
                    w90Var.xqGvceK5x(l90.ON_STOP);
                    bs0Var.encWxUiV2 = true;
                    return;
                }
                return;
            default:
                kv0.setRippleState$lambda$1((kv0) obj);
                return;
        }
    }
}
