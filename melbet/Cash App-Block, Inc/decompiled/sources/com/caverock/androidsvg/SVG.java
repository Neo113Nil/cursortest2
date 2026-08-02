package com.caverock.androidsvg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.ContentInfoCompat;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.extractor.ts.SectionPayloadReader;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.PlayerControlView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactionExecutor;
import androidx.room.util.DBUtil;
import androidx.work.SystemClock;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealEventPublisher$ZiplineEventListener;
import app.cash.zipline.internal.bridge.ResultOrCallback;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.decode.ExifInterfaceInputStream;
import com.bugsnag.android.Client;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import com.bumptech.glide.util.pool.FactoryPools;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.utils.ByteArrayExtKt$copyTo$1;
import com.datadog.android.okhttp.DatadogInterceptor;
import com.datadog.android.okhttp.DatadogInterceptor$getBodyLength$1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.fillr.analytics.AnalyticsEvent;
import com.fillr.browsersdk.Fillr;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashException;
import com.fillr.n;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$Flag;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.mlkit_vision_common.zzhq;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.internal.zzcjk;
import com.google.common.util.concurrent.FutureCallback;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.BulkUpdateBrandsResponse;
import com.squareup.protos.cash.local.client.app.v1.CreateAppOrderResponse;
import com.squareup.protos.cash.local.client.app.v1.GetAppShortlinkResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.Adler32;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import net.oneformapp.PopEncryptorV2_;
import net.oneformapp.ProfileStore_;
import net.oneformapp.helper.CalendarConverter;
import net.oneformapp.helper.HelperFunctions;
import net.oneformapp.schema.Element;
import net.oneformapp.schema.ElementType;
import net.oneformapp.schema.Schema_;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import timber.log.Timber;

