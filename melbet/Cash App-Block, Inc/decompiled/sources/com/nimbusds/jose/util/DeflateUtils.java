package com.nimbusds.jose.util;

import android.content.Context;
import androidx.appcompat.widget.TintInfo;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import operations.logic.equals.EqualsOperation;
import operations.logic.equals.EqualsTableOfTruth;
import operations.logic.unwrap.SingleNestedValue;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public abstract class DeflateUtils {
    public static TintInfo errorHandler;

    public static boolean compare(EqualsOperation equalsOperation, Object obj, Function2 function2) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        Object unwrapSingleNestedValueOrDefault = equalsOperation.unwrapSingleNestedValueOrDefault(CollectionsKt.firstOrNull((List) asList));
        Object unwrapSingleNestedValueOrDefault2 = equalsOperation.unwrapSingleNestedValueOrDefault(CollectionsKt.getOrNull(1, asList));
        Map map = EqualsTableOfTruth.tableOfTruth;
        List list = (List) map.get(unwrapSingleNestedValueOrDefault);
        List list2 = (List) map.get(unwrapSingleNestedValueOrDefault2);
        if (list != null || list2 != null) {
            if (!(list != null ? list.contains(unwrapSingleNestedValueOrDefault2) : false)) {
                if (!(list2 != null ? list2.contains(unwrapSingleNestedValueOrDefault) : false)) {
                    return false;
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        Iterator it = asList.items.iterator();
        while (it.hasNext()) {
            arrayList.add(equalsOperation.unwrapValue(it.next()));
        }
        return equalsOperation.compareListOfTwo(arrayList, function2);
    }

    public static byte[] decompress(byte[] bArr) {
        Inflater inflater;
        InflaterInputStream inflaterInputStream;
        InflaterInputStream inflaterInputStream2 = null;
        try {
            inflater = new Inflater(true);
            try {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = inflaterInputStream.read(bArr2);
                    if (read <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inflaterInputStream.close();
                        inflater.end();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            } catch (Throwable th2) {
                th = th2;
                inflaterInputStream2 = inflaterInputStream;
                if (inflaterInputStream2 != null) {
                    inflaterInputStream2.close();
                }
                if (inflater != null) {
                    inflater.end();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
    }

    public static final TintInfo getErrorHandler(Context context) {
        context.getClass();
        TintInfo tintInfo = errorHandler;
        if (tintInfo != null) {
            return tintInfo;
        }
        synchronized (DeflateUtils.class) {
            TintInfo tintInfo2 = errorHandler;
            if (tintInfo2 != null) {
                return tintInfo2;
            }
            context.getClass();
            TintInfo tintInfo3 = new TintInfo();
            tintInfo3.mHasTintList = true;
            tintInfo3.mTintList = new ExceptionLogger(context);
            tintInfo3.mTintMode = EmptyList.INSTANCE;
            errorHandler = tintInfo3;
            return tintInfo3;
        }
    }

    public static Object unwrapSingleNestedValueOrDefault(Object obj) {
        Object unwrapSingleNestedValue = X509CertChainUtils.unwrapSingleNestedValue(obj);
        return !Intrinsics.areEqual(unwrapSingleNestedValue, obj) ? new SingleNestedValue(X509CertChainUtils.normalizeNumberString(unwrapSingleNestedValue)) : X509CertChainUtils.normalizeNumberString(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object unwrapValue(EqualsOperation equalsOperation, Object obj) {
        Object unwrapValue;
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) obj);
            if (doubleOrNull != null) {
                return doubleOrNull;
            }
        } else {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list instanceof List) {
                    List list2 = list;
                    if (list2.size() == 1 && CollectionsKt.first(list2) == null) {
                        unwrapValue = Double.valueOf(0.0d);
                        if (unwrapValue == null) {
                            return unwrapValue;
                        }
                    }
                }
                if (list.isEmpty()) {
                    unwrapValue = "";
                } else {
                    unwrapValue = ((list.size() != 1 || (CollectionsKt.firstOrNull(list) instanceof Boolean)) ? null : list) != null ? equalsOperation.unwrapValue(CollectionsKt.firstOrNull(list)) : null;
                }
                if (unwrapValue == null) {
                }
            } else if (obj instanceof Boolean) {
                return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            }
        }
        return obj;
    }
}
