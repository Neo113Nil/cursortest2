package com.squareup.cash.card.onboarding.opengl.renderer;

import android.opengl.GLES20;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.math.DoubleUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes6.dex */
public final class MoodHeatProgram {
    public static final FloatBuffer texCoordArray;
    public static final FloatBuffer vertexArray;
    public final int fragmentShader;
    public final int heatMapTextureId;
    public final int heatMaskLocation;
    public final int heatMaskTextureId;
    public final int positionLocation;
    public final int programHandle;
    public final int temperatureMapLocation;
    public final int temperatureMapTextureId;
    public final int textureLocation;
    public final int vertexShader;

    static {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        vertexArray = asFloatBuffer;
        float[] fArr = {RecyclerView.DECELERATION_RATE, 1.0f, 1.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr);
        asFloatBuffer2.position(0);
        texCoordArray = asFloatBuffer2;
    }

    public MoodHeatProgram(int i, int i2, int i3) {
        this.heatMapTextureId = i;
        this.temperatureMapTextureId = i2;
        this.heatMaskTextureId = i3;
        int loadShader = DoubleUtils.loadShader(35633, "attribute vec4 position;\nattribute vec4 textureCoord;\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = position;\n  vTextureCoord = textureCoord.xy;\n}");
        this.vertexShader = loadShader;
        int loadShader2 = DoubleUtils.loadShader(35632, "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D heatMap;\nuniform sampler2D temperatureMap;\nuniform sampler2D heatMask;\n\nvoid main() {\n  vec3 sampleColor = texture2D(heatMap, vTextureCoord).rgb;\n  vec4 maskColor = texture2D(heatMask, vTextureCoord).rgba;\n  vec4 heatColor = texture2D(temperatureMap, vec2(sampleColor.b, 0.0)).rgba;\n  gl_FragColor = mix(vec4(0.0, 0.0, 0.0, 0.0), heatColor, clamp(sampleColor.b * 2.0 * (1.0 - maskColor.a), 0.0, 0.9));\n}");
        this.fragmentShader = loadShader2;
        int createProgram = DoubleUtils.createProgram(loadShader, loadShader2);
        this.programHandle = createProgram;
        int glGetUniformLocation = GLES20.glGetUniformLocation(createProgram, "temperatureMap");
        DoubleUtils.checkLocation(glGetUniformLocation, "temperatureMap");
        this.temperatureMapLocation = glGetUniformLocation;
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(createProgram, "heatMask");
        DoubleUtils.checkLocation(glGetUniformLocation2, "heatMask");
        this.heatMaskLocation = glGetUniformLocation2;
        int glGetAttribLocation = GLES20.glGetAttribLocation(createProgram, "position");
        DoubleUtils.checkLocation(glGetAttribLocation, "position");
        this.positionLocation = glGetAttribLocation;
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(createProgram, "textureCoord");
        DoubleUtils.checkLocation(glGetAttribLocation2, "textureCoord");
        this.textureLocation = glGetAttribLocation2;
    }
}
