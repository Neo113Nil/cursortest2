package com.squareup.cash.card.onboarding;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import dev.zacsweers.metro.internal.Factory;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RealCardDetailsCreator {

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCardDetailsCreator();
        }
    }

    public static ByteString createSignatureBytes(CustomizationDetails customizationDetails) {
        Bitmap bitmap = CustomizationDetailsExtensionsKt.toBitmap(customizationDetails, 2023, 1276);
        Bitmap createBitmap = Bitmap.createBitmap(2023, 1276, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, new Paint());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(createBitmap.getAllocationByteCount());
        try {
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            ByteString.Companion companion = ByteString.Companion;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] copyOf = Arrays.copyOf(byteArray, byteArray.length);
            ByteString byteString = new ByteString(Arrays.copyOf(copyOf, copyOf.length));
            byteArrayOutputStream.close();
            return byteString;
        } finally {
        }
    }
}
