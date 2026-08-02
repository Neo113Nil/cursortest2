package com.squareup.cash.graphics.backend.gl.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.common.math.DoubleUtils;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

/* loaded from: classes4.dex */
public final class PBRMaterial {
    public final int fragmentShader;
    public final int program;
    public final int vertexShader;

    /* loaded from: classes6.dex */
    public final class PBRMaterialInstance {
        public final int bitangentLoc;
        public final int cameraLoc;
        public final int lightColorsLoc;
        public final int lightPositionsLoc;
        public final int modelMatrixLoc;
        public final int mvpMatrixLoc;
        public final int normalLoc;
        public final int normalMatrixLoc;
        public final int positionLoc;
        public final int programLoc;
        public final int tangentLoc;
        public final int uvLoc;
        public final LinkedHashMap floatProperties = new LinkedHashMap();
        public final LinkedHashMap colorProperties = new LinkedHashMap();
        public final LinkedHashMap textureProperties = new LinkedHashMap();
        public final LinkedHashMap float3Properties = new LinkedHashMap();
        public final float[] lightPositions = new float[15];
        public final float[] lightColors = new float[15];
        public final ParcelableSnapshotMutableIntState invalidator = new ParcelableSnapshotMutableIntState(0);

        public PBRMaterialInstance(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.programLoc = i;
            this.modelMatrixLoc = i2;
            this.normalMatrixLoc = i3;
            this.mvpMatrixLoc = i4;
            this.cameraLoc = i5;
            this.lightPositionsLoc = i6;
            this.lightColorsLoc = i7;
            this.positionLoc = i8;
            this.normalLoc = i9;
            this.tangentLoc = i10;
            this.bitangentLoc = i11;
            this.uvLoc = i12;
        }

        public final void bindFloat(String str, State state, Composer composer, int i) {
            state.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-918008668);
            int i2 = (gapComposer.changed(state) ? 32 : 16) | i | (gapComposer.changedInstance(this) ? 256 : 128);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                this.floatProperties.put(str, state.getValue());
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda0(this, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda1(this, str, state, i, 0);
            }
        }

        public final void bindFloat3(MutableState mutableState, Composer composer, int i) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(47463187);
            int i2 = (gapComposer.changed(mutableState) ? 32 : 16) | i | (gapComposer.changedInstance(this) ? 256 : 128);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                this.float3Properties.put("forwardDirection", mutableState.getValue());
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda0(this, 2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(this, mutableState, i, 26);
            }
        }

        public final void bindTexture(String str, State state, Composer composer, int i) {
            state.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(-1729453307);
            int i2 = (gapComposer.changed(state) ? 32 : 16) | i | (gapComposer.changedInstance(this) ? 256 : 128);
            if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                GLTexture gLTexture = (GLTexture) state.getValue();
                LinkedHashMap linkedHashMap = this.textureProperties;
                if (gLTexture != null) {
                    linkedHashMap.put(str, gLTexture);
                } else {
                    linkedHashMap.remove(str);
                }
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda0(this, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
            } else {
                gapComposer.skipToGroupEnd();
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda1(this, str, state, i, 1);
            }
        }
    }

    public PBRMaterial(InputStream inputStream, InputStream inputStream2) {
        inputStream.getClass();
        inputStream2.getClass();
        Charset charset = Charsets.UTF_8;
        int loadShader = DoubleUtils.loadShader(35633, AppUpdateData.readText(new BufferedReader(new InputStreamReader(inputStream, charset), PKIFailureInfo.certRevoked)));
        this.vertexShader = loadShader;
        int loadShader2 = DoubleUtils.loadShader(35632, AppUpdateData.readText(new BufferedReader(new InputStreamReader(inputStream2, charset), PKIFailureInfo.certRevoked)));
        this.fragmentShader = loadShader2;
        this.program = DoubleUtils.createProgram(loadShader, loadShader2);
    }
}
