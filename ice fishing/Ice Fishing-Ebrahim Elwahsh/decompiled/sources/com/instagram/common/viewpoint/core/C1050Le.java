package com.instagram.common.viewpoint.core;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1050Le implements Comparator<File> {
    public C1050Le() {
    }

    private int A00(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 == j10 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