/* loaded from: classes4.dex */
public class SVG implements SectionPayloadReader, FutureCallback, ResourceTranscoder, Pools$Pool, ProcessLifecycleMonitor.Callback, Interceptor.Chain, OnCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public Object cssRules;
    public Object idToElementMap;
    public Object rootElement;

    public final class Circle extends GraphicsElement {
        public Length cx;
        public Length cy;
        public Length r;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "circle";
        }
    }

    public final class ClipPath extends Group implements NotDirectlyRendered {
        public Boolean clipPathUnitsAreUser;

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "clipPath";
        }
    }

    public final class Colour extends SvgPaint {
        public static final Colour BLACK = new Colour(-16777216);
        public static final Colour TRANSPARENT = new Colour(0);
        public final int colour;

        public Colour(int i) {
            this.colour = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.colour));
        }
    }

    public final class CurrentColor extends SvgPaint {
        public static final CurrentColor instance = new CurrentColor();
    }

    public final class Defs extends Group implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "defs";
        }
    }

    public final class Ellipse extends GraphicsElement {
        public Length cx;
        public Length cy;
        public Length rx;
        public Length ry;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "ellipse";
        }
    }

    public abstract class GradientElement extends SvgElementBase implements SvgContainer {
        public List children = new ArrayList();
        public Matrix gradientTransform;
        public Boolean gradientUnitsAreUser;
        public String href;
        public int spreadMethod;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void addChild(SvgObject svgObject) {
            if (svgObject instanceof Stop) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return this.children;
        }
    }

    public abstract class GraphicsElement extends SvgElement implements HasTransform, SvgConditional {
        public Matrix transform;
        public HashSet requiredFeatures = null;
        public String requiredExtensions = null;
        public HashSet systemLanguage = null;
        public HashSet requiredFormats = null;
        public HashSet requiredFonts = null;

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFeatures(HashSet hashSet) {
            this.requiredFeatures = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFonts(HashSet hashSet) {
            this.requiredFonts = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFormats(HashSet hashSet) {
            this.requiredFormats = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setSystemLanguage(HashSet hashSet) {
            this.systemLanguage = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public class Group extends SvgConditionalContainer implements HasTransform {
        public Matrix transform;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public String getNodeName() {
            return "group";
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public interface HasTransform {
        void setTransform(Matrix matrix);
    }

    public final class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        public Length height;
        public String href;
        public Matrix transform;
        public Length width;
        public Length x;
        public Length y;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "image";
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public final class Line extends GraphicsElement {
        public Length x1;
        public Length x2;
        public Length y1;
        public Length y2;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "line";
        }
    }

    public final class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        public Length markerHeight;
        public boolean markerUnitsAreUser;
        public Length markerWidth;
        public Float orient;
        public Length refX;
        public Length refY;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "marker";
        }
    }

    public final class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        public Length height;
        public Boolean maskContentUnitsAreUser;
        public Boolean maskUnitsAreUser;
        public Length width;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "mask";
        }
    }

    public interface NotDirectlyRendered {
    }

    public final class PaintReference extends SvgPaint {
        public final SvgPaint fallback;
        public final String href;

        public PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public final String toString() {
            return this.href + " " + this.fallback;
        }
    }

    public final class Path extends GraphicsElement {
        public PathDefinition d;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "path";
        }
    }

    public final class PathDefinition implements PathInterface {
        public final /* synthetic */ int $r8$classId;
        public byte[] commands;
        public int commandsLength;
        public float[] coords;
        public int coordsLength;

        public /* synthetic */ PathDefinition(int i) {
            this.$r8$classId = i;
        }

        public final void addCommand(byte b) {
            switch (this.$r8$classId) {
                case 0:
                    int i = this.commandsLength;
                    byte[] bArr = this.commands;
                    if (i == bArr.length) {
                        byte[] bArr2 = new byte[bArr.length * 2];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        this.commands = bArr2;
                    }
                    byte[] bArr3 = this.commands;
                    int i2 = this.commandsLength;
                    this.commandsLength = i2 + 1;
                    bArr3[i2] = b;
                    break;
                default:
                    int i3 = this.commandsLength;
                    byte[] bArr4 = this.commands;
                    if (i3 == bArr4.length) {
                        byte[] bArr5 = new byte[bArr4.length * 2];
                        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
                        this.commands = bArr5;
                    }
                    byte[] bArr6 = this.commands;
                    int i4 = this.commandsLength;
                    this.commandsLength = i4 + 1;
                    bArr6[i4] = b;
                    break;
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            addCommand((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.coordsLength = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.coordsLength = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.coordsLength = i5;
            fArr[i4] = f4;
            this.coordsLength = i + 5;
            fArr[i5] = f5;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void close() {
            addCommand((byte) 8);
        }

        public final void coordsEnsure(int i) {
            switch (this.$r8$classId) {
                case 0:
                    float[] fArr = this.coords;
                    if (fArr.length < this.coordsLength + i) {
                        float[] fArr2 = new float[fArr.length * 2];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        this.coords = fArr2;
                        break;
                    }
                    break;
                default:
                    float[] fArr3 = this.coords;
                    if (fArr3.length < this.coordsLength + i) {
                        float[] fArr4 = new float[fArr3.length * 2];
                        System.arraycopy(fArr3, 0, fArr4, 0, fArr3.length);
                        this.coords = fArr4;
                        break;
                    }
                    break;
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            switch (this.$r8$classId) {
                case 0:
                    addCommand((byte) 2);
                    coordsEnsure(6);
                    float[] fArr = this.coords;
                    int i = this.coordsLength;
                    int i2 = i + 1;
                    this.coordsLength = i2;
                    fArr[i] = f;
                    int i3 = i + 2;
                    this.coordsLength = i3;
                    fArr[i2] = f2;
                    int i4 = i + 3;
                    this.coordsLength = i4;
                    fArr[i3] = f3;
                    int i5 = i + 4;
                    this.coordsLength = i5;
                    fArr[i4] = f4;
                    int i6 = i + 5;
                    this.coordsLength = i6;
                    fArr[i5] = f5;
                    this.coordsLength = i + 6;
                    fArr[i6] = f6;
                    break;
                default:
                    addCommand((byte) 2);
                    coordsEnsure(6);
                    float[] fArr2 = this.coords;
                    int i7 = this.coordsLength;
                    int i8 = i7 + 1;
                    this.coordsLength = i8;
                    fArr2[i7] = f;
                    int i9 = i7 + 2;
                    this.coordsLength = i9;
                    fArr2[i8] = f2;
                    int i10 = i7 + 3;
                    this.coordsLength = i10;
                    fArr2[i9] = f3;
                    int i11 = i7 + 4;
                    this.coordsLength = i11;
                    fArr2[i10] = f4;
                    int i12 = i7 + 5;
                    this.coordsLength = i12;
                    fArr2[i11] = f5;
                    this.coordsLength = i7 + 6;
                    fArr2[i12] = f6;
                    break;
            }
        }

        public void enumeratePath(PathInterface pathInterface) {
            int i = 0;
            for (int i2 = 0; i2 < this.commandsLength; i2++) {
                byte b = this.commands[i2];
                if (b == 0) {
                    float[] fArr = this.coords;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    pathInterface.moveTo(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.coords;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    pathInterface.lineTo(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.coords;
                    pathInterface.cubicTo(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.coords;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    pathInterface.quadTo(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.coords;
                    pathInterface.arcTo(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    pathInterface.close();
                }
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void lineTo(float f, float f2) {
            switch (this.$r8$classId) {
                case 0:
                    addCommand((byte) 1);
                    coordsEnsure(2);
                    float[] fArr = this.coords;
                    int i = this.coordsLength;
                    int i2 = i + 1;
                    this.coordsLength = i2;
                    fArr[i] = f;
                    this.coordsLength = i + 2;
                    fArr[i2] = f2;
                    break;
                default:
                    addCommand((byte) 1);
                    coordsEnsure(2);
                    float[] fArr2 = this.coords;
                    int i3 = this.coordsLength;
                    int i4 = i3 + 1;
                    this.coordsLength = i4;
                    fArr2[i3] = f;
                    this.coordsLength = i3 + 2;
                    fArr2[i4] = f2;
                    break;
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public void moveTo(float f, float f2) {
            addCommand((byte) 0);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            this.coordsLength = i2;
            fArr[i] = f;
            this.coordsLength = i + 2;
            fArr[i2] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void quadTo(float f, float f2, float f3, float f4) {
            switch (this.$r8$classId) {
                case 0:
                    addCommand((byte) 3);
                    coordsEnsure(4);
                    float[] fArr = this.coords;
                    int i = this.coordsLength;
                    int i2 = i + 1;
                    this.coordsLength = i2;
                    fArr[i] = f;
                    int i3 = i + 2;
                    this.coordsLength = i3;
                    fArr[i2] = f2;
                    int i4 = i + 3;
                    this.coordsLength = i4;
                    fArr[i3] = f3;
                    this.coordsLength = i + 4;
                    fArr[i4] = f4;
                    break;
                default:
                    addCommand((byte) 3);
                    coordsEnsure(4);
                    float[] fArr2 = this.coords;
                    int i5 = this.coordsLength;
                    int i6 = i5 + 1;
                    this.coordsLength = i6;
                    fArr2[i5] = f;
                    int i7 = i5 + 2;
                    this.coordsLength = i7;
                    fArr2[i6] = f2;
                    int i8 = i5 + 3;
                    this.coordsLength = i8;
                    fArr2[i7] = f3;
                    this.coordsLength = i5 + 4;
                    fArr2[i8] = f4;
                    break;
            }
        }
    }

    public interface PathInterface {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    public final class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        public Length height;
        public String href;
        public Boolean patternContentUnitsAreUser;
        public Matrix patternTransform;
        public Boolean patternUnitsAreUser;
        public Length width;
        public Length x;
        public Length y;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "pattern";
        }
    }

    public class PolyLine extends GraphicsElement {
        public float[] points;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public String getNodeName() {
            return "polyline";
        }
    }

    public final class Polygon extends PolyLine {
        @Override // com.caverock.androidsvg.SVG.PolyLine, com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "polygon";
        }
    }

    public final class Rect extends GraphicsElement {
        public Length height;
        public Length rx;
        public Length ry;
        public Length width;
        public Length x;
        public Length y;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "rect";
        }
    }

    public final class SolidColor extends SvgElementBase implements SvgContainer {
        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void addChild(SvgObject svgObject) {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "solidColor";
        }
    }

    public final class Stop extends SvgElementBase implements SvgContainer {
        public Float offset;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void addChild(SvgObject svgObject) {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "stop";
        }
    }

    public final class Style implements Cloneable {
        public n clip;
        public String clipPath;
        public int clipRule;
        public Colour color;
        public int direction;
        public Boolean display;
        public SvgPaint fill;
        public Float fillOpacity;
        public int fillRule;
        public ArrayList fontFamily;
        public Length fontSize;
        public int fontStyle;
        public Integer fontWeight;
        public int imageRendering;
        public String markerEnd;
        public String markerMid;
        public String markerStart;
        public String mask;
        public Float opacity;
        public Boolean overflow;
        public SvgPaint solidColor;
        public Float solidOpacity;
        public long specifiedFlags = 0;
        public SvgPaint stopColor;
        public Float stopOpacity;
        public SvgPaint stroke;
        public Length[] strokeDashArray;
        public Length strokeDashOffset;
        public int strokeLineCap;
        public int strokeLineJoin;
        public Float strokeMiterLimit;
        public Float strokeOpacity;
        public Length strokeWidth;
        public int textAnchor;
        public int textDecoration;
        public int vectorEffect;
        public SvgPaint viewportFill;
        public Float viewportFillOpacity;
        public Boolean visibility;

        public static Style getDefaultStyle() {
            Style style = new Style();
            style.specifiedFlags = -1L;
            Colour colour = Colour.BLACK;
            style.fill = colour;
            style.fillRule = 1;
            Float valueOf = Float.valueOf(1.0f);
            style.fillOpacity = valueOf;
            style.stroke = null;
            style.strokeOpacity = valueOf;
            style.strokeWidth = new Length(1.0f);
            style.strokeLineCap = 1;
            style.strokeLineJoin = 1;
            style.strokeMiterLimit = Float.valueOf(4.0f);
            style.strokeDashArray = null;
            style.strokeDashOffset = new Length(RecyclerView.DECELERATION_RATE);
            style.opacity = valueOf;
            style.color = colour;
            style.fontFamily = null;
            style.fontSize = new Length(12.0f, 7);
            style.fontWeight = 400;
            style.fontStyle = 1;
            style.textDecoration = 1;
            style.direction = 1;
            style.textAnchor = 1;
            Boolean bool = Boolean.TRUE;
            style.overflow = bool;
            style.clip = null;
            style.markerStart = null;
            style.markerMid = null;
            style.markerEnd = null;
            style.display = bool;
            style.visibility = bool;
            style.stopColor = colour;
            style.stopOpacity = valueOf;
            style.clipPath = null;
            style.clipRule = 1;
            style.mask = null;
            style.solidColor = null;
            style.solidOpacity = valueOf;
            style.viewportFill = null;
            style.viewportFillOpacity = valueOf;
            style.vectorEffect = 1;
            style.imageRendering = 1;
            return style;
        }

        public final Object clone() {
            Style style = (Style) super.clone();
            Length[] lengthArr = this.strokeDashArray;
            if (lengthArr != null) {
                style.strokeDashArray = (Length[]) lengthArr.clone();
            }
            return style;
        }
    }

    public final class Svg extends SvgViewBoxContainer {
        public Length height;
        public Length width;
        public Length x;
        public Length y;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "svg";
        }
    }

    public interface SvgConditional {
        String getRequiredExtensions();

        Set getRequiredFeatures();

        Set getRequiredFonts();

        Set getRequiredFormats();

        Set getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(HashSet hashSet);

        void setRequiredFonts(HashSet hashSet);

        void setRequiredFormats(HashSet hashSet);

        void setSystemLanguage(HashSet hashSet);
    }

    public abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        public List children = new ArrayList();
        public HashSet requiredFeatures = null;
        public String requiredExtensions = null;
        public HashSet requiredFormats = null;
        public HashSet requiredFonts = null;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public void addChild(SvgObject svgObject) {
            this.children.add(svgObject);
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final List getChildren() {
            return this.children;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final Set getSystemLanguage() {
            return null;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFeatures(HashSet hashSet) {
            this.requiredFeatures = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFonts(HashSet hashSet) {
            this.requiredFonts = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setRequiredFormats(HashSet hashSet) {
            this.requiredFormats = hashSet;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void setSystemLanguage(HashSet hashSet) {
        }
    }

    public interface SvgContainer {
        void addChild(SvgObject svgObject);

        List getChildren();
    }

    public abstract class SvgElement extends SvgElementBase {
        public Box boundingBox = null;
    }

    public abstract class SvgElementBase extends SvgObject {
        public String id = null;
        public Boolean spacePreserve = null;
        public Style baseStyle = null;
        public Style style = null;
        public ArrayList classNames = null;

        public final String toString() {
            return getNodeName();
        }
    }

    public final class SvgLinearGradient extends GradientElement {
        public Length x1;
        public Length x2;
        public Length y1;
        public Length y2;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "linearGradient";
        }
    }

    public abstract class SvgObject {
        public SVG document;
        public SvgContainer parent;

        public abstract String getNodeName();
    }

    public abstract class SvgPaint implements Cloneable {
    }

    public abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        public PreserveAspectRatio preserveAspectRatio = null;
    }

    public final class SvgRadialGradient extends GradientElement {
        public Length cx;
        public Length cy;
        public Length fx;
        public Length fy;
        public Length r;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "radialGradient";
        }
    }

    public abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        public Box viewBox;
    }

    public final class Switch extends Group {
        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "switch";
        }
    }

    public final class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "symbol";
        }
    }

    public final class TRef extends TextContainer implements TextChild {
        public String href;
        public Text textRoot;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "tref";
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final Text getTextRoot() {
            return this.textRoot;
        }
    }

    public final class TSpan extends TextPositionedContainer implements TextChild {
        public Text textRoot;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "tspan";
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final Text getTextRoot() {
            return this.textRoot;
        }
    }

    public final class Text extends TextPositionedContainer implements HasTransform {
        public Matrix transform;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "text";
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    public interface TextChild {
        Text getTextRoot();
    }

    public abstract class TextContainer extends SvgConditionalContainer {
        @Override // com.caverock.androidsvg.SVG.SvgConditionalContainer, com.caverock.androidsvg.SVG.SvgContainer
        public final void addChild(SvgObject svgObject) {
            if (svgObject instanceof TextChild) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    public final class TextPath extends TextContainer implements TextChild {
        public String href;
        public Length startOffset;
        public Text textRoot;

        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "textPath";
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final Text getTextRoot() {
            return this.textRoot;
        }
    }

    public abstract class TextPositionedContainer extends TextContainer {
        public ArrayList dx;
        public ArrayList dy;
        public ArrayList x;
        public ArrayList y;
    }

    public final class TextSequence extends SvgObject implements TextChild {
        public String text;

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final Text getTextRoot() {
            return null;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("TextChild: '"), this.text, "'");
        }
    }

    public final class Use extends Group {
        public Length height;
        public String href;
        public Length width;
        public Length x;
        public Length y;

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "use";
        }
    }

    public final class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        @Override // com.caverock.androidsvg.SVG.SvgObject
        public final String getNodeName() {
            return "view";
        }
    }

    public SVG(Context context, String str) {
        this.$r8$classId = 22;
        this.cssRules = context;
        Fillr fillr = Fillr.getInstance();
        str = fillr != null ? fillr.getDeveloperKey() : str;
        this.rootElement = str;
        if (fillr != null) {
            this.idToElementMap = com.google.android.filament.Box.getInstance(str, (String) fillr.getIntentBuilder().mCenter);
        }
    }

    public static void findFirstEditTextRequestFocus(Context context, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EditText) {
                EditText editText = (EditText) viewGroup.getChildAt(i);
                if (editText != null) {
                    editText.requestFocus();
                    editText.postDelayed(new Client.AnonymousClass4(14, context, editText), 200L);
                    return;
                }
                return;
            }
            if (childAt instanceof ViewGroup) {
                findFirstEditTextRequestFocus(context, (ViewGroup) childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.id)) {
            return svgElementBase;
        }
        for (Object obj : svgContainer.getChildren()) {
            if (obj instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) obj;
                if (str.equals(svgElementBase2.id)) {
                    return svgElementBase2;
                }
                if ((obj instanceof SvgContainer) && (elementById = getElementById((SvgContainer) obj, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    private final void stopGrowingBuffers$com$bumptech$glide$load$resource$bitmap$ImageReader$ByteBufferReader() {
    }

    private final void stopGrowingBuffers$com$bumptech$glide$load$resource$bitmap$ImageReader$ParcelFileDescriptorImageReader() {
    }

    @Override // androidx.core.util.Pools$Pool
    public Object acquire() {
        Object acquire = ((Pools$SynchronizedPool) this.idToElementMap).acquire();
        if (acquire == null) {
            acquire = ((FactoryPools.Factory) this.rootElement).create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + acquire.getClass());
            }
        }
        if (acquire instanceof FactoryPools.Poolable) {
            ((FactoryPools.Poolable) acquire).getVerifier().isReleased = false;
        }
        return acquire;
    }

    public AutoValue_TransportContext build() {
        String str = ((String) this.rootElement) == null ? " backendName" : "";
        if (((Priority) this.idToElementMap) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new AutoValue_TransportContext((String) this.rootElement, (byte[]) this.cssRules, (Priority) this.idToElementMap);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(str));
        return null;
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void consume(ParsableByteArray parsableByteArray) {
        long firstSampleTimestampUs;
        long j;
        ((TimestampAdjuster) this.cssRules).getClass();
        String str = Util.DEVICE_DEBUG_INFO;
        TimestampAdjuster timestampAdjuster = (TimestampAdjuster) this.cssRules;
        synchronized (timestampAdjuster) {
            try {
                long j2 = timestampAdjuster.lastUnadjustedTimestampUs;
                firstSampleTimestampUs = j2 != -9223372036854775807L ? j2 + timestampAdjuster.timestampOffsetUs : timestampAdjuster.getFirstSampleTimestampUs();
            } finally {
            }
        }
        TimestampAdjuster timestampAdjuster2 = (TimestampAdjuster) this.cssRules;
        synchronized (timestampAdjuster2) {
            j = timestampAdjuster2.timestampOffsetUs;
        }
        if (firstSampleTimestampUs == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format2 = (Format) this.rootElement;
        if (j != format2.subsampleOffsetUs) {
            Format.Builder buildUpon = format2.buildUpon();
            buildUpon.subsampleOffsetUs = j;
            Format format3 = new Format(buildUpon);
            this.rootElement = format3;
            ((TrackOutput) this.idToElementMap).format(format3);
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        ((TrackOutput) this.idToElementMap).sampleData(bytesLeft, parsableByteArray);
        ((TrackOutput) this.idToElementMap).sampleMetadata(firstSampleTimestampUs, 1, bytesLeft, 0, null);
    }

    public AnalyticsEvent createEvent() {
        SharedPreferences sharedPreferences;
        AnalyticsEvent analyticsEvent = new AnalyticsEvent();
        Context context = (Context) this.cssRules;
        Boolean.toString((context == null || (sharedPreferences = context.getSharedPreferences("com.fillr.browsersdk", 0)) == null) ? true : sharedPreferences.getBoolean("isPinModelShown", false));
        return analyticsEvent;
    }

    public Bitmap decodeBitmap(BitmapFactory.Options options) {
        switch (this.$r8$classId) {
            case 12:
                return BitmapFactory.decodeStream(new ExifInterfaceInputStream(ByteBufferUtil.rewind((ByteBuffer) this.rootElement)), null, options);
            case 13:
                RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) ((InputStreamRewinder) this.rootElement).bufferedStream;
                recyclableBufferedInputStream.reset();
                return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((InputStreamRewinder) this.idToElementMap).rewindAndGet().getFileDescriptor(), null, options);
        }
    }

    public Sniffer fetchToggles() {
        HttpURLConnection httpURLConnection;
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URL) this.cssRules).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (IllegalStateException e2) {
            e = e2;
        }
        try {
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            PopEncryptorV2_.setRequestProperties(httpURLConnection, (PopEncryptorV2_) this.idToElementMap);
            httpURLConnection.setRequestProperty("If-None-Match", (String) this.rootElement);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300) {
                Sniffer toggleResponse = getToggleResponse(httpURLConnection);
                httpURLConnection.disconnect();
                return toggleResponse;
            }
            if (responseCode == 304) {
                Sniffer sniffer = new Sniffer(1, 16);
                httpURLConnection.disconnect();
                return sniffer;
            }
            Sniffer sniffer2 = new Sniffer(3, 16);
            httpURLConnection.disconnect();
            return sniffer2;
        } catch (IOException e3) {
            e = e3;
            throw new UnleashException("Could not fetch toggles", e);
        } catch (IllegalStateException e4) {
            e = e4;
            throw new UnleashException(e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public Box getDocumentDimensions() {
        int i;
        float f;
        int i2;
        Svg svg = (Svg) this.rootElement;
        Length length = svg.width;
        Length length2 = svg.height;
        if (length == null || length.isZero() || (i = length.unit) == 9 || i == 2 || i == 3) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float floatValue$1 = length.floatValue$1();
        if (length2 == null) {
            Box box = ((Svg) this.rootElement).viewBox;
            f = box != null ? (box.height * floatValue$1) / box.width : floatValue$1;
        } else {
            if (length2.isZero() || (i2 = length2.unit) == 9 || i2 == 2 || i2 == 3) {
                return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f = length2.floatValue$1();
        }
        return new Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, floatValue$1, f);
    }

    public ImageHeaderParser.ImageType getImageType() {
        switch (this.$r8$classId) {
            case 12:
                return ImageHeaderParserUtils.getType((List) this.cssRules, ByteBufferUtil.rewind((ByteBuffer) this.rootElement));
            case 13:
                List list = (List) this.idToElementMap;
                RecyclableBufferedInputStream recyclableBufferedInputStream = (RecyclableBufferedInputStream) ((InputStreamRewinder) this.rootElement).bufferedStream;
                recyclableBufferedInputStream.reset();
                return ImageHeaderParserUtils.getType(list, recyclableBufferedInputStream, (LruArrayPool) this.cssRules);
            default:
                List list2 = (List) this.cssRules;
                InputStreamRewinder inputStreamRewinder = (InputStreamRewinder) this.idToElementMap;
                LruArrayPool lruArrayPool = (LruArrayPool) this.rootElement;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    ImageHeaderParser imageHeaderParser = (ImageHeaderParser) list2.get(i);
                    RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                    try {
                        RecyclableBufferedInputStream recyclableBufferedInputStream3 = new RecyclableBufferedInputStream(new FileInputStream(inputStreamRewinder.rewindAndGet().getFileDescriptor()), lruArrayPool);
                        try {
                            ImageHeaderParser.ImageType type2 = imageHeaderParser.getType(recyclableBufferedInputStream3);
                            recyclableBufferedInputStream3.release();
                            inputStreamRewinder.rewindAndGet();
                            if (type2 != ImageHeaderParser.ImageType.UNKNOWN) {
                                return type2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            recyclableBufferedInputStream2 = recyclableBufferedInputStream3;
                            if (recyclableBufferedInputStream2 != null) {
                                recyclableBufferedInputStream2.release();
                            }
                            inputStreamRewinder.rewindAndGet();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public Sniffer getToggleResponse(HttpURLConnection httpURLConnection) {
        this.rootElement = httpURLConnection.getHeaderField("ETag");
        try {
            return new Sniffer(RecipientUtil.fromJson(new BufferedReader(new InputStreamReader((InputStream) httpURLConnection.getContent(), "UTF-8"))));
        } catch (Exception unused) {
            return null;
        }
    }

    public Object handle(ApiResult apiResult, String str, Screen screen) {
        String str2;
        ResponseContext responseContext;
        ScenarioPlan scenarioPlan;
        ScenarioPlan scenarioPlan2;
        Navigator navigator = (Navigator) this.idToElementMap;
        apiResult.getClass();
        str.getClass();
        screen.getClass();
        if (!(apiResult instanceof ApiResult.Success)) {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            ApiResult.Failure failure = (ApiResult.Failure) apiResult;
            if (failure instanceof ApiResult.Failure.HttpFailure) {
                str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure [", "]");
                Timber.Forest.e(str2, new Object[0]);
            } else {
                if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Throwable th = ((ApiResult.Failure.NetworkFailure) apiResult).error;
                String m = Recorder$$ExternalSyntheticOutline2.m("NetworkFailure: ", ExceptionsKt__ExceptionsKt.stackTraceToString(th));
                Timber.Forest.e("NetworkFailure", new Object[0], th);
                str2 = m;
            }
            navigator.goTo(new LocalExplanatoryDialog(CollectionsKt__CollectionsJVMKt.listOf(str2)));
            return null;
        }
        Object obj = ((ApiResult.Success) apiResult).response;
        if (obj instanceof BulkAddBrandsResponse) {
            ResponseContext responseContext2 = ((BulkAddBrandsResponse) obj).response_context;
            if (responseContext2 != null) {
                scenarioPlan = responseContext2.scenario_plan;
                scenarioPlan2 = scenarioPlan;
            }
            scenarioPlan2 = null;
        } else if (obj instanceof BulkRemoveBrandsResponse) {
            ResponseContext responseContext3 = ((BulkRemoveBrandsResponse) obj).response_context;
            if (responseContext3 != null) {
                scenarioPlan = responseContext3.scenario_plan;
                scenarioPlan2 = scenarioPlan;
            }
            scenarioPlan2 = null;
        } else if (obj instanceof GetAppShortlinkResponse) {
            ResponseContext responseContext4 = ((GetAppShortlinkResponse) obj).response_context;
            if (responseContext4 != null) {
                scenarioPlan = responseContext4.scenario_plan;
                scenarioPlan2 = scenarioPlan;
            }
            scenarioPlan2 = null;
        } else if (obj instanceof CreateAppOrderResponse) {
            ResponseContext responseContext5 = ((CreateAppOrderResponse) obj).response_context;
            if (responseContext5 != null) {
                scenarioPlan = responseContext5.scenario_plan;
                scenarioPlan2 = scenarioPlan;
            }
            scenarioPlan2 = null;
        } else {
            if ((obj instanceof BulkUpdateBrandsResponse) && (responseContext = ((BulkUpdateBrandsResponse) obj).response_context) != null) {
                scenarioPlan = responseContext.scenario_plan;
                scenarioPlan2 = scenarioPlan;
            }
            scenarioPlan2 = null;
        }
        if (scenarioPlan2 == null) {
            return obj;
        }
        navigator.goTo(((BlockersDataNavigator) this.cssRules).getNext(screen, FlowStarter.startFlow$default((FlowStarter) this.rootElement, BlockersData.Flow.CLIENT_SCENARIO, screen, scenarioPlan2, ClientScenario.PLASMA, str, null, null, null, null, 976)));
        return null;
    }

    @Override // androidx.media3.extractor.ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, zzcjk zzcjkVar) {
        this.cssRules = timestampAdjuster;
        zzcjkVar.generateNewId();
        zzcjkVar.maybeThrowUninitializedError();
        TrackOutput track = extractorOutput.track(zzcjkVar.zze, 5);
        this.idToElementMap = track;
        track.format((Format) this.rootElement);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Rpc rpc = (Rpc) this.rootElement;
        String str = (String) this.cssRules;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.idToElementMap;
        synchronized (rpc.zze) {
            rpc.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onFailure(Throwable th) {
        ((android.view.View) this.rootElement).setVisibility(8);
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onPaused() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onResumed() {
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStarted() {
        Context context = (Context) ((WeakReference) this.idToElementMap).get();
        if (context == null || WorkManagerImpl.getInstance() == null) {
            return;
        }
        String str = (String) this.rootElement;
        InternalLogger internalLogger = (InternalLogger) this.cssRules;
        str.getClass();
        internalLogger.getClass();
        try {
            WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
            String concat = "DatadogBackgroundUpload/".concat(str);
            SystemClock systemClock = instance$1.mConfiguration.tracer;
            String concat2 = "CancelWorkByTag_".concat(concat);
            TransactionExecutor transactionExecutor = ((WorkManagerTaskExecutor) instance$1.mWorkTaskExecutor).mBackgroundExecutor;
            transactionExecutor.getClass();
            BundleKt.launchOperation(systemClock, concat2, transactionExecutor, new StatusRunnable$$ExternalSyntheticLambda1(2, instance$1, concat));
        } catch (IllegalStateException e) {
            DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ByteArrayExtKt$copyTo$1.INSTANCE$3, e, 48);
        }
    }

    @Override // com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor.Callback
    public void onStopped() {
        Context context = (Context) ((WeakReference) this.idToElementMap).get();
        if (context == null || WorkManagerImpl.getInstance() == null) {
            return;
        }
        zzhq.triggerUploadWorker(context, (String) this.rootElement, (InternalLogger) this.cssRules);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public void onSuccess(Object obj) {
        android.view.View view = (android.view.View) obj;
        ViewGroup viewGroup = (ViewGroup) this.cssRules;
        android.view.View view2 = (android.view.View) this.rootElement;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$1("The media route button placeholder missing layout params.");
            return;
        }
        view.setId(R.id.exo_media_route_button_placeholder);
        view.setLayoutParams(layoutParams);
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeView(view2);
        viewGroup.addView(view, indexOfChild);
        view.setVisibility(0);
        ((PlayerControlView) this.idToElementMap).controlViewLayoutManager.setShowButton(view, true);
    }

    @Override // okhttp3.Interceptor.Chain
    public Response proceed(Request request) {
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) this.cssRules;
        request.getClass();
        try {
            Request.Builder newBuilder = request.newBuilder();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(4)) {
                newBuilder.headers.removeAll(RumErrorSource$EnumUnboxingLocalUtility.getHeaderValue(i));
            }
            return realInterceptorChain.proceed(new Request(newBuilder));
        } catch (IOException e) {
            DBUtil.log$default((InternalLogger) this.idToElementMap, 4, target, DatadogInterceptor$getBodyLength$1.INSTANCE$2, e, false, 48);
            return realInterceptorChain.proceed(request);
        } catch (IllegalStateException e2) {
            DBUtil.log$default((InternalLogger) this.idToElementMap, 4, target, DatadogInterceptor$getBodyLength$1.INSTANCE$1, e2, false, 48);
            return realInterceptorChain.proceed(request);
        }
    }

    @Override // androidx.core.util.Pools$Pool
    public boolean release(Object obj) {
        if (obj instanceof FactoryPools.Poolable) {
            ((FactoryPools.Poolable) obj).getVerifier().isReleased = true;
        }
        ((FactoryPools.Resetter) this.cssRules).reset(obj);
        return ((Pools$SynchronizedPool) this.idToElementMap).release(obj);
    }

    @Override // okhttp3.Interceptor.Chain
    public Request request() {
        return ((RealInterceptorChain) this.rootElement).request;
    }

    public SvgElementBase resolveIRI(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String replace = str.replace("\\\n", "").replace("\\A", "\n");
            if (replace.length() > 1 && replace.startsWith("#")) {
                String substring = replace.substring(1);
                HashMap hashMap = (HashMap) this.idToElementMap;
                if (substring.length() == 0) {
                    return null;
                }
                if (substring.equals(((Svg) this.rootElement).id)) {
                    return (Svg) this.rootElement;
                }
                if (hashMap.containsKey(substring)) {
                    return (SvgElementBase) hashMap.get(substring);
                }
                SvgElementBase elementById = getElementById((Svg) this.rootElement, substring);
                hashMap.put(substring, elementById);
                return elementById;
            }
        }
        return null;
    }

    public void schedule(AutoValue_TransportContext autoValue_TransportContext, int i, boolean z) {
        AutoValue_SchedulerConfig autoValue_SchedulerConfig = (AutoValue_SchedulerConfig) this.idToElementMap;
        Context context = (Context) this.rootElement;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = autoValue_TransportContext.backendName;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        Priority priority = autoValue_TransportContext.priority;
        adler32.update(allocate.putInt(PriorityMapping.toInt(priority)).array());
        byte[] bArr = autoValue_TransportContext.extras;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        Logging.d("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", autoValue_TransportContext);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((SQLiteEventStore) this.cssRules).getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(PriorityMapping.toInt(priority))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(autoValue_SchedulerConfig.getScheduleDelay(priority, longValue, i));
            Set set = ((AutoValue_SchedulerConfig_ConfigValue) autoValue_SchedulerConfig.values.get(priority)).flags;
            if (set.contains(SchedulerConfig$Flag.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(SchedulerConfig$Flag.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(SchedulerConfig$Flag.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", PriorityMapping.toInt(priority));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {autoValue_TransportContext, Integer.valueOf(value), Long.valueOf(autoValue_SchedulerConfig.getScheduleDelay(priority, longValue, i)), valueOf, Integer.valueOf(i)};
            String concat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public void sendEvent(ContentInfoCompat.CompatImpl compatImpl) {
        ContextScope contextScope;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = (ExecutorCoroutineDispatcherImpl) this.rootElement;
        if (executorCoroutineDispatcherImpl == null || (contextScope = (ContextScope) this.cssRules) == null) {
            return;
        }
        JobKt.launch$default(contextScope, executorCoroutineDispatcherImpl, null, new EventBridge$sendEvent$1(compatImpl, this, null, 0), 2);
    }

    public void setBackendName(String str) {
        if (str != null) {
            this.rootElement = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null backendName");
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 3:
                String str = (String) this.idToElementMap;
                String str2 = (String) this.cssRules;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.rootElement;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, Options options) {
        Drawable drawable = (Drawable) resource.get();
        if (drawable instanceof BitmapDrawable) {
            return ((Sniffer) this.cssRules).transcode(BitmapResource.obtain(((BitmapDrawable) drawable).getBitmap(), (BitmapPool) this.rootElement), options);
        }
        if (drawable instanceof GifDrawable) {
            return ((UnitTranscoder) this.idToElementMap).transcode(resource, options);
        }
        return null;
    }

    public void travelThroughElementHierarchy(Element element, ArrayList arrayList) {
        int i;
        Schema_ schema_ = (Schema_) this.rootElement;
        String str = element.actingElement().pathKey;
        if (str != null) {
            str.startsWith("Passwords");
        }
        String str2 = element.actingElement().pathKey;
        int i2 = 0;
        boolean z = str2 != null && str2.startsWith("ContactDetails.CellPhones");
        if (z) {
            i = 0;
            i2 = element.getChildrenCount() - 1;
        } else {
            i = 0;
        }
        while (i2 < element.getChildrenCount() && i2 >= 0) {
            Element childElementAt = element.getChildElementAt(i2);
            i2 = z ? i2 - 1 : i2 + 1;
            ElementType elementType = schema_.getElementType(childElementAt);
            if (CameraSelector$$ExternalSyntheticOutline0.equals(elementType.f1544type, 3) || CameraSelector$$ExternalSyntheticOutline0.equals(elementType.f1544type, 4) || CameraSelector$$ExternalSyntheticOutline0.equals(elementType.f1544type, 7) || !childElementAt.hasChildElements()) {
                String str3 = childElementAt.actingElement().pathKey;
                if (childElementAt.actingElement().isFieldArray && element.actingElement().isArrayType) {
                    String substring = childElementAt.actingElement().pathKey.substring(element.actingElement().pathKey.length());
                    StringBuilder sb = new StringBuilder();
                    Boxes$$ExternalSyntheticOutline1.m(sb, element.actingElement().pathKey, "[", i, "]");
                    sb.append(substring);
                    str3 = sb.toString();
                }
                String data = ((ProfileStore_) this.idToElementMap).getData(str3);
                if (data != null && data.length() > 0) {
                    if (element.isNonRecursiveType()) {
                        data = CalendarConverter.getLocaleFormattedDate(data, schema_.getElementType(childElementAt));
                    }
                    if (childElementAt.actingElement().mMaskingValue != -99) {
                        data = HelperFunctions.maskValuesIfNecessary(childElementAt.actingElement().mMaskingValue, data);
                    }
                    arrayList.add(data);
                }
            } else {
                travelThroughElementHierarchy(childElementAt, arrayList);
            }
            if (arrayList.size() >= 6) {
                return;
            } else {
                i++;
            }
        }
    }

    public final class Length implements Cloneable {
        public final int unit;
        public final float value;

        public Length(float f) {
            this.value = f;
            this.unit = 1;
        }

        public final float floatValue(e0 e0Var) {
            if (this.unit != 9) {
                return floatValueX(e0Var);
            }
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
            Box box = sVGAndroidRenderer$RendererState.viewBox;
            if (box == null) {
                box = sVGAndroidRenderer$RendererState.viewPort;
            }
            float f = this.value;
            if (box == null) {
                return f;
            }
            float f2 = box.width;
            if (f2 != box.height) {
                f2 = (float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d);
            }
            return (f * f2) / 100.0f;
        }

        public final float floatValue$1() {
            float f;
            float f2;
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.unit);
            float f3 = this.value;
            if (ordinal == 0) {
                return f3;
            }
            if (ordinal == 3) {
                return f3 * 96.0f;
            }
            if (ordinal == 4) {
                f = f3 * 96.0f;
                f2 = 2.54f;
            } else if (ordinal == 5) {
                f = f3 * 96.0f;
                f2 = 25.4f;
            } else if (ordinal == 6) {
                f = f3 * 96.0f;
                f2 = 72.0f;
            } else {
                if (ordinal != 7) {
                    return f3;
                }
                f = f3 * 96.0f;
                f2 = 6.0f;
            }
            return f / f2;
        }

        public final float floatValueX(e0 e0Var) {
            float textSize;
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.unit);
            float f = this.value;
            switch (ordinal) {
                case 1:
                    textSize = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.getTextSize();
                    break;
                case 2:
                    textSize = ((SVGAndroidRenderer$RendererState) e0Var.c).fillPaint.getTextSize() / 2.0f;
                    break;
                case 3:
                    e0Var.getClass();
                    return f * 96.0f;
                case 4:
                    e0Var.getClass();
                    return (f * 96.0f) / 2.54f;
                case 5:
                    e0Var.getClass();
                    return (f * 96.0f) / 25.4f;
                case 6:
                    e0Var.getClass();
                    return (f * 96.0f) / 72.0f;
                case 7:
                    e0Var.getClass();
                    return (f * 96.0f) / 6.0f;
                case 8:
                    SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
                    Box box = sVGAndroidRenderer$RendererState.viewBox;
                    if (box == null) {
                        box = sVGAndroidRenderer$RendererState.viewPort;
                    }
                    if (box != null) {
                        return (f * box.width) / 100.0f;
                    }
                default:
                    return f;
            }
            return textSize * f;
        }

        public final float floatValueY(e0 e0Var) {
            if (this.unit != 9) {
                return floatValueX(e0Var);
            }
            SVGAndroidRenderer$RendererState sVGAndroidRenderer$RendererState = (SVGAndroidRenderer$RendererState) e0Var.c;
            Box box = sVGAndroidRenderer$RendererState.viewBox;
            if (box == null) {
                box = sVGAndroidRenderer$RendererState.viewPort;
            }
            float f = this.value;
            return box == null ? f : (f * box.height) / 100.0f;
        }

        public final boolean isNegative() {
            return this.value < RecyclerView.DECELERATION_RATE;
        }

        public final boolean isZero() {
            return this.value == RecyclerView.DECELERATION_RATE;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.value));
            switch (this.unit) {
                case 1:
                    str = "px";
                    break;
                case 2:
                    str = "em";
                    break;
                case 3:
                    str = "ex";
                    break;
                case 4:
                    str = "in";
                    break;
                case 5:
                    str = "cm";
                    break;
                case 6:
                    str = "mm";
                    break;
                case 7:
                    str = "pt";
                    break;
                case 8:
                    str = "pc";
                    break;
                case 9:
                    str = "percent";
                    break;
                default:
                    str = "null";
                    break;
            }
            sb.append(str);
            return sb.toString();
        }

        public Length(float f, int i) {
            this.value = f;
            this.unit = i;
        }

        public final float floatValue(e0 e0Var, float f) {
            if (this.unit == 9) {
                return (this.value * f) / 100.0f;
            }
            return floatValueX(e0Var);
        }
    }

    public final class Box {
        public float height;
        public float minX;
        public float minY;
        public float width;

        public Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }

        public final float maxX() {
            return this.minX + this.width;
        }

        public final float maxY() {
            return this.minY + this.height;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.minX);
            sb.append(" ");
            sb.append(this.minY);
            sb.append(" ");
            sb.append(this.width);
            sb.append(" ");
            return Recorder$$ExternalSyntheticOutline1.m(this.height, "]", sb);
        }

        public Box(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }
    }

    public /* synthetic */ SVG(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.idToElementMap = obj;
        this.rootElement = obj2;
        this.cssRules = obj3;
    }

    public /* synthetic */ SVG(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$r8$classId = i;
        this.rootElement = obj;
        this.cssRules = obj2;
        this.idToElementMap = obj3;
    }

    public SVG(FileMover fileMover, InternalLogger internalLogger, Strings strings) {
        this.$r8$classId = 18;
        internalLogger.getClass();
        strings.getClass();
        this.rootElement = fileMover;
        this.cssRules = internalLogger;
        this.idToElementMap = strings;
    }

    public SVG(Context context, String str, InternalLogger internalLogger) {
        this.$r8$classId = 17;
        context.getClass();
        str.getClass();
        internalLogger.getClass();
        this.rootElement = str;
        this.cssRules = internalLogger;
        this.idToElementMap = new WeakReference(context);
    }

    public SVG(PopEncryptorV2_ popEncryptorV2_) {
        this.$r8$classId = 23;
        this.rootElement = "";
        this.idToElementMap = popEncryptorV2_;
        this.cssRules = (URL) ((com.google.android.filament.Box) popEncryptorV2_.encryptionKey).mCenter;
    }

    public SVG(FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, Navigator navigator) {
        this.$r8$classId = 5;
        navigator.getClass();
        this.rootElement = flowStarter;
        this.cssRules = blockersDataNavigator;
        this.idToElementMap = navigator;
    }

    public SVG(EventListener eventListener) {
        this.$r8$classId = 7;
        eventListener.getClass();
        this.rootElement = eventListener;
        this.cssRules = new RealEventPublisher$ZiplineEventListener(this);
        this.idToElementMap = new n.b(this, 2);
    }

    public /* synthetic */ SVG(int i) {
        this.$r8$classId = i;
    }

    public SVG(String str) {
        this.$r8$classId = 1;
        Format.Builder builder = new Format.Builder();
        builder.containerMimeType = MimeTypes.normalizeMimeType("video/mp2t");
        builder.sampleMimeType = MimeTypes.normalizeMimeType(str);
        this.rootElement = new Format(builder);
    }

    public SVG(MarkEnforcingInputStream markEnforcingInputStream, ArrayList arrayList, LruArrayPool lruArrayPool) {
        this.$r8$classId = 13;
        com.bumptech.glide.util.Util.checkNotNull(lruArrayPool, "Argument must not be null");
        this.cssRules = lruArrayPool;
        com.bumptech.glide.util.Util.checkNotNull(arrayList, "Argument must not be null");
        this.idToElementMap = arrayList;
        this.rootElement = new InputStreamRewinder(markEnforcingInputStream, lruArrayPool);
    }

    public SVG(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, LruArrayPool lruArrayPool) {
        this.$r8$classId = 14;
        com.bumptech.glide.util.Util.checkNotNull(lruArrayPool, "Argument must not be null");
        this.rootElement = lruArrayPool;
        com.bumptech.glide.util.Util.checkNotNull(arrayList, "Argument must not be null");
        this.cssRules = arrayList;
        this.idToElementMap = new InputStreamRewinder(parcelFileDescriptor);
    }

    public SVG(RealInterceptorChain realInterceptorChain, InternalLogger internalLogger, DatadogInterceptor datadogInterceptor) {
        this.$r8$classId = 19;
        this.cssRules = realInterceptorChain;
        this.idToElementMap = internalLogger;
        this.rootElement = realInterceptorChain;
    }

    public SVG(ResultOrCallback resultOrCallback, String str, ArrayList arrayList) {
        this.$r8$classId = 8;
        resultOrCallback.getClass();
        arrayList.getClass();
        this.rootElement = resultOrCallback;
        this.cssRules = str;
        this.idToElementMap = CollectionsKt.toList(arrayList);
    }

    public SVG(Engine engine, SingleRequest singleRequest, EngineJob engineJob) {
        this.$r8$classId = 11;
        this.idToElementMap = engine;
        this.cssRules = singleRequest;
        this.rootElement = engineJob;
    }
}
