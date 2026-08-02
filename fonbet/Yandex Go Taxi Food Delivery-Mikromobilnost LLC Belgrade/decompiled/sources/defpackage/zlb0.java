package defpackage;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;

/* loaded from: classes10.dex */
public final class zlb0 {
    public f50 a = c50.a;
    public int b;
    public bei c;

    public static final class a {
        public f50 a = c50.a;
        public final int b;
        public final bei c;

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        
            if (r0 >= 2) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            int pickImagesMaxLimit;
            int extensionVersion;
            int i = Build.VERSION.SDK_INT;
            if (i < 33) {
                if (i >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                }
                pickImagesMaxLimit = Integer.MAX_VALUE;
                this.b = pickImagesMaxLimit;
                this.c = bei.c;
            }
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            this.b = pickImagesMaxLimit;
            this.c = bei.c;
        }

        public final zlb0 a() {
            zlb0 zlb0Var = new zlb0();
            zlb0Var.a = this.a;
            zlb0Var.b = this.b;
            zlb0Var.c = this.c;
            return zlb0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zlb0() {
        int pickImagesMaxLimit;
        int extensionVersion;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = Integer.MAX_VALUE;
            this.b = pickImagesMaxLimit;
            this.c = bei.c;
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        this.b = pickImagesMaxLimit;
        this.c = bei.c;
    }

    public final bei a() {
        return this.c;
    }

    public final f50 b() {
        return this.a;
    }
}
