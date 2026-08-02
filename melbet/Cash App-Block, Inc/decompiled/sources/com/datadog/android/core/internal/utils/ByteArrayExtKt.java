package com.datadog.android.core.internal.utils;

import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.ArrayIterator;

/* loaded from: classes4.dex */
public abstract class ByteArrayExtKt {
    public static final void copyTo(byte[] bArr, byte[] bArr2, int i, int i2, InternalLogger internalLogger) {
        bArr.getClass();
        internalLogger.getClass();
        int i3 = i + i2;
        int length = bArr2.length;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        if (i3 > length) {
            DBUtil.log$default(internalLogger, 4, target, ByteArrayExtKt$copyTo$1.INSTANCE, null, false, 56);
        } else if (i2 > bArr.length) {
            DBUtil.log$default(internalLogger, 4, target, ByteArrayExtKt$copyTo$1.INSTANCE$1, null, false, 56);
        } else {
            System.arraycopy(bArr, 0, bArr2, i, i2);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandProfileWithDefaultLocation.deepLinkSpecs;
    }

    public static byte[] join$default(Collection collection, byte[] bArr, InternalLogger internalLogger) {
        int i;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        collection.getClass();
        bArr.getClass();
        internalLogger.getClass();
        Collection collection2 = collection;
        Iterator it = collection2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((byte[]) it.next()).length;
        }
        if (collection.isEmpty()) {
            i = 0;
        } else {
            i = (collection.size() - 1) * bArr.length;
        }
        byte[] bArr4 = new byte[bArr2.length + i2 + i + bArr3.length];
        copyTo(bArr2, bArr4, 0, bArr2.length, internalLogger);
        int length = bArr2.length;
        Iterator it2 = CollectionsKt.withIndex(collection2).iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it2;
            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                copyTo(bArr3, bArr4, length, bArr3.length, internalLogger);
                return bArr4;
            }
            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
            Object obj = indexedValue.value;
            byte[] bArr5 = (byte[]) obj;
            copyTo(bArr5, bArr4, length, bArr5.length, internalLogger);
            length += ((byte[]) obj).length;
            if (indexedValue.index != collection.size() - 1) {
                copyTo(bArr, bArr4, length, bArr.length, internalLogger);
                length += bArr.length;
            }
        }
    }
}
