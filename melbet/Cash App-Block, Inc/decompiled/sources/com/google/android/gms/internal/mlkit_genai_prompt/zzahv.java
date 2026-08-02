package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt$ShaderBrush$1;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.phoneplans.applets.presenters.PhonePlansAppletTilePresenter$Factory$Impl;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class zzahv {
    /* renamed from: drawMultiParagraph-7AXcY_I, reason: not valid java name */
    public static final void m2021drawMultiParagraph7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        canvas.save();
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        if (arrayList.size() <= 1) {
            m2022drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle);
        } else if (brush instanceof SolidColor) {
            m2022drawParagraphs7AXcY_I(multiParagraph, canvas, brush, f, shadow, textDecoration, drawStyle);
        } else {
            if (!(brush instanceof ShaderBrush)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i);
                f3 += paragraphInfo.paragraph.getHeight();
                f2 = Math.max(f2, paragraphInfo.paragraph.getWidth());
            }
            Shader mo671createShaderuvyYCjk = ((ShaderBrush) brush).mo671createShaderuvyYCjk((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax));
            Matrix matrix = new Matrix();
            mo671createShaderuvyYCjk.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AndroidParagraph androidParagraph = ((ParagraphInfo) arrayList.get(i2)).paragraph;
                androidParagraph.m959painthn5TExg(canvas, new BrushKt$ShaderBrush$1(mo671createShaderuvyYCjk), f, shadow, textDecoration, drawStyle);
                canvas.translate(RecyclerView.DECELERATION_RATE, androidParagraph.getHeight());
                matrix.setTranslate(RecyclerView.DECELERATION_RATE, -androidParagraph.getHeight());
                mo671createShaderuvyYCjk.setLocalMatrix(matrix);
            }
        }
        canvas.restore();
    }

    /* renamed from: drawParagraphs-7AXcY_I, reason: not valid java name */
    public static final void m2022drawParagraphs7AXcY_I(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) {
        ArrayList arrayList = multiParagraph.paragraphInfoList;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i);
            paragraphInfo.paragraph.m959painthn5TExg(canvas, brush, f, shadow, textDecoration, drawStyle);
            canvas.translate(RecyclerView.DECELERATION_RATE, paragraphInfo.paragraph.getHeight());
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.CollectGpsLocationData.deepLinkSpecs;
    }

    public static Applet phonePlansApplet(RealPhonePlansAppletTileAvailabilityManager realPhonePlansAppletTileAvailabilityManager, LifecycleOwner lifecycleOwner, PhonePlansAppletTilePresenter$Factory$Impl phonePlansAppletTilePresenter$Factory$Impl) {
        return new Applet(AppletId.PHONE_PLANS, realPhonePlansAppletTileAvailabilityManager.availabilityState, new PdfPreviewViewKt$$ExternalSyntheticLambda0(19, phonePlansAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }
}
