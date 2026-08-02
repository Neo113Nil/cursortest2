package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.media3.exoplayer.source.MediaLoadData;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.random.Random;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class zzje {
    public static final ElementsSessionContext access$retrieveElementsSessionContext(CollectBankAccountConfiguration collectBankAccountConfiguration) {
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.InstantDebits) {
            return ((CollectBankAccountConfiguration.InstantDebits) collectBankAccountConfiguration).elementsSessionContext;
        }
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccountInternal) {
            return ((CollectBankAccountConfiguration.USBankAccountInternal) collectBankAccountConfiguration).elementsSessionContext;
        }
        if (collectBankAccountConfiguration instanceof CollectBankAccountConfiguration.USBankAccount) {
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static MediaLoadData provideExponentialBackoff$real() {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return new MediaLoadData(DurationKt.toDuration(1, durationUnit), DurationKt.toDuration(10, durationUnit), Random.Default);
    }

    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zzjd zzjdVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zzjdVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(zzjdVar) != obj && atomicReferenceFieldUpdater.get(zzjdVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
