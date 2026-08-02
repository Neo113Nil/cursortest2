package com.google.crypto.tink.subtle;

import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.Curve25519;
import com.google.crypto.tink.internal.Random;
import com.google.maps.android.compose.InputHandlerKt;
import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;
import com.squareup.cash.instruments.screens.TransferOptions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.InstanceParameter;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KotlinKCallable;
import kotlin.reflect.jvm.internal.KotlinKParameter;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.TypeParameterTable;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class X25519 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ListBuilder computeParameters(KotlinKCallable kotlinKCallable, List list, KmType kmType, List list2, TypeParameterTable typeParameterTable, boolean z) {
        kotlinKCallable.getClass();
        list.getClass();
        list2.getClass();
        typeParameterTable.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (z) {
            ClassBasedDeclarationContainer container = kotlinKCallable.getContainer();
            if (container instanceof KClassImpl) {
                if (Room.isConstructor(kotlinKCallable)) {
                    if (((KClassImpl) container).isInner()) {
                        Class<?> declaringClass = PapaEvent.getJavaClass((KClass) container).getDeclaringClass();
                        declaringClass.getClass();
                        createListBuilder.add(new InstanceParameter(kotlinKCallable, Reflection.factory.getOrCreateKotlinClass(declaringClass)));
                    }
                } else if (!(kotlinKCallable instanceof KotlinKProperty) || !InputHandlerKt.isLocalDelegated((ReflectKProperty) kotlinKCallable)) {
                    Path$$ExternalSyntheticBUOutline0.m$3(kotlinKCallable, "Only top-level callables are supported for now: ");
                    return null;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                createListBuilder.add(new KotlinKParameter(kotlinKCallable, (KmValueParameter) it.next(), createListBuilder.getSize(), KParameter$Kind.CONTEXT, typeParameterTable));
            }
            if (kmType != null) {
                String asString = SpecialNames.THIS.asString();
                asString.getClass();
                KmValueParameter kmValueParameter = new KmValueParameter(asString);
                kmValueParameter.setType(kmType);
                createListBuilder.add(new KotlinKParameter(kotlinKCallable, kmValueParameter, createListBuilder.getSize(), KParameter$Kind.EXTENSION_RECEIVER, typeParameterTable));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            createListBuilder.add(new KotlinKParameter(kotlinKCallable, (KmValueParameter) it2.next(), createListBuilder.getSize(), KParameter$Kind.VALUE, typeParameterTable));
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public static byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) {
        int i = 32;
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Private key must have 32 bytes.");
            return null;
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = b;
        copyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Public key length is not 32-byte");
            return null;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        int i3 = 0;
        while (true) {
            byte[][] bArr3 = Curve25519.BANNED_PUBLIC_KEYS;
            if (i3 >= 7) {
                int i4 = 10;
                long[] jArr2 = new long[10];
                for (int i5 = 0; i5 < 10; i5++) {
                    int i6 = Curve25519.expandStart[i5];
                    jArr2[i5] = ((((((copyOf2[i6 + 1] & 255) << 8) | (copyOf2[i6] & 255)) | ((copyOf2[i6 + 2] & 255) << 16)) | ((copyOf2[i6 + 3] & 255) << 24)) >> Curve25519.expandShift[i5]) & Curve25519.mask[i5 & 1];
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                while (i2 < i) {
                    int i7 = copyOf[31 - i2] & 255;
                    int i8 = 0;
                    while (i8 < 8) {
                        int i9 = (i7 >> (7 - i8)) & 1;
                        Curve25519.swapConditional(jArr5, jArr3, i9);
                        Curve25519.swapConditional(jArr6, jArr4, i9);
                        byte[] bArr4 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr5, 10);
                        int i10 = i8;
                        long[] jArr11 = new long[19];
                        int i11 = i7;
                        long[] jArr12 = new long[19];
                        int i12 = i2;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = jArr;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = new long[19];
                        long[] jArr17 = jArr10;
                        long[] jArr18 = new long[19];
                        long[] jArr19 = new long[19];
                        Curve25519.sum(jArr5, jArr5, jArr6);
                        Curve25519.sub(jArr6, copyOf3, jArr6);
                        long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                        Curve25519.sum(jArr3, jArr3, jArr4);
                        Curve25519.sub(jArr4, copyOf4, jArr4);
                        Curve25519.product(jArr15, jArr3, jArr6);
                        Curve25519.product(jArr16, jArr5, jArr4);
                        Curve25519.reduceSizeByModularReduction(jArr15);
                        Curve25519.reduceCoefficients(jArr15);
                        Curve25519.reduceSizeByModularReduction(jArr16);
                        Curve25519.reduceCoefficients(jArr16);
                        long[] jArr20 = jArr3;
                        System.arraycopy(jArr15, 0, copyOf4, 0, 10);
                        Curve25519.sum(jArr15, jArr15, jArr16);
                        Curve25519.sub(jArr16, copyOf4, jArr16);
                        Curve25519.square(jArr19, jArr15);
                        Curve25519.square(jArr18, jArr16);
                        Curve25519.product(jArr16, jArr18, jArr2);
                        Curve25519.reduceSizeByModularReduction(jArr16);
                        Curve25519.reduceCoefficients(jArr16);
                        System.arraycopy(jArr19, 0, jArr7, 0, 10);
                        System.arraycopy(jArr16, 0, jArr8, 0, 10);
                        Curve25519.square(jArr12, jArr5);
                        Curve25519.square(jArr13, jArr6);
                        Curve25519.product(jArr9, jArr12, jArr13);
                        Curve25519.reduceSizeByModularReduction(jArr9);
                        Curve25519.reduceCoefficients(jArr9);
                        Curve25519.sub(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr11, 10, 18, 0L);
                        int i13 = 0;
                        for (int i14 = 10; i13 < i14; i14 = 10) {
                            jArr11[i13] = jArr13[i13] * 121665;
                            i13++;
                        }
                        Curve25519.reduceCoefficients(jArr11);
                        Curve25519.sum(jArr11, jArr11, jArr12);
                        Curve25519.product(jArr17, jArr13, jArr11);
                        Curve25519.reduceSizeByModularReduction(jArr17);
                        Curve25519.reduceCoefficients(jArr17);
                        Curve25519.swapConditional(jArr9, jArr7, i9);
                        Curve25519.swapConditional(jArr17, jArr8, i9);
                        i8 = i10 + 1;
                        long[] jArr21 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr21;
                        long[] jArr22 = jArr9;
                        jArr9 = jArr5;
                        jArr5 = jArr22;
                        long[] jArr23 = jArr6;
                        jArr6 = jArr17;
                        jArr10 = jArr23;
                        jArr3 = jArr7;
                        copyOf = bArr4;
                        i7 = i11;
                        i2 = i12;
                        jArr = jArr14;
                        jArr7 = jArr20;
                    }
                    i2++;
                    i = 32;
                    i4 = 10;
                }
                long[] jArr24 = jArr;
                int i15 = i4;
                long[] jArr25 = new long[i15];
                long[] jArr26 = new long[i15];
                long[] jArr27 = new long[i15];
                long[] jArr28 = new long[i15];
                long[] jArr29 = new long[i15];
                long[] jArr30 = new long[i15];
                long[] jArr31 = new long[i15];
                long[] jArr32 = new long[i15];
                long[] jArr33 = new long[i15];
                long[] jArr34 = new long[i15];
                long[] jArr35 = jArr3;
                long[] jArr36 = new long[i15];
                Curve25519.square(jArr26, jArr6);
                Curve25519.square(jArr36, jArr26);
                Curve25519.square(jArr34, jArr36);
                Curve25519.mult(jArr27, jArr34, jArr6);
                Curve25519.mult(jArr28, jArr27, jArr26);
                Curve25519.square(jArr34, jArr28);
                Curve25519.mult(jArr29, jArr34, jArr27);
                Curve25519.square(jArr34, jArr29);
                Curve25519.square(jArr36, jArr34);
                Curve25519.square(jArr34, jArr36);
                Curve25519.square(jArr36, jArr34);
                Curve25519.square(jArr34, jArr36);
                Curve25519.mult(jArr30, jArr34, jArr29);
                Curve25519.square(jArr34, jArr30);
                Curve25519.square(jArr36, jArr34);
                for (int i16 = 2; i16 < 10; i16 += 2) {
                    Curve25519.square(jArr34, jArr36);
                    Curve25519.square(jArr36, jArr34);
                }
                Curve25519.mult(jArr31, jArr36, jArr30);
                Curve25519.square(jArr34, jArr31);
                Curve25519.square(jArr36, jArr34);
                for (int i17 = 2; i17 < 20; i17 += 2) {
                    Curve25519.square(jArr34, jArr36);
                    Curve25519.square(jArr36, jArr34);
                }
                Curve25519.mult(jArr34, jArr36, jArr31);
                Curve25519.square(jArr36, jArr34);
                Curve25519.square(jArr34, jArr36);
                for (int i18 = 2; i18 < 10; i18 += 2) {
                    Curve25519.square(jArr36, jArr34);
                    Curve25519.square(jArr34, jArr36);
                }
                Curve25519.mult(jArr32, jArr34, jArr30);
                Curve25519.square(jArr34, jArr32);
                Curve25519.square(jArr36, jArr34);
                for (int i19 = 2; i19 < 50; i19 += 2) {
                    Curve25519.square(jArr34, jArr36);
                    Curve25519.square(jArr36, jArr34);
                }
                Curve25519.mult(jArr33, jArr36, jArr32);
                Curve25519.square(jArr36, jArr33);
                Curve25519.square(jArr34, jArr36);
                for (int i20 = 2; i20 < 100; i20 += 2) {
                    Curve25519.square(jArr36, jArr34);
                    Curve25519.square(jArr34, jArr36);
                }
                Curve25519.mult(jArr36, jArr34, jArr33);
                Curve25519.square(jArr34, jArr36);
                Curve25519.square(jArr36, jArr34);
                for (int i21 = 2; i21 < 50; i21 += 2) {
                    Curve25519.square(jArr34, jArr36);
                    Curve25519.square(jArr36, jArr34);
                }
                Curve25519.mult(jArr34, jArr36, jArr32);
                Curve25519.square(jArr36, jArr34);
                Curve25519.square(jArr34, jArr36);
                Curve25519.square(jArr36, jArr34);
                Curve25519.square(jArr34, jArr36);
                Curve25519.square(jArr36, jArr34);
                Curve25519.mult(jArr25, jArr36, jArr28);
                Curve25519.mult(jArr24, jArr5, jArr25);
                long[] jArr37 = new long[10];
                long[] jArr38 = new long[10];
                long[] jArr39 = new long[11];
                long[] jArr40 = new long[11];
                long[] jArr41 = new long[11];
                Curve25519.mult(jArr37, jArr2, jArr24);
                Curve25519.sum(jArr38, jArr2, jArr24);
                long[] jArr42 = new long[10];
                jArr42[0] = 486662;
                Curve25519.sum(jArr40, jArr38, jArr42);
                Curve25519.mult(jArr40, jArr40, jArr4);
                Curve25519.sum(jArr40, jArr40, jArr35);
                Curve25519.mult(jArr40, jArr40, jArr37);
                Curve25519.mult(jArr40, jArr40, jArr35);
                for (int i22 = 0; i22 < 10; i22++) {
                    jArr39[i22] = jArr40[i22] * 4;
                }
                Curve25519.reduceCoefficients(jArr39);
                Curve25519.mult(jArr40, jArr37, jArr4);
                Curve25519.sub(jArr40, jArr40, jArr4);
                Curve25519.mult(jArr41, jArr38, jArr35);
                Curve25519.sum(jArr40, jArr40, jArr41);
                Curve25519.square(jArr40, jArr40);
                if (MessageDigest.isEqual(Curve25519.contract(jArr39), Curve25519.contract(jArr40))) {
                    return Curve25519.contract(jArr24);
                }
                a$$ExternalSyntheticBUOutline0.m$1("Arithmetic error in curve multiplication with the public key: ".concat(Hex.encode(bArr2)));
                return null;
            }
            if (MessageDigest.isEqual(bArr3[i3], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(Hex.encode(bArr3[i3])));
            }
            i3++;
        }
    }

    public static byte[] generatePrivateKey() {
        byte[] randBytes = Random.randBytes(32);
        randBytes[0] = (byte) (randBytes[0] | 7);
        byte b = (byte) (randBytes[31] & 63);
        randBytes[31] = b;
        randBytes[31] = (byte) (b | 128);
        return randBytes;
    }

    public static final String getOptionValue(TransferOptionPickerSelection transferOptionPickerSelection) {
        transferOptionPickerSelection.getClass();
        String str = transferOptionPickerSelection.token;
        if (str != null) {
            return str;
        }
        TransferOptions transferOptions = transferOptionPickerSelection.transferOption;
        transferOptions.getClass();
        switch (transferOptions.ordinal()) {
            case 0:
                return "cash_balance";
            case 1:
                return "savings_goal";
            case 2:
                return "general_savings";
            case 3:
                return "debit_card";
            case 4:
                return "credit_card";
            case 5:
                return "bank_account";
            case 6:
                return "link_debit";
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static byte[] publicFromPrivate(byte[] bArr) {
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Private key must have 32 bytes.");
            return null;
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return computeSharedSecret(bArr, bArr2);
    }
}
