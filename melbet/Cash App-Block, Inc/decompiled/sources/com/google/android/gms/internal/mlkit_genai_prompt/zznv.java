package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.Intent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.mlkit.genai.common.GenAiException;
import com.google.mlkit.genai.prompt.Candidate;
import com.google.mlkit.genai.prompt.GenerateContentRequest;
import com.google.mlkit.genai.prompt.GenerateContentResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class zznv {
    public static final Money access$toZeroMoney(CurrencyCode currencyCode) {
        return new Money((Long) 0L, currencyCode, 4);
    }

    public static final Function1 getIntentBuilder(FinancialConnectionsAvailability financialConnectionsAvailability, final CollectBankAccountActivity collectBankAccountActivity) {
        int ordinal = financialConnectionsAvailability.ordinal();
        if (ordinal == 0) {
            final int i = 0;
            return new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    CollectBankAccountActivity collectBankAccountActivity2 = collectBankAccountActivity;
                    FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) obj;
                    switch (i2) {
                        case 0:
                            financialConnectionsSheetActivityArgs.getClass();
                            int i3 = FinancialConnectionsSheetActivity.$r8$clinit;
                            Intent intent = new Intent(collectBankAccountActivity2, (Class<?>) FinancialConnectionsSheetActivity.class);
                            intent.addFlags(65536);
                            intent.putExtra("FinancialConnectionsSheetActivityArgs", financialConnectionsSheetActivityArgs);
                            return intent;
                        default:
                            financialConnectionsSheetActivityArgs.getClass();
                            int i4 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                            Intent intent2 = new Intent(collectBankAccountActivity2, (Class<?>) FinancialConnectionsSheetLiteActivity.class);
                            intent2.addFlags(65536);
                            intent2.putExtra("FinancialConnectionsSheetActivityArgs", financialConnectionsSheetActivityArgs);
                            return intent2;
                    }
                }
            };
        }
        final int i2 = 1;
        if (ordinal == 1) {
            return new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    CollectBankAccountActivity collectBankAccountActivity2 = collectBankAccountActivity;
                    FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = (FinancialConnectionsSheetActivityArgs) obj;
                    switch (i22) {
                        case 0:
                            financialConnectionsSheetActivityArgs.getClass();
                            int i3 = FinancialConnectionsSheetActivity.$r8$clinit;
                            Intent intent = new Intent(collectBankAccountActivity2, (Class<?>) FinancialConnectionsSheetActivity.class);
                            intent.addFlags(65536);
                            intent.putExtra("FinancialConnectionsSheetActivityArgs", financialConnectionsSheetActivityArgs);
                            return intent;
                        default:
                            financialConnectionsSheetActivityArgs.getClass();
                            int i4 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                            Intent intent2 = new Intent(collectBankAccountActivity2, (Class<?>) FinancialConnectionsSheetLiteActivity.class);
                            intent2.addFlags(65536);
                            intent2.putExtra("FinancialConnectionsSheetActivityArgs", financialConnectionsSheetActivityArgs);
                            return intent2;
                    }
                }
            };
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final zzgg zza(GenerateContentRequest generateContentRequest, RealStrongMemoryCache realStrongMemoryCache, zzgc zzgcVar) {
        generateContentRequest.getClass();
        ArrayList arrayList = new ArrayList();
        String str = generateContentRequest.zzh.zza;
        if (str.length() > 32000) {
            throw new GenAiException(12, "Input text length exceeds the limit. Please check the countTokens API.", null);
        }
        if (zzgcVar == null) {
            str = "".concat(str);
        }
        arrayList.add(new zzfz(str, 0));
        zzeo zzeoVar = realStrongMemoryCache != null ? new zzeo(realStrongMemoryCache) : null;
        zzij zzijVar = zzil.zza;
        zzil.zzj(zzir.zza);
        zzil zzj = zzil.zzj(CollectionsKt.toList(arrayList));
        float f = generateContentRequest.zza;
        int i = generateContentRequest.zzc;
        zzil zzj2 = zzil.zzj(EmptyList.INSTANCE);
        int i2 = generateContentRequest.zze;
        int i3 = generateContentRequest.zzd;
        short s = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (0 | 1)) | 2)) | 4)) | 8)) | 64)) | 128)) | 256)) | 32)) | 16)) | 512)) | 1024)) | 1)) | 2)) | 4)) | 8)) | 64)) | 128)) | 16)) | 512);
        zzeo zzeoVar2 = zzeoVar != null ? zzeoVar : null;
        zzgc zzgcVar2 = zzgcVar != null ? zzgcVar : null;
        if (s == 2047 && zzj != null && zzj2 != null) {
            return new zzgg(zzj, f, i, zzj2, 1, i2, i3, zzeoVar2, true, 2, 2, 0, zzgcVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (zzj == null) {
            sb.append(" messages");
        }
        if ((s & 1) == 0) {
            sb.append(" temperature");
        }
        if ((s & 2) == 0) {
            sb.append(" topK");
        }
        if (zzj2 == null) {
            sb.append(" stopTokensList");
        }
        if ((s & 4) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((s & 8) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((s & 16) == 0) {
            sb.append(" numSamples");
        }
        if ((s & 32) == 0) {
            sb.append(" shouldApplySafetyFilter");
        }
        if ((s & 64) == 0) {
            sb.append(" preferredImageWidth");
        }
        if ((s & 128) == 0) {
            sb.append(" preferredImageHeight");
        }
        if ((s & 256) == 0) {
            sb.append(" numSoftTokens");
        }
        if ((s & 512) == 0) {
            sb.append(" rngSeed");
        }
        if ((s & 1024) == 0) {
            sb.append(" overrideRequestKind");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public static final GenerateContentResponse zzb(zzgh zzghVar) {
        zzghVar.getClass();
        zzil zzilVar = zzghVar.zza;
        zzilVar.getClass();
        List sortedWith = CollectionsKt.sortedWith(zzilVar, new zznu());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedWith) {
            if (hashSet.add(((zzgd) obj).zza)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((zzgd) it.next()).zza;
            str.getClass();
            arrayList2.add(new Candidate(str));
        }
        return new GenerateContentResponse(arrayList2);
    }
}
