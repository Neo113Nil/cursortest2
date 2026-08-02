package com.nimbusds.jose.util;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.types.CapturedKTypeKt$$Lambda$0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes9.dex */
public abstract class X509CertChainUtils {
    public static final List allTypeParameters(KClass kClass) {
        kClass.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMapIterable(SequencesKt__SequencesKt.generateSequence(CapturedKTypeKt$$Lambda$0.INSTANCE, kClass), CapturedKTypeKt$$Lambda$0.INSTANCE$1));
    }

    public static Object normalizeNumberString(Object obj) {
        String obj2;
        Comparable intOrNull;
        Comparable comparable = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            comparable = intOrNull;
        } else if (str != null) {
            comparable = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
        }
        return (comparable == null || (obj2 = comparable.toString()) == null) ? obj : obj2;
    }

    public static LinkedList parse(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                try {
                    linkedList.add(X509CertUtils.parseWithException(((Base64) list.get(i)).decode()));
                } catch (CertificateException e) {
                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Invalid X.509 certificate at position ", ": ");
                    m2m.append(e.getMessage());
                    throw new ParseException(m2m.toString(), 0);
                }
            }
        }
        return linkedList;
    }

    public static LinkedList toBase64List(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The X.509 certificate at position ", " must not be null"));
                return null;
            }
            if (!(obj instanceof String)) {
                JWK$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The X.509 certificate at position ", " must be encoded as a Base64 string"));
                return null;
            }
            linkedList.add(new Base64((String) obj));
        }
        return linkedList;
    }

    public static Object unwrapSingleNestedValue(Object obj) {
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        return list.size() == 1 ? unwrapSingleNestedValue(CollectionsKt.firstOrNull(list)) : obj;
    }
}
