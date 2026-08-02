package com.squareup.cash.deposits.physical.backend.real.barcode;

import java.nio.IntBuffer;
import java.util.function.ObjIntConsumer;

/* loaded from: classes6.dex */
public final /* synthetic */ class AndroidBarcodeGenerator$$ExternalSyntheticLambda2 implements ObjIntConsumer {
    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i) {
        ((IntBuffer) obj).put(i);
    }
}
