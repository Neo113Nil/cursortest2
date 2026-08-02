package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.a441;
import ru.CryptoPro.JCP.KeyStore.ContainerStore;
import ru.CryptoPro.JCP.KeyStore.JCPKeyStore;
import ru.CryptoPro.JCP.KeyStore.TrustStore;

/* loaded from: classes4.dex */
public final class JCPHDImageFile extends JCPKeyStore {
    public static final String STORE_NAME = "HDImageFileInternal";
    public static final a441 d = new a441();

    public JCPHDImageFile() {
        super(new ContainerStore(new HDImageReader("hd_image_file", "HDImageFile_class_default", HDImageStore.DEFAULT_OS_DIR, d), true), new TrustStore(), "HDImageFileInternal");
    }
}
