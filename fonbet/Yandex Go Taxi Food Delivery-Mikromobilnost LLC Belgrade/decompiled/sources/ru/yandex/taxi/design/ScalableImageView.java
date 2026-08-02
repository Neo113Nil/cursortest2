package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.a170;
import defpackage.g4i0;
import defpackage.h170;
import defpackage.jkm0;
import defpackage.jx81;
import defpackage.kkm0;
import defpackage.mf61;
import defpackage.oyr;
import defpackage.w511;
import defpackage.z070;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0017\u0018\u0000 õ\u00012\u00020\u0001:\u0010ö\u0001÷\u0001ø\u0001ù\u0001À\u0001ú\u0001û\u0001ü\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u000206H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\f¢\u0006\u0004\bH\u00105J\r\u0010I\u001a\u00020\f¢\u0006\u0004\bI\u00105J\u0015\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020D¢\u0006\u0004\bK\u0010GJ%\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D¢\u0006\u0004\bK\u0010NJ/\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\b\u0010O\u001a\u0004\u0018\u00010.¢\u0006\u0004\bK\u0010PJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0000¢\u0006\u0004\bK\u0010RJ\u001d\u0010S\u001a\u00020\f2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D¢\u0006\u0004\bS\u0010TJ\u001f\u0010W\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u0006H\u0014¢\u0006\u0004\bW\u0010XJ/\u0010]\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u0006H\u0014¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020\u0006H\u0016¢\u0006\u0004\bb\u0010aJ'\u0010g\u001a\u00020f2\u0006\u0010c\u001a\u00020D2\u0006\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020\nH\u0004¢\u0006\u0004\bg\u0010hJ\u001f\u0010k\u001a\u00020f2\u0006\u0010i\u001a\u00020D2\u0006\u0010j\u001a\u00020DH\u0004¢\u0006\u0004\bk\u0010lJ%\u0010m\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D¢\u0006\u0004\bm\u0010NJ-\u0010m\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\u0006\u0010n\u001a\u00020\u0006¢\u0006\u0004\bm\u0010oJ7\u0010m\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\u0006\u0010n\u001a\u00020\u00062\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bm\u0010rJ/\u0010m\u001a\u00020\f2\u0006\u0010J\u001a\u00020D2\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bm\u0010sJ\u0019\u0010t\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bt\u0010uJ\u0019\u0010v\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010x\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\bx\u0010wJ\u000f\u0010y\u001a\u00020\fH\u0002¢\u0006\u0004\by\u00105J\u000f\u0010z\u001a\u00020\fH\u0002¢\u0006\u0004\bz\u00105J0\u0010\u007f\u001a\u00020D2\u0006\u0010{\u001a\u00020D2\u0006\u0010|\u001a\u00020D2\u0006\u0010}\u001a\u00020D2\u0006\u0010~\u001a\u00020DH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0082\u0001\u001a\u00020D2\u0007\u0010\u0081\u0001\u001a\u00020D2\u0006\u0010|\u001a\u00020D2\u0006\u0010}\u001a\u00020DH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0084\u0001\u00105J-\u0010\u0088\u0001\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0007\u0010\u0086\u0001\u001a\u00020\u00062\u0007\u0010\u0087\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001JR\u0010\u0090\u0001\u001a\u00020D2\u0006\u0010{\u001a\u00020D2\u0007\u0010\u008a\u0001\u001a\u00020D2\u0007\u0010\u008b\u0001\u001a\u00020D2\u0007\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010|\u001a\u00020\u00062\u0007\u0010\u008d\u0001\u001a\u00020\u00062\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\f2\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J5\u0010\u0099\u0001\u001a\u00020\f2\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0006\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020D2\u0007\u0010\u0098\u0001\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\f2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010 \u0001\u001a\u00020D2\u0007\u0010\u009f\u0001\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010§\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¦\u0001R(\u0010¨\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\b¨\u0001\u0010ª\u0001\"\u0005\b«\u0001\u0010\u000eR(\u0010¬\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010©\u0001\u001a\u0006\b¬\u0001\u0010ª\u0001\"\u0005\b\u00ad\u0001\u0010\u000eR\u0019\u0010®\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010©\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010±\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010©\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010¡\u0001R\u0019\u0010´\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010¡\u0001R\u0019\u0010µ\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010©\u0001R\u0019\u0010¶\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010¡\u0001R\u0019\u0010·\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¡\u0001R\u0019\u0010¸\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¡\u0001R\u0019\u0010¹\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010¡\u0001R\u001a\u0010»\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R(\u0010½\u0001\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b½\u0001\u0010¡\u0001\u001a\u0006\b¾\u0001\u0010£\u0001\"\u0005\b¿\u0001\u0010GR \u0010Á\u0001\u001a\t\u0018\u00010À\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001b\u0010Å\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ç\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010©\u0001R\u0019\u0010È\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010©\u0001R\u001c\u0010Ê\u0001\u001a\u0005\u0018\u00010É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Ä\u0001R\u0019\u0010Í\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ä\u0001R\u0019\u0010Î\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ä\u0001R\u0019\u0010Ï\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ä\u0001R\u0019\u0010Ð\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010¡\u0001R\u0019\u0010Ñ\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010¡\u0001R\u0019\u0010Ò\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¡\u0001R\u0019\u0010Ó\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010¡\u0001R\u001a\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001a\u0010Ø\u0001\u001a\u00030×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010Ú\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001b\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u001b\u0010à\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0014\u0010â\u0001\u001a\u00020\n8F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ª\u0001R\u0015\u0010æ\u0001\u001a\u00030ã\u00018F¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001R(\u0010é\u0001\u001a\u00020D2\u0006\u0010E\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bç\u0001\u0010£\u0001\"\u0005\bè\u0001\u0010GR)\u0010í\u0001\u001a\u00020D2\u0007\u0010ê\u0001\u001a\u00020D8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\bë\u0001\u0010£\u0001\"\u0005\bì\u0001\u0010GR\u0014\u0010ð\u0001\u001a\u00020f8F¢\u0006\b\u001a\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ò\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010£\u0001R\u0017\u0010ô\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010£\u0001¨\u0006ý\u0001"}, d2 = {"Lru/yandex/taxi/design/ScalableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "rotateImageToFitScreen", "Lzy11;", "setRotateImageToFitScreen", "(Z)V", "Landroid/view/View$OnTouchListener;", "onTouchListener", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "La170;", "onTouchImageViewListener", "setOnTouchImageViewListener", "(La170;)V", "Landroid/view/GestureDetector$OnDoubleTapListener;", "onDoubleTapListener", "setOnDoubleTapListener", "(Landroid/view/GestureDetector$OnDoubleTapListener;)V", "Lz070;", "onTouchCoordinatesListener", "setOnTouchCoordinatesListener", "(Lz070;)V", "resId", "setImageResource", "(I)V", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "setImageURI", "(Landroid/net/Uri;)V", "Landroid/widget/ImageView$ScaleType;", "type", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "savePreviousImageValues", "()V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", ClidProvider.STATE, "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", CspBioProgressConstants.MAX, "setMaxZoomRatio", "(F)V", "resetZoom", "resetZoomAnimated", "scale", "setZoom", "focusX", "focusY", "(FFF)V", "scaleType", "(FFFLandroid/widget/ImageView$ScaleType;)V", "imageSource", "(Lru/yandex/taxi/design/ScalableImageView;)V", "setScrollPosition", "(FF)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "direction", "canScrollHorizontally", "(I)Z", "canScrollVertically", RemoteBioParameters.X, RemoteBioParameters.Y, "clipToBitmap", "Landroid/graphics/PointF;", "transformCoordTouchToBitmap", "(FFZ)Landroid/graphics/PointF;", "bx", "by", "transformCoordBitmapToTouch", "(FF)Landroid/graphics/PointF;", "setZoomAnimated", "zoomTimeMs", "(FFFI)V", "Lh170;", "listener", "(FFFILh170;)V", "(FFFLh170;)V", "orientationMismatch", "(Landroid/graphics/drawable/Drawable;)Z", "getDrawableWidth", "(Landroid/graphics/drawable/Drawable;)I", "getDrawableHeight", "fixTrans", "fixScaleTrans", "trans", "viewSize", "contentSize", "offset", "getFixTrans", "(FFFF)F", "delta", "getFixDragTrans", "(FFF)F", "fitImageToView", "mode", "size", "drawableWidth", "setViewSize", "(III)I", "prevImageSize", "imageSize", "prevViewSize", "drawableSize", "Lru/yandex/taxi/design/FixedPixel;", "sizeChangeFixedPixel", "newTranslationAfterChange", "(FFFIIILru/yandex/taxi/design/FixedPixel;)F", "Lru/yandex/taxi/design/ImageActionState;", "imageActionState", "setState", "(Lru/yandex/taxi/design/ImageActionState;)V", "", "deltaScale", "stretchImageToSuper", "scaleImage", "(DFFZ)V", "Ljava/lang/Runnable;", "runnable", "compatPostOnAnimation", "(Ljava/lang/Runnable;)V", "value", "currentZoom", "F", "getCurrentZoom", "()F", "Landroid/graphics/Matrix;", "touchMatrix", "Landroid/graphics/Matrix;", "prevMatrix", "isZoomEnabled", "Z", "()Z", "setZoomEnabled", "isSuperZoomEnabled", "setSuperZoomEnabled", "isRotateImageToFitScreen", "viewSizeChangeFixedPixel", "Lru/yandex/taxi/design/FixedPixel;", "orientationJustChanged", "Lru/yandex/taxi/design/ImageActionState;", "userSpecifiedMinScale", "minScale", "maxScaleIsSetByMultiplier", "maxScaleMultiplier", "maxScale", "superMinScale", "superMaxScale", "", "floatMatrix", "[F", "doubleTapScale", "getDoubleTapScale", "setDoubleTapScale", "Lru/yandex/taxi/design/r;", "fling", "Lru/yandex/taxi/design/r;", "orientation", CA20Status.STATUS_USER_I, "touchScaleType", "Landroid/widget/ImageView$ScaleType;", "imageRenderedAtLeastOnce", "onDrawReady", "Lmf61;", "delayedZoomVariables", "Lmf61;", "viewWidth", "viewHeight", "prevViewWidth", "prevViewHeight", "matchViewWidth", "matchViewHeight", "prevMatchViewWidth", "prevMatchViewHeight", "Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "touchCoordinatesListener", "Lz070;", "doubleTapListener", "Landroid/view/GestureDetector$OnDoubleTapListener;", "userTouchListener", "Landroid/view/View$OnTouchListener;", "touchImageViewListener", "La170;", "isZoomed", "Landroid/graphics/RectF;", "getZoomedRect", "()Landroid/graphics/RectF;", "zoomedRect", "getMaxZoom", "setMaxZoom", "maxZoom", "min", "getMinZoom", "setMinZoom", "minZoom", "getScrollPosition", "()Landroid/graphics/PointF;", "scrollPosition", "getImageWidth", "imageWidth", "getImageHeight", "imageHeight", "Companion", "GestureListener", "PrivateOnTouchListener", "ScaleListener", "ru/yandex/taxi/design/q", "ndl0", "ru/yandex/taxi/design/p", "jkm0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ScalableImageView extends AppCompatImageView {
    public static final int $stable = 8;
    public static final float AUTOMATIC_MIN_ZOOM = -1.0f;
    public static final jkm0 Companion = new jkm0();
    private static final int DEFAULT_ZOOM_TIME = 500;
    private static final String STATE = "instanceState";
    private static final float SUPER_MAX_MULTIPLIER = 1.25f;
    private static final float SUPER_MIN_MULTIPLIER = 0.75f;
    private float currentZoom;
    private mf61 delayedZoomVariables;
    private GestureDetector.OnDoubleTapListener doubleTapListener;
    private float doubleTapScale;
    private r fling;
    private float[] floatMatrix;
    private GestureDetector gestureDetector;
    private ImageActionState imageActionState;
    private boolean imageRenderedAtLeastOnce;
    private boolean isRotateImageToFitScreen;
    private boolean isSuperZoomEnabled;
    private boolean isZoomEnabled;
    private float matchViewHeight;
    private float matchViewWidth;
    private float maxScale;
    private boolean maxScaleIsSetByMultiplier;
    private float maxScaleMultiplier;
    private float minScale;
    private boolean onDrawReady;
    private int orientation;
    private boolean orientationJustChanged;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    private ScaleGestureDetector scaleDetector;
    private float superMaxScale;
    private float superMinScale;
    private z070 touchCoordinatesListener;
    private a170 touchImageViewListener;
    private Matrix touchMatrix;
    private ImageView.ScaleType touchScaleType;
    private float userSpecifiedMinScale;
    private View.OnTouchListener userTouchListener;
    private int viewHeight;
    private FixedPixel viewSizeChangeFixedPixel;
    private int viewWidth;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/design/ScalableImageView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/yandex/taxi/design/ScalableImageView;)V", "Landroid/view/MotionEvent;", "e", "", "onSingleTapConfirmed", "(Landroid/view/MotionEvent;)Z", "Lzy11;", "onLongPress", "(Landroid/view/MotionEvent;)V", "e1", "e2", "", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onDoubleTap", "onDoubleTapEvent", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e) {
            if (ScalableImageView.this.getIsZoomEnabled()) {
                GestureDetector.OnDoubleTapListener onDoubleTapListener = ScalableImageView.this.doubleTapListener;
                r1 = onDoubleTapListener != null ? onDoubleTapListener.onDoubleTap(e) : false;
                if (ScalableImageView.this.imageActionState == ImageActionState.NONE) {
                    float doubleTapScale = ScalableImageView.this.getDoubleTapScale();
                    ScalableImageView scalableImageView = ScalableImageView.this;
                    float doubleTapScale2 = doubleTapScale == 0.0f ? scalableImageView.maxScale : scalableImageView.getDoubleTapScale();
                    if (ScalableImageView.this.getCurrentZoom() != ScalableImageView.this.minScale) {
                        doubleTapScale2 = ScalableImageView.this.minScale;
                    }
                    ScalableImageView.this.compatPostOnAnimation(new q(ScalableImageView.this, doubleTapScale2, e.getX(), e.getY(), false));
                    return true;
                }
            }
            return r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent e) {
            GestureDetector.OnDoubleTapListener onDoubleTapListener = ScalableImageView.this.doubleTapListener;
            if (onDoubleTapListener != null) {
                return onDoubleTapListener.onDoubleTapEvent(e);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            r rVar = ScalableImageView.this.fling;
            if (rVar != null) {
                rVar.w.setState(ImageActionState.NONE);
                ((OverScroller) rVar.a.b).forceFinished(true);
            }
            ScalableImageView scalableImageView = ScalableImageView.this;
            r rVar2 = new r(scalableImageView, (int) velocityX, (int) velocityY);
            ScalableImageView.this.compatPostOnAnimation(rVar2);
            scalableImageView.fling = rVar2;
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e) {
            ScalableImageView.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent e) {
            GestureDetector.OnDoubleTapListener onDoubleTapListener = ScalableImageView.this.doubleTapListener;
            return onDoubleTapListener != null ? onDoubleTapListener.onSingleTapConfirmed(e) : ScalableImageView.this.performClick();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/taxi/design/ScalableImageView$PrivateOnTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "(Lru/yandex/taxi/design/ScalableImageView;)V", "last", "Landroid/graphics/PointF;", "onTouch", "", "v", "Landroid/view/View;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class PrivateOnTouchListener implements View.OnTouchListener {
        private final PointF last = new PointF();

        public PrivateOnTouchListener() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        
            if (r1 != 6) goto L31;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View v, MotionEvent event) {
            Drawable drawable = ScalableImageView.this.getDrawable();
            ScalableImageView scalableImageView = ScalableImageView.this;
            if (drawable == null) {
                scalableImageView.setState(ImageActionState.NONE);
                return false;
            }
            if (scalableImageView.getIsZoomEnabled()) {
                ScalableImageView.this.scaleDetector.onTouchEvent(event);
            }
            ScalableImageView.this.gestureDetector.onTouchEvent(event);
            PointF pointF = new PointF(event.getX(), event.getY());
            ImageActionState imageActionState = ScalableImageView.this.imageActionState;
            ImageActionState imageActionState2 = ImageActionState.NONE;
            if (imageActionState == imageActionState2 || ScalableImageView.this.imageActionState == ImageActionState.DRAG || ScalableImageView.this.imageActionState == ImageActionState.FLING) {
                int action = event.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            if (ScalableImageView.this.imageActionState == ImageActionState.DRAG) {
                                float f = pointF.x;
                                PointF pointF2 = this.last;
                                float f2 = f - pointF2.x;
                                float f3 = pointF.y - pointF2.y;
                                ScalableImageView.this.touchMatrix.postTranslate(ScalableImageView.this.getFixDragTrans(f2, r2.viewWidth, ScalableImageView.this.getImageWidth()), ScalableImageView.this.getFixDragTrans(f3, r2.viewHeight, ScalableImageView.this.getImageHeight()));
                                ScalableImageView.this.fixTrans();
                                this.last.set(pointF.x, pointF.y);
                            }
                        }
                    }
                    ScalableImageView.this.setState(imageActionState2);
                } else {
                    this.last.set(pointF);
                    r rVar = ScalableImageView.this.fling;
                    if (rVar != null) {
                        rVar.w.setState(imageActionState2);
                        ((OverScroller) rVar.a.b).forceFinished(true);
                    }
                    ScalableImageView.this.setState(ImageActionState.DRAG);
                }
            }
            ScalableImageView.access$getTouchCoordinatesListener$p(ScalableImageView.this);
            ScalableImageView scalableImageView2 = ScalableImageView.this;
            scalableImageView2.setImageMatrix(scalableImageView2.touchMatrix);
            View.OnTouchListener onTouchListener = ScalableImageView.this.userTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(v, event);
            }
            ScalableImageView.access$getTouchImageViewListener$p(ScalableImageView.this);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/design/ScalableImageView$ScaleListener;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "<init>", "(Lru/yandex/taxi/design/ScalableImageView;)V", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "onScale", "Lzy11;", "onScaleEnd", "(Landroid/view/ScaleGestureDetector;)V", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            ScalableImageView.this.scaleImage(detector.getScaleFactor(), detector.getFocusX(), detector.getFocusY(), ScalableImageView.this.getIsSuperZoomEnabled());
            ScalableImageView.access$getTouchImageViewListener$p(ScalableImageView.this);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            ScalableImageView.this.setState(ImageActionState.ZOOM);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            super.onScaleEnd(detector);
            ScalableImageView.this.setState(ImageActionState.NONE);
            float currentZoom = ScalableImageView.this.getCurrentZoom();
            float currentZoom2 = ScalableImageView.this.getCurrentZoom();
            float f = ScalableImageView.this.maxScale;
            ScalableImageView scalableImageView = ScalableImageView.this;
            boolean z = true;
            if (currentZoom2 > f) {
                currentZoom = scalableImageView.maxScale;
            } else if (scalableImageView.getCurrentZoom() < ScalableImageView.this.minScale) {
                currentZoom = ScalableImageView.this.minScale;
            } else {
                z = false;
            }
            float f2 = currentZoom;
            if (z) {
                ScalableImageView.this.compatPostOnAnimation(new q(ScalableImageView.this, f2, r4.viewWidth / 2, ScalableImageView.this.viewHeight / 2, ScalableImageView.this.getIsSuperZoomEnabled()));
            }
        }
    }

    public ScalableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isSuperZoomEnabled = true;
        this.viewSizeChangeFixedPixel = FixedPixel.CENTER;
        super.setClickable(true);
        this.orientation = getResources().getConfiguration().orientation;
        this.scaleDetector = new ScaleGestureDetector(context, new ScaleListener());
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.touchMatrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.floatMatrix = new float[9];
        this.currentZoom = 1.0f;
        if (this.touchScaleType == null) {
            this.touchScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = 1.0f * 0.75f;
        this.superMaxScale = 3.0f * SUPER_MAX_MULTIPLIER;
        setImageMatrix(this.touchMatrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(ImageActionState.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g4i0.ScalableImageView, i, 0);
        try {
            if (!isInEditMode()) {
                this.isZoomEnabled = obtainStyledAttributes.getBoolean(g4i0.ScalableImageView_zoom_enabled, true);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static final /* synthetic */ z070 access$getTouchCoordinatesListener$p(ScalableImageView scalableImageView) {
        scalableImageView.getClass();
        return null;
    }

    public static final /* synthetic */ a170 access$getTouchImageViewListener$p(ScalableImageView scalableImageView) {
        scalableImageView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compatPostOnAnimation(Runnable runnable) {
        postOnAnimation(runnable);
    }

    private final void fitImageToView() {
        FixedPixel fixedPixel = this.viewSizeChangeFixedPixel;
        this.orientationJustChanged = false;
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || this.touchMatrix == null || this.prevMatrix == null) {
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f = this.currentZoom;
            float f2 = this.minScale;
            if (f < f2) {
                this.currentZoom = f2;
            }
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        float f3 = drawableWidth;
        float f4 = this.viewWidth / f3;
        float f5 = drawableHeight;
        float f6 = this.viewHeight / f5;
        ImageView.ScaleType scaleType = this.touchScaleType;
        switch (scaleType == null ? -1 : kkm0.a[scaleType.ordinal()]) {
            case 1:
                f4 = 1.0f;
                break;
            case 2:
                f4 = Math.max(f4, f6);
                break;
            case 3:
                float min = Math.min(1.0f, Math.min(f4, f6));
                f4 = Math.min(min, min);
                break;
            case 4:
            case 5:
            case 6:
                f4 = Math.min(f4, f6);
                break;
        }
        f6 = f4;
        int i = this.viewWidth;
        float f7 = i - (f4 * f3);
        int i2 = this.viewHeight;
        float f8 = i2 - (f6 * f5);
        this.matchViewWidth = i - f7;
        this.matchViewHeight = i2 - f8;
        if (isZoomed() || this.imageRenderedAtLeastOnce) {
            if (this.prevMatchViewWidth == 0.0f || this.prevMatchViewHeight == 0.0f) {
                savePreviousImageValues();
            }
            this.prevMatrix.getValues(this.floatMatrix);
            float[] fArr = this.floatMatrix;
            float f9 = this.matchViewWidth / f3;
            float f10 = this.currentZoom;
            fArr[0] = f9 * f10;
            fArr[4] = (this.matchViewHeight / f5) * f10;
            float f11 = fArr[2];
            float f12 = fArr[5];
            this.floatMatrix[2] = newTranslationAfterChange(f11, this.prevMatchViewWidth * f10, getImageWidth(), this.prevViewWidth, this.viewWidth, drawableWidth, fixedPixel);
            this.floatMatrix[5] = newTranslationAfterChange(f12, this.currentZoom * this.prevMatchViewHeight, getImageHeight(), this.prevViewHeight, this.viewHeight, drawableHeight, fixedPixel);
            this.touchMatrix.setValues(this.floatMatrix);
        } else {
            if (this.isRotateImageToFitScreen && orientationMismatch(drawable)) {
                this.touchMatrix.setRotate(90.0f);
                this.touchMatrix.postTranslate(f3, 0.0f);
                this.touchMatrix.postScale(f4, f6);
            } else {
                this.touchMatrix.setScale(f4, f6);
            }
            ImageView.ScaleType scaleType2 = this.touchScaleType;
            int i3 = scaleType2 != null ? kkm0.a[scaleType2.ordinal()] : -1;
            if (i3 != 5) {
                Matrix matrix = this.touchMatrix;
                if (i3 != 6) {
                    matrix.postTranslate(f7 / 2.0f, f8 / 2.0f);
                } else {
                    matrix.postTranslate(f7, f8);
                }
            } else {
                this.touchMatrix.postTranslate(0.0f, 0.0f);
            }
            this.currentZoom = 1.0f;
        }
        fixTrans();
        setImageMatrix(this.touchMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixScaleTrans() {
        fixTrans();
        this.touchMatrix.getValues(this.floatMatrix);
        float imageWidth = getImageWidth();
        int i = this.viewWidth;
        if (imageWidth < i) {
            float imageWidth2 = (i - getImageWidth()) / 2.0f;
            if (this.isRotateImageToFitScreen && orientationMismatch(getDrawable())) {
                imageWidth2 += getImageWidth();
            }
            this.floatMatrix[2] = imageWidth2;
        }
        float imageHeight = getImageHeight();
        int i2 = this.viewHeight;
        if (imageHeight < i2) {
            this.floatMatrix[5] = (i2 - getImageHeight()) / 2.0f;
        }
        this.touchMatrix.setValues(this.floatMatrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixTrans() {
        this.touchMatrix.getValues(this.floatMatrix);
        float[] fArr = this.floatMatrix;
        this.touchMatrix.postTranslate(getFixTrans(fArr[2], this.viewWidth, getImageWidth(), (this.isRotateImageToFitScreen && orientationMismatch(getDrawable())) ? getImageWidth() : 0.0f), getFixTrans(fArr[5], this.viewHeight, getImageHeight(), 0.0f));
    }

    private final int getDrawableHeight(Drawable drawable) {
        if (drawable == null) {
            return 0;
        }
        return (orientationMismatch(drawable) && this.isRotateImageToFitScreen) ? drawable.getIntrinsicWidth() : drawable.getIntrinsicHeight();
    }

    private final int getDrawableWidth(Drawable drawable) {
        if (drawable == null) {
            return 0;
        }
        return (orientationMismatch(drawable) && this.isRotateImageToFitScreen) ? drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getFixDragTrans(float delta, float viewSize, float contentSize) {
        if (contentSize <= viewSize) {
            return 0.0f;
        }
        return delta;
    }

    private final float getFixTrans(float trans, float viewSize, float contentSize, float offset) {
        float f;
        if (contentSize <= viewSize) {
            f = (viewSize + offset) - contentSize;
        } else {
            offset = (viewSize + offset) - contentSize;
            f = offset;
        }
        if (trans < offset) {
            return (-trans) + offset;
        }
        if (trans > f) {
            return (-trans) + f;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.matchViewHeight * this.currentZoom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.matchViewWidth * this.currentZoom;
    }

    private final float newTranslationAfterChange(float trans, float prevImageSize, float imageSize, int prevViewSize, int viewSize, int drawableSize, FixedPixel sizeChangeFixedPixel) {
        float f = viewSize;
        float f2 = 0.5f;
        if (imageSize < f) {
            return oyr.a(drawableSize, this.floatMatrix[0], f, 0.5f);
        }
        if (trans > 0.0f) {
            return -((imageSize - f) * 0.5f);
        }
        if (sizeChangeFixedPixel == FixedPixel.BOTTOM_RIGHT) {
            f2 = 1.0f;
        } else if (sizeChangeFixedPixel == FixedPixel.TOP_LEFT) {
            f2 = 0.0f;
        }
        return -(((((prevViewSize * f2) + (-trans)) / prevImageSize) * imageSize) - (f * f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean orientationMismatch(Drawable drawable) {
        if (drawable == null) {
            return false;
        }
        return (this.viewWidth > this.viewHeight) != (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scaleImage(double deltaScale, float focusX, float focusY, boolean stretchImageToSuper) {
        float f;
        float f2;
        double d;
        if (stretchImageToSuper) {
            f = this.superMinScale;
            f2 = this.superMaxScale;
        } else {
            f = this.minScale;
            f2 = this.maxScale;
        }
        float f3 = this.currentZoom;
        float f4 = ((float) deltaScale) * f3;
        this.currentZoom = f4;
        if (f4 <= f2) {
            if (f4 < f) {
                this.currentZoom = f;
                d = f;
            }
            float f5 = (float) deltaScale;
            this.touchMatrix.postScale(f5, f5, focusX, focusY);
            fixScaleTrans();
        }
        this.currentZoom = f2;
        d = f2;
        deltaScale = d / f3;
        float f52 = (float) deltaScale;
        this.touchMatrix.postScale(f52, f52, focusX, focusY);
        fixScaleTrans();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ImageActionState imageActionState) {
        this.imageActionState = imageActionState;
    }

    private final int setViewSize(int mode, int size, int drawableWidth) {
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : drawableWidth : Math.min(drawableWidth, size);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f = this.floatMatrix[2];
        if (getImageWidth() < this.viewWidth) {
            return false;
        }
        if (f < -1.0f || direction >= 0) {
            return (Math.abs(f) + ((float) this.viewWidth)) + 1.0f < getImageWidth() || direction <= 0;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        this.touchMatrix.getValues(this.floatMatrix);
        float f = this.floatMatrix[5];
        if (getImageHeight() < this.viewHeight) {
            return false;
        }
        if (f < -1.0f || direction >= 0) {
            return (Math.abs(f) + ((float) this.viewHeight)) + 1.0f < getImageHeight() || direction <= 0;
        }
        return false;
    }

    public final float getCurrentZoom() {
        return this.currentZoom;
    }

    public final float getDoubleTapScale() {
        return this.doubleTapScale;
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final float getMaxScale() {
        return this.maxScale;
    }

    /* renamed from: getMinZoom, reason: from getter */
    public final float getMinScale() {
        return this.minScale;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.touchScaleType;
        return scaleType == null ? ImageView.ScaleType.FIT_CENTER : scaleType;
    }

    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(0.5f, 0.5f);
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(this.viewWidth / 2.0f, this.viewHeight / 2.0f, true);
        transformCoordTouchToBitmap.x /= drawableWidth;
        transformCoordTouchToBitmap.y /= drawableHeight;
        return transformCoordTouchToBitmap;
    }

    public final RectF getZoomedRect() {
        if (this.touchScaleType == ImageView.ScaleType.FIT_XY) {
            w511.x("getZoomedRect() not supported with FIT_XY");
            return null;
        }
        PointF transformCoordTouchToBitmap = transformCoordTouchToBitmap(0.0f, 0.0f, true);
        PointF transformCoordTouchToBitmap2 = transformCoordTouchToBitmap(this.viewWidth, this.viewHeight, true);
        float drawableWidth = getDrawableWidth(getDrawable());
        float drawableHeight = getDrawableHeight(getDrawable());
        return new RectF(transformCoordTouchToBitmap.x / drawableWidth, transformCoordTouchToBitmap.y / drawableHeight, transformCoordTouchToBitmap2.x / drawableWidth, transformCoordTouchToBitmap2.y / drawableHeight);
    }

    /* renamed from: isSuperZoomEnabled, reason: from getter */
    public final boolean getIsSuperZoomEnabled() {
        return this.isSuperZoomEnabled;
    }

    /* renamed from: isZoomEnabled, reason: from getter */
    public final boolean getIsZoomEnabled() {
        return this.isZoomEnabled;
    }

    public final boolean isZoomed() {
        return !(this.currentZoom == 1.0f);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int i = getResources().getConfiguration().orientation;
        if (i != this.orientation) {
            this.orientationJustChanged = true;
            this.orientation = i;
        }
        savePreviousImageValues();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.onDrawReady = true;
        this.imageRenderedAtLeastOnce = true;
        mf61 mf61Var = this.delayedZoomVariables;
        if (mf61Var != null) {
            setZoom(mf61Var.a, mf61Var.b, mf61Var.c, mf61Var.d);
            this.delayedZoomVariables = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int drawableWidth = getDrawableWidth(drawable);
        int drawableHeight = getDrawableHeight(drawable);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int viewSize = setViewSize(mode, size, drawableWidth);
        int viewSize2 = setViewSize(mode2, size2, drawableHeight);
        if (!this.orientationJustChanged) {
            savePreviousImageValues();
        }
        setMeasuredDimension((viewSize - getPaddingLeft()) - getPaddingRight(), (viewSize2 - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Serializable serializable;
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        this.currentZoom = bundle.getFloat("saveScale");
        float[] floatArray = bundle.getFloatArray("matrix");
        if (floatArray == null) {
            floatArray = this.floatMatrix;
        }
        this.floatMatrix = floatArray;
        this.prevMatrix.setValues(floatArray);
        this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
        this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
        this.prevViewHeight = bundle.getInt("viewHeight");
        this.prevViewWidth = bundle.getInt("viewWidth");
        this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
        if (jx81.f()) {
            serializable = bundle.getSerializable("viewSizeChangeFixedPixel", FixedPixel.class);
            this.viewSizeChangeFixedPixel = (FixedPixel) serializable;
        } else {
            this.viewSizeChangeFixedPixel = (FixedPixel) bundle.getSerializable("viewSizeChangeFixedPixel");
        }
        if (this.orientation != bundle.getInt("orientation")) {
            this.orientationJustChanged = true;
        }
        super.onRestoreInstanceState(bundle.getParcelable(STATE));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(STATE, super.onSaveInstanceState());
        bundle.putInt("orientation", this.orientation);
        bundle.putFloat("saveScale", this.currentZoom);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt("viewWidth", this.viewWidth);
        bundle.putInt("viewHeight", this.viewHeight);
        this.touchMatrix.getValues(this.floatMatrix);
        bundle.putFloatArray("matrix", this.floatMatrix);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.viewSizeChangeFixedPixel);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.viewWidth = w;
        this.viewHeight = h;
        fitImageToView();
    }

    public final void resetZoom() {
        this.currentZoom = 1.0f;
        fitImageToView();
    }

    public final void resetZoomAnimated() {
        setZoomAnimated(1.0f, 0.5f, 0.5f);
    }

    public final void savePreviousImageValues() {
        if (this.viewHeight == 0 || this.viewWidth == 0) {
            return;
        }
        this.touchMatrix.getValues(this.floatMatrix);
        this.prevMatrix.setValues(this.floatMatrix);
        this.prevMatchViewHeight = this.matchViewHeight;
        this.prevMatchViewWidth = this.matchViewWidth;
        this.prevViewHeight = this.viewHeight;
        this.prevViewWidth = this.viewWidth;
    }

    public final void setDoubleTapScale(float f) {
        this.doubleTapScale = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bm) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageBitmap(bm);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageResource(resId);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.imageRenderedAtLeastOnce = false;
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    public final void setMaxZoom(float f) {
        this.maxScale = f;
        this.superMaxScale = f * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = false;
    }

    public final void setMaxZoomRatio(float max) {
        this.maxScaleMultiplier = max;
        float f = this.minScale * max;
        this.maxScale = f;
        this.superMaxScale = f * SUPER_MAX_MULTIPLIER;
        this.maxScaleIsSetByMultiplier = true;
    }

    public final void setMinZoom(float f) {
        this.userSpecifiedMinScale = f;
        if (f == -1.0f) {
            ImageView.ScaleType scaleType = this.touchScaleType;
            ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
            if (scaleType == scaleType2 || scaleType == ImageView.ScaleType.CENTER_CROP) {
                Drawable drawable = getDrawable();
                int drawableWidth = getDrawableWidth(drawable);
                int drawableHeight = getDrawableHeight(drawable);
                if (drawable != null && drawableWidth > 0 && drawableHeight > 0) {
                    float f2 = this.viewWidth / drawableWidth;
                    float f3 = this.viewHeight / drawableHeight;
                    this.minScale = this.touchScaleType == scaleType2 ? Math.min(f2, f3) : Math.min(f2, f3) / Math.max(f2, f3);
                }
            } else {
                this.minScale = 1.0f;
            }
        } else {
            this.minScale = f;
        }
        if (this.maxScaleIsSetByMultiplier) {
            setMaxZoomRatio(this.maxScaleMultiplier);
        }
        this.superMinScale = this.minScale * 0.75f;
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.doubleTapListener = onDoubleTapListener;
    }

    public final void setOnTouchCoordinatesListener(z070 onTouchCoordinatesListener) {
    }

    public final void setOnTouchImageViewListener(a170 onTouchImageViewListener) {
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    public final void setRotateImageToFitScreen(boolean rotateImageToFitScreen) {
        this.isRotateImageToFitScreen = rotateImageToFitScreen;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType type) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
        if (type == scaleType) {
            super.setScaleType(scaleType);
            return;
        }
        this.touchScaleType = type;
        if (this.onDrawReady) {
            setZoom(this);
        }
    }

    public final void setScrollPosition(float focusX, float focusY) {
        setZoom(this.currentZoom, focusX, focusY);
    }

    public final void setSuperZoomEnabled(boolean z) {
        this.isSuperZoomEnabled = z;
    }

    public final void setZoom(float scale, float focusX, float focusY, ImageView.ScaleType scaleType) {
        if (!this.onDrawReady) {
            mf61 mf61Var = new mf61();
            mf61Var.a = scale;
            mf61Var.b = focusX;
            mf61Var.c = focusY;
            mf61Var.d = scaleType;
            this.delayedZoomVariables = mf61Var;
            return;
        }
        if (this.userSpecifiedMinScale == -1.0f) {
            setMinZoom(-1.0f);
            float f = this.currentZoom;
            float f2 = this.minScale;
            if (f < f2) {
                this.currentZoom = f2;
            }
        }
        ImageView.ScaleType scaleType2 = this.touchScaleType;
        if (scaleType != scaleType2) {
            if (scaleType == null) {
                scaleType = scaleType2 == null ? ImageView.ScaleType.FIT_CENTER : scaleType2;
            }
            setScaleType(scaleType);
        }
        resetZoom();
        scaleImage(scale, this.viewWidth / 2.0f, this.viewHeight / 2.0f, this.isSuperZoomEnabled);
        this.touchMatrix.getValues(this.floatMatrix);
        this.floatMatrix[2] = -((focusX * getImageWidth()) - (this.viewWidth * 0.5f));
        this.floatMatrix[5] = -((focusY * getImageHeight()) - (this.viewHeight * 0.5f));
        this.touchMatrix.setValues(this.floatMatrix);
        fixTrans();
        savePreviousImageValues();
        setImageMatrix(this.touchMatrix);
    }

    public final void setZoomAnimated(float scale, float focusX, float focusY, h170 listener) {
        compatPostOnAnimation(new p(this, scale, new PointF(focusX, focusY), 500));
    }

    public final void setZoomEnabled(boolean z) {
        this.isZoomEnabled = z;
    }

    public final PointF transformCoordBitmapToTouch(float bx, float by) {
        this.touchMatrix.getValues(this.floatMatrix);
        return new PointF((getImageWidth() * (bx / getDrawable().getIntrinsicWidth())) + this.floatMatrix[2], (getImageHeight() * (by / getDrawable().getIntrinsicHeight())) + this.floatMatrix[5]);
    }

    public final PointF transformCoordTouchToBitmap(float x, float y, boolean clipToBitmap) {
        this.touchMatrix.getValues(this.floatMatrix);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr = this.floatMatrix;
        float f = fArr[2];
        float f2 = fArr[5];
        float imageWidth = ((x - f) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((y - f2) * intrinsicHeight) / getImageHeight();
        if (clipToBitmap) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    public final void setZoomAnimated(float scale, float focusX, float focusY, int zoomTimeMs) {
        compatPostOnAnimation(new p(this, scale, new PointF(focusX, focusY), zoomTimeMs));
    }

    public final void setZoomAnimated(float scale, float focusX, float focusY, int zoomTimeMs, h170 listener) {
        compatPostOnAnimation(new p(this, scale, new PointF(focusX, focusY), zoomTimeMs));
    }

    public final void setZoomAnimated(float scale, float focusX, float focusY) {
        setZoomAnimated(scale, focusX, focusY, 500);
    }

    public final void setZoom(float scale, float focusX, float focusY) {
        setZoom(scale, focusX, focusY, this.touchScaleType);
    }

    public final void setZoom(float scale) {
        setZoom(scale, 0.5f, 0.5f);
    }

    public final void setZoom(ScalableImageView imageSource) {
        PointF scrollPosition = imageSource.getScrollPosition();
        setZoom(imageSource.currentZoom, scrollPosition.x, scrollPosition.y, imageSource.getScaleType());
    }

    public ScalableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScalableImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScalableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
