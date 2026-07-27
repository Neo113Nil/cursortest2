package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.versionedparcelable.IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406;
import androidx.versionedparcelable.KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868;
import androidx.versionedparcelable.NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385;
import androidx.versionedparcelable.ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290;
import androidx.versionedparcelable.ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
import androidx.versionedparcelable.TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349;
import androidx.versionedparcelable.VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997;
import androidx.versionedparcelable.XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692;
import androidx.versionedparcelable.XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898;
import androidx.versionedparcelable.ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final ArrayDeque ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = new ArrayDeque(10);
    public KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    @Override // com.google.firebase.messaging.EnhancedIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Intent intent) {
        KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868;
        int i;
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
                intent.getStringExtra("token");
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ArrayDeque arrayDeque = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
            if (!arrayDeque.contains(stringExtra)) {
                if (arrayDeque.size() >= 10) {
                    arrayDeque.remove();
                }
                arrayDeque.add(stringExtra);
            }
            if (this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 == null) {
                this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868(getApplicationContext());
            }
            kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
            if (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() >= 233700000) {
                new ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182().NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            Bundle bundle = new Bundle();
            String stringExtra2 = intent.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            synchronized (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                i = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i + 1;
            }
            ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(new ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290(i, 3, bundle, 0));
            return;
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        switch (stringExtra3) {
            case "gcm":
                XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(extras)) {
                    IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 ironMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 = new IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-Network-Io"));
                    try {
                        if (!new ZenithPathWorkerAliasSZA0eHfpevYaNTGBat94887047860215(this, ironMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406, newSingleThreadExecutor).ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834()) {
                            newSingleThreadExecutor.shutdown();
                            if (XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181(intent)) {
                                XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503("_nf", intent.getExtras());
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                break;
            case "send_error":
                if (intent.getStringExtra("google.message_id") == null) {
                    intent.getStringExtra("message_id");
                }
                String stringExtra4 = intent.getStringExtra("error");
                new TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349(stringExtra4);
                if (stringExtra4 != null) {
                    stringExtra4.toLowerCase(Locale.US).getClass();
                    break;
                }
                break;
            case "send_event":
                intent.getStringExtra("google.message_id");
                break;
        }
        if (this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 == null) {
        }
        kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        if (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() >= 233700000) {
        }
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public final Intent AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Intent intent) {
        return (Intent) ((ArrayDeque) VertexLinkStorageDecoderLe0HPuUBRRDa4DtrSp69996579254997.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050().TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).poll();
    }
}
