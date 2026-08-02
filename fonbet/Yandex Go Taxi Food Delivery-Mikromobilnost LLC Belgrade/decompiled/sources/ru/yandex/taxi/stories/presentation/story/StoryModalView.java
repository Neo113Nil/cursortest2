package ru.yandex.taxi.stories.presentation.story;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a60;
import defpackage.adv;
import defpackage.apu0;
import defpackage.aqu0;
import defpackage.b7z0;
import defpackage.bmu0;
import defpackage.bpu0;
import defpackage.bqu0;
import defpackage.bzc0;
import defpackage.chb1;
import defpackage.cpu0;
import defpackage.cvu0;
import defpackage.dpu0;
import defpackage.e230;
import defpackage.epu0;
import defpackage.evu0;
import defpackage.fnu0;
import defpackage.fpu0;
import defpackage.fsf0;
import defpackage.gnu0;
import defpackage.gou0;
import defpackage.gpu0;
import defpackage.h8u0;
import defpackage.ioo;
import defpackage.j73;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kdh0;
import defpackage.lbm;
import defpackage.mrg0;
import defpackage.n9y0;
import defpackage.nac;
import defpackage.ndh0;
import defpackage.np31;
import defpackage.nsz;
import defpackage.ogu0;
import defpackage.oi2;
import defpackage.omu0;
import defpackage.owd0;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pey;
import defpackage.pph0;
import defpackage.ptc;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.rp31;
import defpackage.scs0;
import defpackage.spu0;
import defpackage.t1w;
import defpackage.ths;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpt0;
import defpackage.uf10;
import defpackage.uh6;
import defpackage.v770;
import defpackage.vby;
import defpackage.vmu0;
import defpackage.w130;
import defpackage.w511;
import defpackage.wj6;
import defpackage.wor0;
import defpackage.x1i0;
import defpackage.x5s0;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xou0;
import defpackage.xw31;
import defpackage.you0;
import defpackage.zbb1;
import defpackage.zdh;
import defpackage.zou0;
import defpackage.zpu0;
import defpackage.zxc0;
import defpackage.zxs0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.banners.PromoBannerActivationStatus;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RoundedCornersImageView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 \u009f\u00022\u00020\u00012\u00020\u0002:\u000eª\u0001 \u0002¡\u0002¢\u0002£\u0002¤\u0002¥\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u0019H\u0014¢\u0006\u0004\b#\u0010\u001bJ\u001f\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0019H\u0016¢\u0006\u0004\b-\u0010\u001bJ\u0017\u00100\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0019H\u0014¢\u0006\u0004\b2\u0010\u001bJ\u001f\u00105\u001a\u00020\u00192\u0006\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020$H\u0014¢\u0006\u0004\b5\u0010(J\u000f\u00106\u001a\u00020\u0019H\u0015¢\u0006\u0004\b6\u0010\u001bJ\u001f\u0010;\u001a\u00020\u00192\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bC\u0010@J\u0017\u0010F\u001a\u00020\u00192\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0019H\u0016¢\u0006\u0004\bH\u0010\u001bJ\u0017\u0010I\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bI\u0010BJ\u000f\u0010J\u001a\u00020\u0019H\u0016¢\u0006\u0004\bJ\u0010\u001bJ\u0017\u0010K\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bK\u0010BJ\u0017\u0010L\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bL\u0010BJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bM\u0010BJ\u0017\u0010N\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bN\u0010BJ\u0017\u0010P\u001a\u00020\u00192\u0006\u0010O\u001a\u00020)H\u0016¢\u0006\u0004\bP\u0010,J\u0019\u0010Q\u001a\u00020\u00192\b\u0010O\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\bQ\u0010,J\u000f\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bR\u0010\u001bJ\u001f\u0010W\u001a\u00020V2\u0006\u0010S\u001a\u00020.2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0019H\u0016¢\u0006\u0004\bY\u0010\u001bJ\u000f\u0010Z\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010\u001bJ\u0017\u0010\\\u001a\u00020V2\u0006\u0010U\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020V2\u0006\u0010U\u001a\u00020[H\u0016¢\u0006\u0004\b^\u0010]J\u000f\u0010_\u001a\u00020\u0019H\u0002¢\u0006\u0004\b_\u0010\u001bJ\u000f\u0010`\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010\u001bJ\u000f\u0010a\u001a\u00020\u0019H\u0002¢\u0006\u0004\ba\u0010\u001bJ\u000f\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bb\u0010\u001bJ\u000f\u0010c\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010\u001bJ\u000f\u0010d\u001a\u00020\u0019H\u0002¢\u0006\u0004\bd\u0010\u001bJ\u000f\u0010e\u001a\u00020\u0019H\u0002¢\u0006\u0004\be\u0010\u001bJ\u000f\u0010f\u001a\u00020\u0019H\u0002¢\u0006\u0004\bf\u0010\u001bJ\u000f\u0010g\u001a\u00020\u0019H\u0002¢\u0006\u0004\bg\u0010\u001bJ\u000f\u0010h\u001a\u00020\u0019H\u0002¢\u0006\u0004\bh\u0010\u001bJ\u001f\u0010k\u001a\u00020\u00192\u0006\u0010j\u001a\u00020i2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bk\u0010lJ!\u0010o\u001a\u00020V2\u0006\u0010m\u001a\u0002092\b\u0010n\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0019H\u0002¢\u0006\u0004\bq\u0010\u001bJ\u000f\u0010r\u001a\u00020\u0019H\u0002¢\u0006\u0004\br\u0010\u001bJ)\u0010t\u001a\u00020\u00192\u0006\u0010m\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010s\u001a\u00020VH\u0002¢\u0006\u0004\bt\u0010uJ\u0019\u0010v\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\bv\u0010BJ\u0017\u0010w\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bw\u0010BJ5\u0010~\u001a\u00020\u00192\u0006\u0010y\u001a\u00020x2\b\u0010z\u001a\u0004\u0018\u00010)2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00190{H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u001bJ\u0011\u0010\u0081\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u001bJ\u001c\u0010\u0084\u0001\u001a\u00020\u00192\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u001bJ\u0011\u0010\u0087\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u001bJ\u0011\u0010\u0088\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u001bJ\u0011\u0010\u0089\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u001bJ\u0011\u0010\u008a\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u001bJ\u0011\u0010\u008b\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u008b\u0001\u0010\u001bJ\u0011\u0010\u008c\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u001bJ\u0011\u0010\u008d\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u008d\u0001\u0010\u001bJ\u001c\u0010\u0090\u0001\u001a\u00020\u00192\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u00192\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0091\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0019H\u0003¢\u0006\u0005\b\u0093\u0001\u0010\u001bJ\u001c\u0010\u0096\u0001\u001a\u00020\u00192\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u0098\u0001\u001a\u00020\u00192\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J\u001c\u0010\u0099\u0001\u001a\u00020\u00192\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u0091\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u001bJ%\u0010\u009c\u0001\u001a\u00020\u00192\u0007\u0010\u009b\u0001\u001a\u00020V2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\u001bJ\u0011\u0010\u009f\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u001bJ%\u0010 \u0001\u001a\u00020\u00192\u0007\u0010\u009b\u0001\u001a\u00020V2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b \u0001\u0010\u009d\u0001J\u0011\u0010¡\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¡\u0001\u0010\u001bJ\u0019\u0010¢\u0001\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0005\b¢\u0001\u0010BJ\u001c\u0010¥\u0001\u001a\u00020\u00192\b\u0010¤\u0001\u001a\u00030£\u0001H\u0003¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0015\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0013\u0010«\u0001\u001a\u00030ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010\u00ad\u0001\u001a\u00020\u00192\b\u0010\u0083\u0001\u001a\u00030ª\u0001H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001a\u0010°\u0001\u001a\u00020\u00192\u0007\u0010¯\u0001\u001a\u00020.H\u0002¢\u0006\u0005\b°\u0001\u00101J\u0019\u0010±\u0001\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0005\b±\u0001\u0010BJ\u001c\u0010²\u0001\u001a\u00020V2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001c\u0010´\u0001\u001a\u00020V2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b´\u0001\u0010³\u0001J\u001d\u0010µ\u0001\u001a\u00030\u0094\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b·\u0001\u0010\u001bR\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010¸\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¹\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010º\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010»\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¼\u0001R\u0017\u0010½\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0017\u0010¿\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010¾\u0001R\u0018\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Ã\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010¾\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ç\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010¾\u0001R\u0017\u0010È\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010¾\u0001R\u0017\u0010É\u0001\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Ë\u0001\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ê\u0001R\u0018\u0010Í\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Î\u0001R\u0018\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ò\u0001R\u0017\u0010Ô\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010¾\u0001R\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0017\u0010Ø\u0001\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010¾\u0001R \u0010Ú\u0001\u001a\u00030Ù\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010ß\u0001\u001a\u00030Þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0018\u0010â\u0001\u001a\u00030á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010ä\u0001\u001a\u00020i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010ç\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0017\u0010é\u0001\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0019\u0010î\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0019\u0010ð\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ï\u0001R\u0018\u0010ò\u0001\u001a\u00030ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0018\u0010õ\u0001\u001a\u00030ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010÷\u0001R\u0019\u0010ø\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0019\u0010ú\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010ù\u0001R\u0019\u0010û\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ù\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010÷\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010ý\u0001R\u0019\u0010þ\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ù\u0001R\u001c\u0010\u0080\u0002\u001a\u0005\u0018\u00010ÿ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R#\u0010\u0084\u0002\u001a\f\u0012\u0005\u0012\u00030\u0083\u0002\u0018\u00010\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0086\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010ù\u0001R\u0019\u0010\u0087\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010ù\u0001R\u0019\u0010\u0088\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010ù\u0001R\u001a\u0010\u0089\u0002\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010ý\u0001R\u0019\u0010\u008a\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010ù\u0001R\u0019\u0010\u008b\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010ù\u0001R\u0019\u0010\u008c\u0002\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010ù\u0001R\u0018\u0010\u008e\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001a\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0090\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0018\u0010\u0096\u0002\u001a\u00030\u008e\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0018\u0010\u009a\u0002\u001a\u00030\u0097\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u0097\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u0099\u0002R\u0017\u0010\u009d\u0002\u001a\u00020V8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002¨\u0006¦\u0002"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lgpu0;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lru/yandex/taxi/stories/presentation/story/g;", "presenter", "Lh8u0;", "statusBarCoordinator", "Lpav;", "imageLoader", "Lru/yandex/taxi/widget/d;", "animationLoader", "Lb7z0;", "timeProvider", "Lpdc;", "colorConverter", "Lspu0;", "storyPreviewInfoHolder", "Lptc;", "communicationsFontPropertiesProvider", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Lru/yandex/taxi/stories/presentation/story/g;Lh8u0;Lpav;Lru/yandex/taxi/widget/d;Lb7z0;Lpdc;Lspu0;Lptc;)V", "Lzy11;", "dismiss", "()V", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "", Constants.KEY_MESSAGE, "showNotification", "(Ljava/lang/String;)V", "hideNotification", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "startAction", "endAction", "animateDismiss", "onBackPressed", "Luf10;", "mediaSource", "Lxou0;", "storyMediaInfo", "playVideo", "(Luf10;Lxou0;)V", "Lru/yandex/taxi/promotions/model/PromotionBackground;", "mainBackground", "playImage", "(Lru/yandex/taxi/promotions/model/PromotionBackground;Lxou0;)V", "playColor", "(Lxou0;)V", "playAnimation", "Lnsz;", "composition", "setLottieComposition", "(Lnsz;)V", "pausePlayback", "updateStoryMediaInfo", "resumePlayback", "animateToNext", "animateToPrevious", "animateToPageForward", "animateToPageBackward", "text", "shareText", "shareScreen", "onPlaybackError", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "showStoryLoading", "hideStoryLoading", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "closeClicked", "resolveStatusBarColor", "resetStatusBarColor", "settleScrollForDismiss", "cancelDismiss", "initPlayer", "onPlayerPositionChanged", "resetPlayer", "onPlaybackImageLoaded", "resumeLottieAnimationFromBeginning", "Lru/yandex/taxi/stories/presentation/story/StoryModalView$MediaType;", "mediaType", "onPlayMedia", "(Lru/yandex/taxi/stories/presentation/story/StoryModalView$MediaType;Lxou0;)V", "previousMediaInfo", "url", "needToLoadImage", "(Lxou0;Ljava/lang/String;)Z", "cancelImageLoadingRequest", "scheduleLoadingIndicatorUpdate", "shouldLoadImage", "setMainMediaInfo", "(Lxou0;Lxou0;Z)V", "setSecondaryMediaInfo", "onSecondaryBackgroundLoaded", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "imageView", "imageUrl", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onImageLoaded", "loadImage", "(Lru/yandex/taxi/widget/RoundedCornersImageView;Ljava/lang/String;Ltls;)V", "resumeVideoPlayback", "animateToVideo", "Lru/yandex/taxi/stories/presentation/story/StoryModalView$State;", ClidProvider.STATE, "setState", "(Lru/yandex/taxi/stories/presentation/story/StoryModalView$State;)V", "updateViewsVisibility", "notifyPresenterLoadingIndicatorVisibility", "setAnimationVisible", "setPlayerVisible", "setLoadingIndicatorVisibleIfNeeded", "setPageContentVisibility", "setSecondaryPageContentVisibility", "updatePositionRunnableState", "", "scroll", "startPageScroll", "(F)V", "startStoriesScroll", "updateMainSnapshotWithCurrentFrame", "Lru/yandex/taxi/stories/presentation/story/StoryAnimationDirection;", "animationDirection", "setSecondaryStorySnapshot", "(Lru/yandex/taxi/stories/presentation/story/StoryAnimationDirection;)V", "setSecondaryPageSnapshot", "setScroll", "updatePager", "afterFling", "settlePageScroll", "(ZLru/yandex/taxi/stories/presentation/story/StoryAnimationDirection;)V", "finishedScrollToNextPage", "finishedScrollToPreviousPage", "settleStoryScroll", "scrollAnimationCanceled", "prepareStoryScroll", "Landroid/graphics/Canvas;", "canvas", "drawVideoFrame", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "getScreenshot", "()Landroid/graphics/Bitmap;", "Lfpu0;", "prepareBeforeTakingScreenshot", "()Lfpu0;", "restoreAfterTakingScreenshot", "(Lfpu0;)V", Constants.KEY_PAGE, "finishedScrollToPage", "preparePageScroll", "canScrollPageTo", "(Lru/yandex/taxi/stories/presentation/story/StoryAnimationDirection;)Z", "canScrollTo", "scrollToDirection", "(F)Lru/yandex/taxi/stories/presentation/story/StoryAnimationDirection;", "setAccessibilityFocusToCloseBtn", "Landroid/content/Context;", "Landroidx/lifecycle/Lifecycle;", "Lru/yandex/taxi/stories/presentation/story/g;", "Lh8u0;", "Lpav;", "content", "Landroid/view/View;", "playerContainer", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroidx/media3/ui/PlayerView;", "animationContainer", "Lcom/airbnb/lottie/LottieAnimationView;", "animationView", "Lcom/airbnb/lottie/LottieAnimationView;", "animationBackground", "loadingIndicator", "snapshotMain", "Lru/yandex/taxi/widget/RoundedCornersImageView;", "snapshotSecondary", "Lru/yandex/taxi/stories/presentation/story/StoryContentView;", "contentViewMain", "Lru/yandex/taxi/stories/presentation/story/StoryContentView;", "contentViewSecondary", "Lru/yandex/taxi/stories/presentation/story/StoryTopView;", "topViewMain", "Lru/yandex/taxi/stories/presentation/story/StoryTopView;", "topViewSecondary", "retryIcon", "Landroid/widget/TextView;", "notificationView", "Landroid/widget/TextView;", "storyLoadingContainer", "Landroid/widget/FrameLayout;", "overlappingModalViewContainer", "Landroid/widget/FrameLayout;", "getOverlappingModalViewContainer", "()Landroid/widget/FrameLayout;", "Lioo;", "playerProxy", "Lioo;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "currentMediaType", "Lru/yandex/taxi/stories/presentation/story/StoryModalView$MediaType;", "Ladv;", "imagePlaybackController", "Ladv;", "loadingIndicatorUpdateRunnable", "Ljava/lang/Runnable;", "Lbqu0;", "transitions", "Lbqu0;", "mediaInfoMain", "Lxou0;", "mediaInfoSecondary", "Loi2;", "animationPlaybackController", "Loi2;", "Lru/yandex/taxi/audio/a;", "audioController", "Lru/yandex/taxi/audio/a;", "Lru/yandex/taxi/stories/presentation/story/StoryModalView$State;", "firstFrameRendered", "Z", "needAnimateToVideo", "animatedToVideo", "stateBeforeScroll", "F", "canChangeSecondarySnapshotDuringScroll", "Lbzc0;", "playerPositionUpdater", "Lbzc0;", "Llbm;", "Landroid/widget/ImageView;", "imageLoadingRequest", "Llbm;", "playbackMediaLoaded", "mainSnapshotSetFromMediaInfo", "userEnabledAudio", "dismissScrollPercent", "ignoreTouchEvents", "attached", "isFirstPage", "Landroidx/lifecycle/q;", "lifecycleObserver", "Landroidx/lifecycle/q;", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "getPlaybackProgress", "()F", "playbackProgress", "", "getPlaybackPosition", "()J", "playbackPosition", "getPlaybackDuration", "playbackDuration", "isRtl", "()Z", "Companion", "ru/yandex/taxi/stories/presentation/story/c", "GestureListener", "wor0", "State", "MediaType", "epu0", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoryModalView extends ModalView implements gpu0 {
    public static final epu0 Companion = new epu0();
    private static final int MAX_PLAYER_BUFFER_MS = 15000;
    private static final int MIN_PLAYER_BUFFER_MS = 1000;
    private static final float START_SIDE_CLICK_AREA_PERCENT = 0.35f;
    private boolean animatedToVideo;
    private final View animationBackground;
    private final View animationContainer;
    private final oi2 animationPlaybackController;
    private final LottieAnimationView animationView;
    private boolean attached;
    private final ru.yandex.taxi.audio.a audioController;
    private boolean canChangeSecondarySnapshotDuringScroll;
    private final View content;
    private final StoryContentView contentViewMain;
    private final StoryContentView contentViewSecondary;
    private final Context context;
    private MediaType currentMediaType;
    private float dismissScrollPercent;
    private boolean firstFrameRendered;
    private final GestureDetector gestureDetector;
    private boolean ignoreTouchEvents;
    private final pav imageLoader;
    private lbm imageLoadingRequest;
    private final adv imagePlaybackController;
    private boolean isFirstPage;
    private final Lifecycle lifecycle;
    private final q lifecycleObserver;
    private final View loadingIndicator;
    private final Runnable loadingIndicatorUpdateRunnable;
    private boolean mainSnapshotSetFromMediaInfo;
    private xou0 mediaInfoMain;
    private xou0 mediaInfoSecondary;
    private boolean needAnimateToVideo;
    private final TextView notificationView;
    private final FrameLayout overlappingModalViewContainer;
    private boolean playbackMediaLoaded;
    private final View playerContainer;
    private bzc0 playerPositionUpdater;
    private final ioo playerProxy;
    private final PlayerView playerView;
    private final g presenter;
    private final View retryIcon;
    private float scroll;
    private final RoundedCornersImageView snapshotMain;
    private final RoundedCornersImageView snapshotSecondary;
    private State state;
    private State stateBeforeScroll;
    private final h8u0 statusBarCoordinator;
    private final View storyLoadingContainer;
    private final StoryTopView topViewMain;
    private final StoryTopView topViewSecondary;
    private final bqu0 transitions;
    private boolean userEnabledAudio;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J*\u0010\u0015\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryModalView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/yandex/taxi/stories/presentation/story/StoryModalView;)V", "touchSlop", "", "minFlingVelocity", "", "scrolled", "onSingleTapConfirmed", "", "e", "Landroid/view/MotionEvent;", "onDown", "isAllowedStateToScroll", "()Z", "onScroll", "e1", "e2", "distanceX", "distanceY", "onFling", "velocityX", "velocityY", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private final float minFlingVelocity;
        private float scrolled;
        private final int touchSlop;

        public GestureListener() {
            this.touchSlop = ViewConfiguration.get(StoryModalView.this.getContext()).getScaledTouchSlop();
            this.minFlingVelocity = uh6.p(StoryModalView.this.getContext(), 700.0f);
        }

        public final boolean isAllowedStateToScroll() {
            return StoryModalView.this.state == State.PAUSED || StoryModalView.this.state == State.ERROR;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e) {
            if (StoryModalView.this.state == State.ERROR) {
                return true;
            }
            StoryModalView.this.pausePlayback();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (Math.abs(velocityX) > this.minFlingVelocity && (StoryModalView.this.state == State.PAUSED || StoryModalView.this.state == State.ERROR || StoryModalView.this.state == State.SCROLLING_STORIES || StoryModalView.this.state == State.SCROLLING_PAGE)) {
                StoryAnimationDirection storyAnimationDirection = StoryModalView.this.isRtl() ? velocityX > 0.0f ? StoryAnimationDirection.NEXT : StoryAnimationDirection.PREVIOUS : velocityX < 0.0f ? StoryAnimationDirection.NEXT : StoryAnimationDirection.PREVIOUS;
                boolean canScrollPageTo = StoryModalView.this.canScrollPageTo(storyAnimationDirection);
                StoryModalView storyModalView = StoryModalView.this;
                if (canScrollPageTo) {
                    if (storyModalView.state != State.SCROLLING_PAGE) {
                        StoryModalView.this.updateMainSnapshotWithCurrentFrame();
                        StoryModalView.this.setSecondaryPageSnapshot(storyAnimationDirection);
                        StoryModalView.this.setScroll(0.0f);
                    }
                    StoryModalView.this.settlePageScroll(true, storyAnimationDirection);
                    return true;
                }
                if (!storyModalView.canScrollTo(storyAnimationDirection)) {
                    return false;
                }
                if (StoryModalView.this.state != State.SCROLLING_STORIES) {
                    StoryModalView.this.updateMainSnapshotWithCurrentFrame();
                    StoryModalView.this.setSecondaryStorySnapshot(storyAnimationDirection);
                    StoryModalView.this.setScroll(0.0f);
                }
                StoryModalView.this.settleStoryScroll(true, storyAnimationDirection);
                return true;
            }
            if (Math.abs(velocityY) <= this.minFlingVelocity) {
                return false;
            }
            if (StoryModalView.this.state != State.PAUSED && StoryModalView.this.state != State.ERROR && StoryModalView.this.state != State.SCROLL_FOR_DISMISS && StoryModalView.this.state != State.SCROLLING_STORY_VERTICAL) {
                return false;
            }
            State state = StoryModalView.this.state;
            State state2 = State.SCROLLING_STORY_VERTICAL;
            StoryModalView storyModalView2 = StoryModalView.this;
            if (state == state2) {
                storyModalView2.contentViewMain.flingContent(-((int) velocityY));
                StoryModalView.this.resumePlayback();
                return true;
            }
            State state3 = storyModalView2.state;
            State state4 = State.SCROLL_FOR_DISMISS;
            if (state3 != state4) {
                StoryModalView.this.updateMainSnapshotWithCurrentFrame();
            }
            StoryModalView storyModalView3 = StoryModalView.this;
            if (velocityY < 0.0f) {
                if (storyModalView3.state != state4) {
                    return false;
                }
                StoryModalView.this.cancelDismiss();
                return true;
            }
            if (!storyModalView3.presenter.f.g) {
                return false;
            }
            StoryModalView.this.presenter.j();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            float x = e1 == null ? 0.0f : e2.getX() - e1.getX();
            float y = e1 == null ? 0.0f : e2.getY() - e1.getY();
            if (isAllowedStateToScroll() && Math.abs(x) > this.touchSlop) {
                StoryModalView storyModalView = StoryModalView.this;
                boolean canScrollPageTo = storyModalView.canScrollPageTo(storyModalView.scrollToDirection(x));
                StoryModalView storyModalView2 = StoryModalView.this;
                if (!canScrollPageTo) {
                    if (storyModalView2.canScrollTo(storyModalView2.scrollToDirection(x))) {
                        StoryModalView storyModalView3 = StoryModalView.this;
                        storyModalView3.stateBeforeScroll = storyModalView3.state;
                        StoryModalView.this.startStoriesScroll(x);
                    }
                    return true;
                }
                storyModalView2.stateBeforeScroll = storyModalView2.state;
                StoryModalView.this.startPageScroll(x);
            }
            if (isAllowedStateToScroll() && Math.abs(y) > this.touchSlop) {
                boolean canScrollContent = StoryModalView.this.contentViewMain.canScrollContent((int) distanceY);
                StoryModalView storyModalView4 = StoryModalView.this;
                if (canScrollContent) {
                    storyModalView4.stateBeforeScroll = storyModalView4.state;
                    StoryModalView.this.setState(State.SCROLLING_STORY_VERTICAL);
                    this.scrolled = 0.0f;
                } else if (storyModalView4.presenter.f.g) {
                    StoryModalView storyModalView5 = StoryModalView.this;
                    storyModalView5.stateBeforeScroll = storyModalView5.state;
                    StoryModalView.this.setState(State.SCROLL_FOR_DISMISS);
                    StoryModalView.this.updateMainSnapshotWithCurrentFrame();
                    StoryModalView.this.transitions.m(r1.a.getWidth() / 2.0f, 0.0f);
                }
            }
            State state = StoryModalView.this.stateBeforeScroll;
            if (state == null) {
                xby.d.w(new IllegalStateException("stateBeforeScroll should not be null here"));
                state = State.RESET;
            }
            int i = b.a[StoryModalView.this.state.ordinal()];
            if (i == 1) {
                StoryModalView storyModalView6 = StoryModalView.this;
                boolean canScrollPageTo2 = storyModalView6.canScrollPageTo(storyModalView6.scrollToDirection(x));
                StoryModalView storyModalView7 = StoryModalView.this;
                if (!canScrollPageTo2) {
                    storyModalView7.setState(state);
                    return true;
                }
                storyModalView7.setScroll(x);
                StoryModalView.this.transitions.u();
                return true;
            }
            if (i == 2) {
                StoryModalView storyModalView8 = StoryModalView.this;
                boolean canScrollTo = storyModalView8.canScrollTo(storyModalView8.scrollToDirection(x));
                StoryModalView storyModalView9 = StoryModalView.this;
                if (!canScrollTo) {
                    storyModalView9.setState(state);
                    return true;
                }
                storyModalView9.setScroll(x);
                StoryModalView.this.transitions.v();
                return true;
            }
            if (i == 3) {
                int i2 = (int) distanceY;
                boolean canScrollContent2 = StoryModalView.this.contentViewMain.canScrollContent(i2);
                StoryModalView storyModalView10 = StoryModalView.this;
                if (!canScrollContent2) {
                    storyModalView10.setState(state);
                    return true;
                }
                storyModalView10.contentViewMain.scrollContent(i2);
                this.scrolled += distanceY;
                return true;
            }
            if (i == 4) {
                float y2 = (e2.getY() - (e1 != null ? e1.getY() : 0.0f)) + this.scrolled;
                StoryModalView storyModalView11 = StoryModalView.this;
                if (y2 < 0.0f) {
                    storyModalView11.setState(state);
                    this.scrolled = 0.0f;
                    return true;
                }
                StoryModalView.this.dismissScrollPercent = (float) Math.min(y2 / ((float) Math.max(storyModalView11.getHeight(), 1.0d)), 1.0d);
                StoryModalView.this.dismissScrollPercent = (float) Math.max(r9.dismissScrollPercent, 0.0d);
                StoryModalView.this.transitions.o(StoryModalView.this.dismissScrollPercent);
                return true;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            if (r8.getX() < (r1.content.getWidth() * 0.65f)) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ac, code lost:
        
            r8 = r7.this$0.presenter;
            r7 = r7.this$0.transitions.r();
            r0 = r8.h;
            r1 = r0.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
        
            if (r1 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00c8, code lost:
        
            if (r1.i.b != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00cb, code lost:
        
            r4 = r8.h;
            r5 = r4.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
        
            if (r5 != null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
        
            if (ru.yandex.taxi.stories.presentation.story.g.l(r5) != ru.yandex.taxi.stories.presentation.story.StoryMediaInfo$PagerMode.DOTS) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
        
            if (r4.j <= 0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
        
            ((defpackage.gpu0) r8.a).animateToPageBackward(r8.k(r1, r0.j - 1, false));
            r8.u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00f1, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f2, code lost:
        
            r8.o(r7, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            r8 = r7.this$0.presenter;
            r7 = r7.this$0.transitions.r();
            r0 = r8.h;
            r1 = r0.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        
            if (r1 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r1.i.b == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        
            r4 = r8.h;
            r5 = r4.d();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r5 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        
            if (ru.yandex.taxi.stories.presentation.story.g.l(r5) != ru.yandex.taxi.stories.presentation.story.StoryMediaInfo$PagerMode.DOTS) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        
            if (r4.f() == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        
            ((defpackage.gpu0) r8.a).animateToPageForward(r8.k(r1, r0.j + 1, false));
            r8.u();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        
            r8.m(r7, false, false);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x005f, code lost:
        
            if (r8.getX() > (r1.content.getWidth() * 0.35f)) goto L18;
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onSingleTapConfirmed(MotionEvent e) {
            if (StoryModalView.this.state != State.RESET && StoryModalView.this.state != State.SETTLING_DISMISS_SCROLL && StoryModalView.this.state != State.SETTLING_STORIES_SCROLL && StoryModalView.this.state != State.SETTLING_PAGE_SCROLL) {
                boolean isRtl = StoryModalView.this.isRtl();
                StoryModalView storyModalView = StoryModalView.this;
                if (isRtl) {
                }
            }
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryModalView$MediaType;", "", "VIDEO", "ANIMATION", "IMAGE", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class MediaType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType ANIMATION;
        public static final MediaType IMAGE;
        public static final MediaType VIDEO;

        static {
            MediaType mediaType = new MediaType("VIDEO", 0);
            VIDEO = mediaType;
            MediaType mediaType2 = new MediaType("ANIMATION", 1);
            ANIMATION = mediaType2;
            MediaType mediaType3 = new MediaType("IMAGE", 2);
            IMAGE = mediaType3;
            MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3};
            $VALUES = mediaTypeArr;
            $ENTRIES = kotlin.enums.a.a(mediaTypeArr);
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/stories/presentation/story/StoryModalView$State;", "", "APPEARING", "RESET", "BUFFERING", "ANIMATING_TO_VIDEO", "PLAYING", "PAUSED", "ERROR", "SCROLLING_PAGE", "SETTLING_PAGE_SCROLL", "SCROLLING_STORIES", "SCROLLING_STORY_VERTICAL", "SETTLING_STORIES_SCROLL", "SCROLL_FOR_DISMISS", "SETTLING_DISMISS_SCROLL", "stories"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ANIMATING_TO_VIDEO;
        public static final State APPEARING;
        public static final State BUFFERING;
        public static final State ERROR;
        public static final State PAUSED;
        public static final State PLAYING;
        public static final State RESET;
        public static final State SCROLLING_PAGE;
        public static final State SCROLLING_STORIES;
        public static final State SCROLLING_STORY_VERTICAL;
        public static final State SCROLL_FOR_DISMISS;
        public static final State SETTLING_DISMISS_SCROLL;
        public static final State SETTLING_PAGE_SCROLL;
        public static final State SETTLING_STORIES_SCROLL;

        static {
            State state = new State("APPEARING", 0);
            APPEARING = state;
            State state2 = new State("RESET", 1);
            RESET = state2;
            State state3 = new State("BUFFERING", 2);
            BUFFERING = state3;
            State state4 = new State("ANIMATING_TO_VIDEO", 3);
            ANIMATING_TO_VIDEO = state4;
            State state5 = new State("PLAYING", 4);
            PLAYING = state5;
            State state6 = new State("PAUSED", 5);
            PAUSED = state6;
            State state7 = new State("ERROR", 6);
            ERROR = state7;
            State state8 = new State("SCROLLING_PAGE", 7);
            SCROLLING_PAGE = state8;
            State state9 = new State("SETTLING_PAGE_SCROLL", 8);
            SETTLING_PAGE_SCROLL = state9;
            State state10 = new State("SCROLLING_STORIES", 9);
            SCROLLING_STORIES = state10;
            State state11 = new State("SCROLLING_STORY_VERTICAL", 10);
            SCROLLING_STORY_VERTICAL = state11;
            State state12 = new State("SETTLING_STORIES_SCROLL", 11);
            SETTLING_STORIES_SCROLL = state12;
            State state13 = new State("SCROLL_FOR_DISMISS", 12);
            SCROLL_FOR_DISMISS = state13;
            State state14 = new State("SETTLING_DISMISS_SCROLL", 13);
            SETTLING_DISMISS_SCROLL = state14;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11, state12, state13, state14};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public StoryModalView(Context context, Lifecycle lifecycle, g gVar, h8u0 h8u0Var, pav pavVar, ru.yandex.taxi.widget.d dVar, b7z0 b7z0Var, pdc pdcVar, spu0 spu0Var, ptc ptcVar) {
        super(new ContextThemeWrapper(context, x1i0.Component_Light));
        this.context = context;
        this.lifecycle = lifecycle;
        this.presenter = gVar;
        this.statusBarCoordinator = h8u0Var;
        this.imageLoader = pavVar;
        ru.yandex.taxi.design.utils.c.q(this, pph0.taxi_communications_story_modal_view, true);
        int i = kdh0.content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.content = (View) rp31.d(this, i);
        this.playerContainer = (View) rp31.d(this, kdh0.player_container);
        PlayerView playerView = (PlayerView) ((View) rp31.d(this, kdh0.player_view));
        this.playerView = playerView;
        this.animationContainer = (View) rp31.d(this, kdh0.story_animation_container);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) rp31.d(this, kdh0.story_animation_view));
        this.animationView = lottieAnimationView;
        this.animationBackground = (View) rp31.d(this, kdh0.story_animation_background);
        this.loadingIndicator = (View) rp31.d(this, kdh0.loading_indicator);
        RoundedCornersImageView roundedCornersImageView = (RoundedCornersImageView) ((View) rp31.d(this, kdh0.snapshot_main));
        this.snapshotMain = roundedCornersImageView;
        this.snapshotSecondary = (RoundedCornersImageView) ((View) rp31.d(this, kdh0.snapshot_secondary));
        StoryContentView storyContentView = (StoryContentView) ((View) rp31.d(this, kdh0.content_view_main));
        this.contentViewMain = storyContentView;
        StoryContentView storyContentView2 = (StoryContentView) ((View) rp31.d(this, kdh0.content_view_secondary));
        this.contentViewSecondary = storyContentView2;
        StoryTopView storyTopView = (StoryTopView) ((View) rp31.d(this, kdh0.story_top_view_main));
        this.topViewMain = storyTopView;
        this.topViewSecondary = (StoryTopView) ((View) rp31.d(this, kdh0.story_top_view_secondary));
        View view = (View) rp31.d(this, kdh0.retry_icon);
        this.retryIcon = view;
        TextView textView = (TextView) ((View) rp31.d(this, kdh0.notification));
        this.notificationView = textView;
        View view2 = (View) rp31.d(this, kdh0.story_loading_container);
        this.storyLoadingContainer = view2;
        this.overlappingModalViewContainer = (FrameLayout) ((View) rp31.d(this, kdh0.overlapping_modal_view_container));
        epu0 epu0Var = Companion;
        c cVar = new c(this);
        epu0Var.getClass();
        zdh.a aVar = new zdh.a();
        aVar.b(1000, MAX_PLAYER_BUFFER_MS, 1000, 1000);
        this.playerProxy = new ioo(context, cVar, aVar.a());
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.currentMediaType = MediaType.VIDEO;
        this.loadingIndicatorUpdateRunnable = new you0(this, 14);
        bqu0 bqu0Var = new bqu0(this, spu0Var, new wor0(this));
        this.transitions = bqu0Var;
        xou0 xou0Var = xou0.r;
        this.mediaInfoMain = xou0Var;
        this.mediaInfoSecondary = xou0Var;
        this.state = State.RESET;
        this.canChangeSecondarySnapshotDuringScroll = true;
        this.isFirstPage = true;
        view2.setBackgroundColor(qje.t(xng0.bgMain, context));
        storyContentView.initDependencies(pavVar, dVar, pdcVar, ptcVar);
        storyContentView2.initDependencies(pavVar, dVar, pdcVar, ptcVar);
        playerView.setUseController(false);
        storyTopView.setListener(new cpu0(this));
        storyContentView.setListener(new dpu0(this));
        Long l = (Long) gVar.k.c.e.get((String) gVar.f.c.get(0));
        bqu0Var.v = l != null ? l.longValue() : 300L;
        view.setOnClickListener(new vmu0(1, this));
        textView.setAlpha(0.0f);
        roundedCornersImageView.setRoundedBackgroundColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        this.audioController = new ru.yandex.taxi.audio.a((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND), new cpu0(this));
        int i2 = 1;
        this.imagePlaybackController = new adv(this, new ths(b7z0Var, i2), new you0(this, 15));
        this.animationPlaybackController = new oi2(lottieAnimationView, b7z0Var, new you0(this, i2));
        this.lifecycleObserver = new wj6(7, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(StoryModalView storyModalView, View view) {
        storyModalView.presenter.r(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(StoryModalView storyModalView, float f) {
        androidx.media3.exoplayer.f fVar = storyModalView.playerProxy.d;
        if (fVar != null) {
            fVar.setVolume(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(StoryModalView storyModalView) {
        storyModalView.presenter.s(storyModalView.getPlaybackProgress(), storyModalView.getPlaybackPosition(), storyModalView.transitions.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(StoryModalView storyModalView) {
        storyModalView.presenter.s(storyModalView.getPlaybackProgress(), storyModalView.getPlaybackPosition(), storyModalView.transitions.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDismiss$lambda$0(StoryModalView storyModalView, Runnable runnable) {
        g gVar = storyModalView.presenter;
        Story d = gVar.h.d();
        String str = d != null ? d.b : null;
        if (str != null) {
            gVar.j.a(str);
        }
        StoryWidgets.a aVar = gVar.A;
        if (aVar != null) {
            String str2 = aVar.a;
            if (str2 != null && str2.length() != 0) {
                ((a60) ((ru.yandex.taxi.communications.stories.domain.a) gVar.p.b).I).c(str2, v770.h);
            }
            gVar.A = null;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateShow$lambda$0(StoryModalView storyModalView, Runnable runnable) {
        g gVar = storyModalView.presenter;
        gVar.D = true;
        Story d = gVar.h.d();
        String str = d != null ? d.b : null;
        if (str != null) {
            gVar.j.b(str);
        }
        if (storyModalView.playerProxy.d != null) {
            storyModalView.presenter.r(false);
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToNext$lambda$0(StoryModalView storyModalView) {
        storyModalView.presenter.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToPageBackward$lambda$0(StoryModalView storyModalView, xou0 xou0Var) {
        storyModalView.finishedScrollToPage(xou0Var.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToPageForward$lambda$0(StoryModalView storyModalView, xou0 xou0Var) {
        storyModalView.finishedScrollToPage(xou0Var.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToPrevious$lambda$0(StoryModalView storyModalView) {
        storyModalView.canChangeSecondarySnapshotDuringScroll = true;
        g gVar = storyModalView.presenter;
        ru.yandex.taxi.stories.domain.a aVar = gVar.h;
        aVar.i = Math.max(aVar.i - 1, 0);
        Story d = aVar.d();
        aVar.j = d != null ? d.i.d.size() - 1 : 0;
        Story d2 = gVar.h.d();
        if (d2 != null) {
            gVar.j.b(d2.b);
        }
        gVar.i();
        gVar.r(false);
    }

    private final void animateToVideo() {
        setState(State.ANIMATING_TO_VIDEO);
        bqu0 bqu0Var = this.transitions;
        bqu0Var.l.animate().withLayer().alpha(0.0f).setDuration(300L).setListener(new AnimUtils$AnimationEndListener(new tpt0(11, bqu0Var, new you0(this, 0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateToVideo$lambda$0(StoryModalView storyModalView) {
        storyModalView.animatedToVideo = true;
        storyModalView.resumePlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canScrollPageTo(StoryAnimationDirection animationDirection) {
        ru.yandex.taxi.stories.domain.a aVar;
        Story d;
        ru.yandex.taxi.stories.domain.a aVar2;
        Story d2;
        if (animationDirection == StoryAnimationDirection.NEXT && (d2 = (aVar2 = this.presenter.h).d()) != null && g.l(d2) == StoryMediaInfo$PagerMode.DOTS && aVar2.f()) {
            return true;
        }
        return animationDirection == StoryAnimationDirection.PREVIOUS && (d = (aVar = this.presenter.h).d()) != null && g.l(d) == StoryMediaInfo$PagerMode.DOTS && aVar.j > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canScrollTo(StoryAnimationDirection animationDirection) {
        if (animationDirection != StoryAnimationDirection.NEXT || this.presenter.h.g() == null) {
            if (animationDirection != StoryAnimationDirection.PREVIOUS) {
                return false;
            }
            ru.yandex.taxi.stories.domain.a aVar = this.presenter.h;
            if (((Story) kotlin.collections.a.S(aVar.i - 1, aVar.h)) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelDismiss() {
        setState(State.SETTLING_DISMISS_SCROLL);
        bqu0 bqu0Var = this.transitions;
        float f = this.dismissScrollPercent;
        you0 you0Var = new you0(this, 4);
        bqu0Var.getClass();
        bqu0Var.g(bqu0Var.b(f, 0.0f, 300L, new fsf0(bqu0Var, 2)), true, null, you0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelDismiss$lambda$0(StoryModalView storyModalView) {
        State state = storyModalView.stateBeforeScroll;
        State state2 = State.ERROR;
        if (state == state2) {
            storyModalView.setState(state2);
        } else {
            storyModalView.resumePlayback();
        }
    }

    private final void cancelImageLoadingRequest() {
        lbm lbmVar = this.imageLoadingRequest;
        if (lbmVar != null) {
            nac nacVar = (nac) lbmVar;
            nacVar.h = new omu0(1);
            nacVar.i = new bmu0(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 cancelImageLoadingRequest$lambda$0$0(Drawable drawable) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeClicked() {
        this.snapshotMain.animate().cancel();
        g gVar = this.presenter;
        PromoBannerActivationStatus promoBannerActivationStatus = gVar.B;
        if (promoBannerActivationStatus != null) {
            gVar.t.a(promoBannerActivationStatus);
            gVar.B = null;
        }
        ru.yandex.taxi.stories.domain.a aVar = gVar.h;
        Story d = aVar.d();
        if (d != null) {
            ((n9y0) aVar.c).f(d, aVar.f.a, aVar.c(), aVar.j, null);
        }
        gVar.j();
    }

    private final void drawVideoFrame(Canvas canvas) {
        Bitmap bitmap;
        if (this.currentMediaType == MediaType.VIDEO && this.firstFrameRendered && this.animatedToVideo) {
            View videoSurfaceView = this.playerView.getVideoSurfaceView();
            TextureView textureView = videoSurfaceView instanceof TextureView ? (TextureView) videoSurfaceView : null;
            if (textureView == null || (bitmap = textureView.getBitmap()) == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                return;
            }
            float max = Math.max(canvas.getWidth() / bitmap.getWidth(), canvas.getHeight() / bitmap.getHeight());
            float width = bitmap.getWidth() * max;
            float height = bitmap.getHeight() * max;
            float width2 = (canvas.getWidth() - width) / 2.0f;
            float height2 = (canvas.getHeight() - height) / 2.0f;
            canvas.drawBitmap(bitmap, (Rect) null, new RectF(width2, height2, width + width2, height + height2), (Paint) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishedScrollToNextPage() {
        this.presenter.m(this.transitions.r(), false, true);
    }

    private final void finishedScrollToPage(int page) {
        this.canChangeSecondarySnapshotDuringScroll = true;
        g gVar = this.presenter;
        gVar.h.j = page;
        gVar.r(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishedScrollToPreviousPage() {
        this.presenter.o(this.transitions.r(), true);
    }

    private final long getPlaybackDuration() {
        int i = d.b[this.currentMediaType.ordinal()];
        if (i == 1) {
            return this.playerProxy.a();
        }
        if (i == 2) {
            return this.imagePlaybackController.d;
        }
        if (i == 3) {
            oi2 oi2Var = this.animationPlaybackController;
            return oi2Var.c ? oi2Var.b.d : oi2Var.a.getDuration();
        }
        w511.b();
        return 0L;
    }

    private final long getPlaybackPosition() {
        int i = d.b[this.currentMediaType.ordinal()];
        if (i == 1) {
            androidx.media3.exoplayer.f fVar = this.playerProxy.d;
            if (fVar != null) {
                return fVar.getCurrentPosition();
            }
            return 0L;
        }
        if (i == 2) {
            return this.imagePlaybackController.e;
        }
        if (i != 3) {
            w511.b();
            return 0L;
        }
        oi2 oi2Var = this.animationPlaybackController;
        LottieAnimationView lottieAnimationView = oi2Var.a;
        return oi2Var.c ? oi2Var.b.e : ((float) lottieAnimationView.getFrame()) == lottieAnimationView.getMaxFrame() ? lottieAnimationView.getDuration() : (long) (lottieAnimationView.getProgress() * lottieAnimationView.getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getPlaybackProgress() {
        long playbackPosition = getPlaybackPosition();
        long playbackDuration = getPlaybackDuration();
        if (playbackDuration > 0) {
            return playbackPosition / playbackDuration;
        }
        return 1.0f;
    }

    private final Bitmap getScreenshot() {
        try {
            View view = this.content;
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(this.mediaInfoMain.d);
            drawVideoFrame(canvas);
            view.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to take screenshot");
            return null;
        }
    }

    private final Window getWindow() {
        Context context = this.context;
        if (context instanceof Activity) {
            return ((Activity) context).getWindow();
        }
        return null;
    }

    private final void initPlayer() {
        this.playerProxy.b();
        if (this.userEnabledAudio) {
            ru.yandex.taxi.audio.a aVar = this.audioController;
            if (aVar.c) {
                aVar.b.setVolume(1.0f);
            }
        }
        this.playerPositionUpdater = new bzc0(this, new you0(this, 12));
        this.playerView.setPlayer(this.playerProxy.d);
        if (this.state == State.RESET) {
            this.presenter.r(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(StoryModalView storyModalView, t1w t1wVar) {
        xw31.L(t1wVar.b, storyModalView.topViewMain);
        StoryTopView storyTopView = storyModalView.topViewSecondary;
        int i = t1wVar.g;
        xw31.L(i, storyTopView);
        xw31.y(i, storyModalView.contentViewMain);
        xw31.y(i, storyModalView.contentViewSecondary);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$0(StoryModalView storyModalView, pey peyVar, Lifecycle.Event event) {
        int i = d.a[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            g gVar = storyModalView.presenter;
            boolean z = gVar.c;
            gVar.c = false;
            if (z && !jl40.l(gVar.a, gVar.b)) {
                gVar.a();
            }
            storyModalView.updateMainSnapshotWithCurrentFrame();
            storyModalView.resetPlayer();
            return;
        }
        g gVar2 = storyModalView.presenter;
        boolean z2 = gVar2.c;
        gVar2.c = true;
        if (!z2 && !jl40.l(gVar2.a, gVar2.b)) {
            gVar2.b();
        }
        storyModalView.initPlayer();
        if (storyModalView.userEnabledAudio) {
            storyModalView.audioController.b();
        }
    }

    private final void loadImage(RoundedCornersImageView imageView, String imageUrl, tls onImageLoaded) {
        imageView.setImageDrawable(null);
        if (imageUrl != null) {
            nac nacVar = (nac) this.imageLoader.a(imageView);
            nacVar.h = onImageLoaded;
            nacVar.c(imageUrl);
        }
    }

    private final boolean needToLoadImage(xou0 previousMediaInfo, String url) {
        return (this.mainSnapshotSetFromMediaInfo && cvu0.p(url, previousMediaInfo.e)) ? false : true;
    }

    private final void notifyPresenterLoadingIndicatorVisibility() {
        g gVar = this.presenter;
        boolean z = false;
        boolean z2 = this.loadingIndicator.getVisibility() == 0;
        State state = this.state;
        if (state != State.ERROR && state != State.RESET) {
            z = true;
        }
        gVar.q(z2, z);
    }

    private final void onPlayMedia(MediaType mediaType, xou0 storyMediaInfo) {
        this.currentMediaType = mediaType;
        this.firstFrameRendered = false;
        this.playbackMediaLoaded = false;
        xou0 xou0Var = this.mediaInfoMain;
        this.mediaInfoMain = storyMediaInfo;
        setState(State.BUFFERING);
        updateViewsVisibility();
        setMainMediaInfo(xou0Var, storyMediaInfo, mediaType != MediaType.IMAGE);
        scheduleLoadingIndicatorUpdate();
        this.playerProxy.c(false);
        cancelImageLoadingRequest();
        this.imagePlaybackController.f = false;
        oi2 oi2Var = this.animationPlaybackController;
        oi2Var.b.f = false;
        oi2Var.a.pauseAnimation();
        pzt0 pzt0Var = this.presenter.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    private final void onPlaybackImageLoaded() {
        this.playbackMediaLoaded = true;
        resumePlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPlayerPositionChanged() {
        float playbackProgress = getPlaybackProgress();
        this.topViewMain.setCurrentMediaProgressPercent(playbackProgress);
        g gVar = this.presenter;
        long playbackPosition = getPlaybackPosition();
        ru.yandex.taxi.stories.domain.a aVar = gVar.h;
        aVar.m = playbackProgress;
        aVar.n = playbackPosition;
    }

    private final void onSecondaryBackgroundLoaded(xou0 storyMediaInfo) {
        PromotionBackground promotionBackground = storyMediaInfo.p;
        if (promotionBackground == null || promotionBackground.a != PromotionBackground.Type.IMAGE) {
            return;
        }
        xou0 xou0Var = this.mediaInfoSecondary;
        zxs0 zxs0Var = xou0Var.a;
        zxs0 zxs0Var2 = xou0Var.b;
        StoryWidgets storyWidgets = xou0Var.c;
        int i = xou0Var.d;
        String str = xou0Var.e;
        boolean z = xou0Var.f;
        int i2 = xou0Var.g;
        int i3 = xou0Var.h;
        long j = xou0Var.i;
        Story.c cVar = xou0Var.j;
        StoryMediaInfo$PagerMode storyMediaInfo$PagerMode = xou0Var.k;
        boolean z2 = xou0Var.l;
        Story.g gVar = xou0Var.n;
        boolean z3 = xou0Var.o;
        PromotionBackground promotionBackground2 = xou0Var.p;
        owd0 owd0Var = xou0Var.q;
        xou0Var.getClass();
        this.mediaInfoSecondary = new xou0(zxs0Var, zxs0Var2, storyWidgets, i, str, z, i2, i3, j, cVar, storyMediaInfo$PagerMode, z2, true, gVar, z3, promotionBackground2, owd0Var);
        updateViewsVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 playImage$lambda$0(StoryModalView storyModalView, Drawable drawable) {
        storyModalView.onPlaybackImageLoaded();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 playImage$lambda$1(StoryModalView storyModalView) {
        xby.d.n("Failed loading image");
        storyModalView.onPlaybackError();
        return zy11.a;
    }

    private final fpu0 prepareBeforeTakingScreenshot() {
        fpu0 fpu0Var = new fpu0(this.playerView.getVisibility(), this.topViewMain.getVisibility());
        this.topViewMain.setVisibility(4);
        zxc0 player = this.playerView.getPlayer();
        if (player != null) {
            player.pause();
        }
        this.playerView.setVisibility(4);
        this.contentViewMain.getButtonsContainer().setVisibility(4);
        return fpu0Var;
    }

    private final void preparePageScroll(xou0 storyMediaInfo) {
        updateMainSnapshotWithCurrentFrame();
        setSecondaryMediaInfo(storyMediaInfo);
        setState(State.SETTLING_PAGE_SCROLL);
        setScroll(0.0f);
    }

    private final void prepareStoryScroll(xou0 storyMediaInfo) {
        updateMainSnapshotWithCurrentFrame();
        setSecondaryMediaInfo(storyMediaInfo);
        setState(State.SETTLING_STORIES_SCROLL);
        setScroll(0.0f);
    }

    private final void resetPlayer() {
        State state = this.state;
        State state2 = State.RESET;
        if (state == state2) {
            return;
        }
        this.playerView.setPlayer(null);
        ioo iooVar = this.playerProxy;
        androidx.media3.exoplayer.f fVar = iooVar.d;
        if (fVar != null) {
            fVar.removeListener(iooVar.b);
            fVar.release();
        }
        iooVar.d = null;
        this.audioController.a();
        bzc0 bzc0Var = this.playerPositionUpdater;
        if (bzc0Var != null) {
            bzc0Var.c = false;
        }
        this.playerPositionUpdater = null;
        cancelImageLoadingRequest();
        this.imagePlaybackController.f = false;
        oi2 oi2Var = this.animationPlaybackController;
        oi2Var.b.f = false;
        oi2Var.a.pauseAnimation();
        pzt0 pzt0Var = this.presenter.E;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        setState(state2);
    }

    private final void resetStatusBarColor() {
        if (getWindow() != null) {
            gou0 gou0Var = this.presenter.f;
        }
    }

    private final void resolveStatusBarColor() {
        if (getWindow() != null) {
            gou0 gou0Var = this.presenter.f;
        }
    }

    private final void restoreAfterTakingScreenshot(fpu0 state) {
        this.topViewMain.setVisibility(state.b);
        this.playerView.setVisibility(state.a);
        this.contentViewMain.getButtonsContainer().setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeLottieAnimationFromBeginning() {
        this.animationView.setProgress(0.0f);
        resumePlayback();
    }

    private final void resumeVideoPlayback() {
        if (this.firstFrameRendered && this.needAnimateToVideo && !this.animatedToVideo) {
            animateToVideo();
            return;
        }
        ioo iooVar = this.playerProxy;
        if (iooVar.d != null) {
            iooVar.c(true);
            androidx.media3.exoplayer.f fVar = this.playerProxy.d;
            setState((fVar != null ? fVar.getPlaybackState() : 4) == 2 ? State.BUFFERING : State.PLAYING);
        }
    }

    private final void scheduleLoadingIndicatorUpdate() {
        if (this.attached) {
            postDelayed(new you0(this, 3), 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleLoadingIndicatorUpdate$lambda$0(StoryModalView storyModalView) {
        storyModalView.loadingIndicatorUpdateRunnable.run();
        storyModalView.setAccessibilityFocusToCloseBtn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollAnimationCanceled() {
        State state = this.stateBeforeScroll;
        State state2 = State.ERROR;
        if (state == state2) {
            setState(state2);
        } else {
            resumePlayback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StoryAnimationDirection scrollToDirection(float scroll) {
        return isRtl() ? scroll > 0.0f ? StoryAnimationDirection.NEXT : StoryAnimationDirection.PREVIOUS : scroll < 0.0f ? StoryAnimationDirection.NEXT : StoryAnimationDirection.PREVIOUS;
    }

    private final void setAccessibilityFocusToCloseBtn() {
        if (this.isFirstPage) {
            this.isFirstPage = false;
            this.topViewMain.findViewById(ndh0.close).performAccessibilityAction(64, null);
        }
    }

    private final void setAnimationVisible() {
        if (this.currentMediaType == MediaType.ANIMATION) {
            this.animationContainer.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setLoadingIndicatorVisibleIfNeeded() {
        boolean z;
        State state;
        g gVar;
        MediaType mediaType = this.currentMediaType;
        MediaType mediaType2 = MediaType.VIDEO;
        if (mediaType == mediaType2) {
            androidx.media3.exoplayer.f fVar = this.playerProxy.d;
            if ((fVar != null ? fVar.getPlaybackState() : 4) == 2) {
                z = true;
                boolean z2 = this.currentMediaType == mediaType2 && !this.playbackMediaLoaded && this.state == State.BUFFERING;
                state = this.state;
                if (state != State.BUFFERING || state == State.ANIMATING_TO_VIDEO || z || z2) {
                    gVar = this.presenter;
                    if (gVar.i.uptimeMillis() - gVar.C <= 500) {
                        this.loadingIndicator.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (this.currentMediaType == mediaType2) {
        }
        state = this.state;
        if (state != State.BUFFERING) {
        }
        gVar = this.presenter;
        if (gVar.i.uptimeMillis() - gVar.C <= 500) {
        }
    }

    private final void setMainMediaInfo(xou0 previousMediaInfo, xou0 storyMediaInfo, boolean shouldLoadImage) {
        if (storyMediaInfo == null) {
            return;
        }
        String str = storyMediaInfo.e;
        int i = 1;
        boolean z = needToLoadImage(previousMediaInfo, str) || str == null || evu0.J(str);
        if (shouldLoadImage || z) {
            this.mainSnapshotSetFromMediaInfo = false;
            loadImage(this.snapshotMain, str, new zou0(this, i));
        }
        this.snapshotMain.setRoundedBackgroundColor(storyMediaInfo.d);
        if (storyMediaInfo.l) {
            this.contentViewMain.copyMedia(this.contentViewSecondary);
        }
        this.contentViewMain.setData(storyMediaInfo);
        this.topViewMain.setData(storyMediaInfo);
        this.mediaInfoMain = storyMediaInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setMainMediaInfo$lambda$0(StoryModalView storyModalView, Drawable drawable) {
        storyModalView.mainSnapshotSetFromMediaInfo = true;
        return zy11.a;
    }

    private final void setPageContentVisibility() {
        MediaType mediaType = this.currentMediaType;
        MediaType mediaType2 = MediaType.VIDEO;
        if (!(mediaType == mediaType2 && this.firstFrameRendered) && ((mediaType == mediaType2 || !this.playbackMediaLoaded) && !this.mediaInfoMain.m)) {
            return;
        }
        this.contentViewMain.setVisibility(0);
    }

    private final void setPlayerVisible() {
        int i = d.b[this.currentMediaType.ordinal()];
        if (i == 1) {
            this.playerContainer.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.snapshotMain.setVisibility(0);
        } else if (i == 3) {
            this.animationContainer.setVisibility(0);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScroll(float scroll) {
        float f = this.scroll;
        boolean z = (f >= 0.0f && scroll < 0.0f) || (f <= 0.0f && scroll > 0.0f);
        if (this.canChangeSecondarySnapshotDuringScroll && z) {
            State state = this.state;
            if (state == State.SCROLLING_PAGE || state == State.SETTLING_PAGE_SCROLL) {
                setSecondaryPageSnapshot(scrollToDirection(scroll));
            } else {
                setSecondaryStorySnapshot(scrollToDirection(scroll));
            }
        }
        this.scroll = scroll;
        State state2 = this.state;
        if (state2 == State.SCROLLING_PAGE || state2 == State.SETTLING_PAGE_SCROLL) {
            updatePager();
        }
    }

    private final void setSecondaryMediaInfo(xou0 storyMediaInfo) {
        if (storyMediaInfo == null) {
            return;
        }
        this.mediaInfoSecondary = storyMediaInfo;
        loadImage(this.snapshotSecondary, storyMediaInfo.e, new scs0(29, this, storyMediaInfo));
        this.snapshotSecondary.setRoundedBackgroundColor(storyMediaInfo.d);
        this.contentViewSecondary.setData(storyMediaInfo);
        this.topViewSecondary.setData(storyMediaInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setSecondaryMediaInfo$lambda$0(StoryModalView storyModalView, xou0 xou0Var, Drawable drawable) {
        storyModalView.onSecondaryBackgroundLoaded(xou0Var);
        return zy11.a;
    }

    private final void setSecondaryPageContentVisibility() {
        if (this.mediaInfoSecondary.m) {
            this.contentViewSecondary.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSecondaryPageSnapshot(StoryAnimationDirection animationDirection) {
        StoryAnimationDirection storyAnimationDirection = StoryAnimationDirection.NEXT;
        g gVar = this.presenter;
        if (animationDirection == storyAnimationDirection) {
            ru.yandex.taxi.stories.domain.a aVar = gVar.h;
            Story d = aVar.d();
            setSecondaryMediaInfo(d != null ? gVar.k(d, aVar.j + 1, false) : null);
        } else {
            Story d2 = gVar.h.d();
            setSecondaryMediaInfo(d2 != null ? gVar.k(d2, r5.j - 1, false) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSecondaryStorySnapshot(StoryAnimationDirection animationDirection) {
        StoryAnimationDirection storyAnimationDirection = StoryAnimationDirection.NEXT;
        g gVar = this.presenter;
        if (animationDirection == storyAnimationDirection) {
            Story g = gVar.h.g();
            setSecondaryMediaInfo(g != null ? gVar.k(g, 0, false) : null);
        } else {
            Story story = (Story) kotlin.collections.a.S(r5.i - 1, gVar.h.h);
            setSecondaryMediaInfo(story != null ? gVar.k(story, 0, false) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        if (this.state == state) {
            notifyPresenterLoadingIndicatorVisibility();
            return;
        }
        if (state == State.PLAYING) {
            this.playerProxy.c(true);
            g gVar = this.presenter;
            tje.N(gVar.e(), null, null, new StoryPresenter$playbackResumed$1(gVar, null), 3);
        }
        State state2 = this.state;
        State state3 = State.SCROLLING_PAGE;
        if ((state2 == state3 || state2 == State.SETTLING_PAGE_SCROLL) && state != state3 && state != State.SETTLING_PAGE_SCROLL) {
            this.topViewMain.pageScrollFinished();
        }
        this.state = state;
        vby vbyVar = xby.d;
        String.format("story view state changed %s", Arrays.copyOf(new Object[]{state}, 1));
        vbyVar.getClass();
        updateViewsVisibility();
        updatePositionRunnableState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settlePageScroll(boolean afterFling, StoryAnimationDirection animationDirection) {
        setState(State.SETTLING_PAGE_SCROLL);
        if (!afterFling && Math.abs(this.scroll) < getWidth() / 2.0f) {
            bqu0 bqu0Var = this.transitions;
            you0 you0Var = new you0(this, 9);
            bqu0Var.getClass();
            bqu0Var.p(0.0f, new aqu0(bqu0Var, 4), you0Var);
            return;
        }
        StoryAnimationDirection storyAnimationDirection = StoryAnimationDirection.NEXT;
        bqu0 bqu0Var2 = this.transitions;
        int i = 2;
        if (animationDirection == storyAnimationDirection) {
            you0 you0Var2 = new you0(this, 10);
            bqu0Var2.getClass();
            aqu0 aqu0Var = new aqu0(bqu0Var2, 3);
            boolean n = xw31.n(bqu0Var2.g.getContext());
            ModalView modalView = bqu0Var2.a;
            bqu0Var2.p(n ? modalView.getWidth() : -modalView.getWidth(), aqu0Var, new zpu0(bqu0Var2, you0Var2, i));
            return;
        }
        you0 you0Var3 = new you0(this, 11);
        bqu0Var2.getClass();
        aqu0 aqu0Var2 = new aqu0(bqu0Var2, i);
        boolean n2 = xw31.n(bqu0Var2.g.getContext());
        ModalView modalView2 = bqu0Var2.a;
        bqu0Var2.p(n2 ? -modalView2.getWidth() : modalView2.getWidth(), aqu0Var2, new zpu0(bqu0Var2, you0Var3, 1));
    }

    private final void settleScrollForDismiss() {
        if (this.dismissScrollPercent < 0.5d) {
            cancelDismiss();
        } else {
            this.presenter.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settleStoryScroll(boolean afterFling, StoryAnimationDirection animationDirection) {
        setState(State.SETTLING_STORIES_SCROLL);
        if (!afterFling && Math.abs(this.scroll) < getWidth() / 2.0f) {
            bqu0 bqu0Var = this.transitions;
            you0 you0Var = new you0(this, 6);
            bqu0Var.getClass();
            bqu0Var.p(0.0f, new aqu0(bqu0Var, 0), you0Var);
            return;
        }
        StoryAnimationDirection storyAnimationDirection = StoryAnimationDirection.NEXT;
        bqu0 bqu0Var2 = this.transitions;
        int i = 1;
        if (animationDirection == storyAnimationDirection) {
            you0 you0Var2 = new you0(this, 7);
            bqu0Var2.getClass();
            aqu0 aqu0Var = new aqu0(bqu0Var2, i);
            boolean n = xw31.n(bqu0Var2.g.getContext());
            ModalView modalView = bqu0Var2.a;
            bqu0Var2.p(n ? modalView.getWidth() : -modalView.getWidth(), aqu0Var, new zpu0(bqu0Var2, you0Var2, 2));
            return;
        }
        you0 you0Var3 = new you0(this, 8);
        bqu0Var2.getClass();
        aqu0 aqu0Var2 = new aqu0(bqu0Var2, 5);
        boolean n2 = xw31.n(bqu0Var2.g.getContext());
        ModalView modalView2 = bqu0Var2.a;
        bqu0Var2.p(n2 ? -modalView2.getWidth() : modalView2.getWidth(), aqu0Var2, new zpu0(bqu0Var2, you0Var3, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void settleStoryScroll$lambda$1(StoryModalView storyModalView) {
        storyModalView.presenter.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void settleStoryScroll$lambda$2(StoryModalView storyModalView) {
        g gVar = storyModalView.presenter;
        ru.yandex.taxi.stories.domain.a aVar = gVar.h;
        aVar.i = Math.max(aVar.i - 1, 0);
        aVar.j = 0;
        Story d = gVar.h.d();
        if (d != null) {
            gVar.j.b(d.b);
        }
        gVar.i();
        gVar.r(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPageScroll(float scroll) {
        setSecondaryPageSnapshot(scrollToDirection(scroll));
        setState(State.SCROLLING_PAGE);
        updateMainSnapshotWithCurrentFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startStoriesScroll(float scroll) {
        setState(State.SCROLLING_STORIES);
        updateMainSnapshotWithCurrentFrame();
        setSecondaryStorySnapshot(scrollToDirection(scroll));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMainSnapshotWithCurrentFrame() {
        if (this.currentMediaType == MediaType.VIDEO && this.firstFrameRendered && this.animatedToVideo) {
            View videoSurfaceView = this.playerView.getVideoSurfaceView();
            TextureView textureView = videoSurfaceView instanceof TextureView ? (TextureView) videoSurfaceView : null;
            this.snapshotMain.setImageBitmap(textureView != null ? textureView.getBitmap() : null);
            this.mainSnapshotSetFromMediaInfo = false;
        }
    }

    private final void updatePager() {
        int width = getWidth();
        int i = this.presenter.h.j;
        if (width == 0) {
            this.topViewMain.setPageScroll(i, 0.0f);
            return;
        }
        int abs = Math.abs(this.mediaInfoMain.h - this.mediaInfoSecondary.h);
        if (abs < 1) {
            abs = 1;
        }
        float f = ((-this.scroll) * abs) / width;
        if (isRtl()) {
            f = -f;
        }
        while (f > 1.0f) {
            i++;
            f -= 1.0f;
        }
        while (f < 0.0f) {
            i--;
            f += 1.0f;
        }
        this.topViewMain.setPageScroll(i, f);
    }

    private final void updatePositionRunnableState() {
        bzc0 bzc0Var = this.playerPositionUpdater;
        if (bzc0Var != null) {
            State state = this.state;
            if ((state != State.BUFFERING || this.currentMediaType == MediaType.ANIMATION) && state != State.PLAYING) {
                bzc0Var.c = false;
            } else {
                bzc0Var.c = true;
                bzc0Var.a.postOnAnimation(bzc0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewsVisibility() {
        this.playerContainer.setVisibility(4);
        this.animationContainer.setVisibility(4);
        this.snapshotMain.setVisibility(4);
        this.snapshotSecondary.setVisibility(4);
        this.contentViewMain.setVisibility(4);
        this.topViewMain.setVisibility(4);
        this.contentViewSecondary.setVisibility(4);
        this.topViewSecondary.setVisibility(4);
        this.loadingIndicator.setVisibility(4);
        this.retryIcon.setVisibility(4);
        switch (d.c[this.state.ordinal()]) {
            case 1:
                this.snapshotMain.setVisibility(0);
                this.snapshotSecondary.setVisibility(0);
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                break;
            case 2:
            case 3:
            case 4:
                this.snapshotMain.setVisibility(0);
                this.snapshotSecondary.setVisibility(0);
                setAnimationVisible();
                this.topViewMain.setVisibility(0);
                setLoadingIndicatorVisibleIfNeeded();
                setPageContentVisibility();
                break;
            case 5:
                this.snapshotMain.setVisibility(0);
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                break;
            case 6:
                if (!this.firstFrameRendered) {
                    this.snapshotMain.setVisibility(0);
                }
                setPlayerVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                setLoadingIndicatorVisibleIfNeeded();
                break;
            case 7:
                this.snapshotMain.setVisibility(0);
                setPlayerVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                setLoadingIndicatorVisibleIfNeeded();
                break;
            case 8:
                setPlayerVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                break;
            case 9:
                if (!this.firstFrameRendered || !this.animatedToVideo) {
                    this.snapshotMain.setVisibility(0);
                }
                setPlayerVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                setLoadingIndicatorVisibleIfNeeded();
                break;
            case 10:
            case 11:
                this.snapshotMain.setVisibility(0);
                this.snapshotSecondary.setVisibility(0);
                setAnimationVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                setSecondaryPageContentVisibility();
                setLoadingIndicatorVisibleIfNeeded();
                break;
            case 12:
            case 13:
                this.isFirstPage = true;
                this.snapshotMain.setVisibility(0);
                this.snapshotSecondary.setVisibility(0);
                setAnimationVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                setSecondaryPageContentVisibility();
                this.topViewSecondary.setVisibility(0);
                setLoadingIndicatorVisibleIfNeeded();
                break;
            case 14:
                if (!this.firstFrameRendered || !this.animatedToVideo) {
                    this.snapshotMain.setVisibility(0);
                }
                setPlayerVisible();
                this.topViewMain.setVisibility(0);
                setPageContentVisibility();
                this.retryIcon.setVisibility(0);
                break;
            default:
                w511.b();
                return;
        }
        notifyPresenterLoadingIndicatorVisibility();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        this.transitions.q();
        if (this.state != State.SCROLL_FOR_DISMISS) {
            this.dismissScrollPercent = 0.0f;
            updateMainSnapshotWithCurrentFrame();
        }
        setState(State.SETTLING_DISMISS_SCROLL);
        this.transitions.a(this.dismissScrollPercent, startAction, new apu0(this, endAction, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        xou0 xou0Var = this.mediaInfoMain;
        g gVar = this.presenter;
        Story d = gVar.h.d();
        int i = 0;
        setMainMediaInfo(xou0Var, d != null ? gVar.k(d, 0, false) : null, true);
        bqu0 bqu0Var = this.transitions;
        apu0 apu0Var = new apu0(this, onAnimateShowEndAction, i);
        bqu0Var.d();
        long j = bqu0Var.v;
        if (j == -1) {
            j = 300;
        }
        bqu0Var.g(bqu0Var.b(0.0f, 1.0f, j, new x5s0(9, bqu0Var)), true, null, apu0Var);
    }

    @Override // defpackage.gpu0
    public void animateToNext(xou0 storyMediaInfo) {
        prepareStoryScroll(storyMediaInfo);
        bqu0 bqu0Var = this.transitions;
        you0 you0Var = new you0(this, 5);
        bqu0Var.getClass();
        aqu0 aqu0Var = new aqu0(bqu0Var, 1);
        boolean n = xw31.n(bqu0Var.g.getContext());
        ModalView modalView = bqu0Var.a;
        bqu0Var.p(n ? modalView.getWidth() : -modalView.getWidth(), aqu0Var, new zpu0(bqu0Var, you0Var, 2));
    }

    @Override // defpackage.gpu0
    public void animateToPageBackward(xou0 storyMediaInfo) {
        this.canChangeSecondarySnapshotDuringScroll = false;
        preparePageScroll(storyMediaInfo);
        bqu0 bqu0Var = this.transitions;
        bpu0 bpu0Var = new bpu0(this, storyMediaInfo, 0);
        bqu0Var.getClass();
        aqu0 aqu0Var = new aqu0(bqu0Var, 2);
        boolean n = xw31.n(bqu0Var.g.getContext());
        ModalView modalView = bqu0Var.a;
        bqu0Var.p(n ? -modalView.getWidth() : modalView.getWidth(), aqu0Var, new zpu0(bqu0Var, bpu0Var, 1));
    }

    @Override // defpackage.gpu0
    public void animateToPageForward(xou0 storyMediaInfo) {
        this.canChangeSecondarySnapshotDuringScroll = false;
        preparePageScroll(storyMediaInfo);
        bqu0 bqu0Var = this.transitions;
        bpu0 bpu0Var = new bpu0(this, storyMediaInfo, 1);
        bqu0Var.getClass();
        aqu0 aqu0Var = new aqu0(bqu0Var, 3);
        boolean n = xw31.n(bqu0Var.g.getContext());
        ModalView modalView = bqu0Var.a;
        bqu0Var.p(n ? modalView.getWidth() : -modalView.getWidth(), aqu0Var, new zpu0(bqu0Var, bpu0Var, 2));
    }

    @Override // defpackage.gpu0
    public void animateToPrevious(xou0 storyMediaInfo) {
        prepareStoryScroll(storyMediaInfo);
        this.canChangeSecondarySnapshotDuringScroll = false;
        bqu0 bqu0Var = this.transitions;
        you0 you0Var = new you0(this, 13);
        bqu0Var.getClass();
        aqu0 aqu0Var = new aqu0(bqu0Var, 5);
        boolean n = xw31.n(bqu0Var.g.getContext());
        ModalView modalView = bqu0Var.a;
        bqu0Var.p(n ? -modalView.getWidth() : modalView.getWidth(), aqu0Var, new zpu0(bqu0Var, you0Var, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
    }

    @Override // defpackage.gpu0
    public void hideNotification() {
        bqu0 bqu0Var = this.transitions;
        bqu0Var.r.animate().withLayer().alpha(0.0f).setDuration(300L);
        bqu0Var.n.translateContent(0.0f, 300L);
        bqu0Var.p.translateContent(0.0f, 300L);
        bqu0Var.o.translateContent(0.0f, 300L);
        bqu0Var.q.translateContent(0.0f, 300L);
    }

    @Override // defpackage.gpu0
    public void hideStoryLoading() {
        this.storyLoadingContainer.setVisibility(8);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new zou0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        g gVar = this.presenter;
        gVar.c(this);
        gVar.h.a.j();
        gnu0 gnu0Var = gVar.j;
        String str = (String) gVar.f.c.get(0);
        Iterator it = gnu0Var.c.iterator();
        while (it.hasNext()) {
            ((fnu0) it.next()).a(str);
        }
        tje.N(gVar.e(), null, null, new StoryPresenter$loadStories$1(gVar, null), 3);
        tje.N(gVar.e(), null, null, new StoryPresenter$attachView$1(gVar, null), 3);
        setState(State.APPEARING);
        this.lifecycle.a(this.lifecycleObserver);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        State state = this.state;
        if (state != State.SETTLING_DISMISS_SCROLL) {
            g gVar = this.presenter;
            if (gVar.f.g || state == State.ERROR) {
                PromoBannerActivationStatus promoBannerActivationStatus = gVar.B;
                if (promoBannerActivationStatus != null) {
                    gVar.t.a(promoBannerActivationStatus);
                    gVar.B = null;
                }
                ru.yandex.taxi.stories.domain.a aVar = gVar.h;
                Story d = aVar.d();
                if (d != null) {
                    ((n9y0) aVar.c).f(d, aVar.f.a, aVar.c(), aVar.j, null);
                }
                gVar.j();
            }
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        this.transitions.q();
        this.presenter.d();
        resetPlayer();
        removeCallbacks(this.loadingIndicatorUpdateRunnable);
        this.lifecycle.d(this.lifecycleObserver);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent event) {
        boolean z;
        State state = this.state;
        if (state != State.SETTLING_STORIES_SCROLL && state != State.SETTLING_PAGE_SCROLL && event.getAction() == 0) {
            if (this.retryIcon.getVisibility() == 0) {
                if (xw31.l((int) event.getRawX(), (int) event.getRawY(), 0, this.retryIcon)) {
                    z = true;
                    boolean z2 = getOverlappingModalViewContainer().getChildCount() == 0;
                    if (!this.contentViewMain.canInterceptTouchEvent(event) && this.topViewMain.canInterceptTouchEvent(event) && !z2 && !z) {
                        return true;
                    }
                }
            }
            z = false;
            if (getOverlappingModalViewContainer().getChildCount() == 0) {
            }
            if (!this.contentViewMain.canInterceptTouchEvent(event)) {
            }
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.userEnabledAudio && this.audioController.c) {
            return false;
        }
        if (keyCode != 24 && keyCode != 25) {
            return false;
        }
        this.userEnabledAudio = true;
        this.audioController.b();
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        resolveStatusBarColor();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        ru.yandex.taxi.stories.domain.a aVar = this.presenter.h;
        if (aVar.g) {
            aVar.i();
            aVar.g = false;
        }
        resetStatusBarColor();
    }

    @Override // defpackage.gpu0
    public void onPlaybackError() {
        State state = this.state;
        if (state == State.BUFFERING || state == State.PLAYING || state == State.PAUSED || state == State.ANIMATING_TO_VIDEO) {
            setState(State.ERROR);
        } else {
            this.stateBeforeScroll = State.ERROR;
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        State state = this.state;
        if (state != State.SETTLING_STORIES_SCROLL && state != State.SETTLING_PAGE_SCROLL) {
            if (event.getAction() == 0) {
                this.ignoreTouchEvents = !j73.y(new State[]{State.PLAYING, State.BUFFERING, State.ERROR}, this.state);
            }
            if (!this.ignoreTouchEvents && !this.gestureDetector.onTouchEvent(event) && j73.y(new Integer[]{1, 3}, Integer.valueOf(event.getAction()))) {
                int i = d.c[this.state.ordinal()];
                if (i == 3) {
                    settleScrollForDismiss();
                } else if (i == 4) {
                    resumePlayback();
                } else if (i == 9) {
                    resumePlayback();
                } else if (i == 10) {
                    settlePageScroll(false, scrollToDirection(this.scroll));
                } else if (i == 12) {
                    settleStoryScroll(false, scrollToDirection(this.scroll));
                }
            }
        }
        return true;
    }

    @Override // defpackage.gpu0
    public void pausePlayback() {
        int i = d.b[this.currentMediaType.ordinal()];
        if (i == 1) {
            this.playerProxy.c(false);
        } else if (i == 2) {
            this.imagePlaybackController.f = false;
        } else if (i != 3) {
            w511.b();
            return;
        } else {
            oi2 oi2Var = this.animationPlaybackController;
            oi2Var.b.f = false;
            oi2Var.a.pauseAnimation();
        }
        this.contentViewMain.pause();
        setState(State.PAUSED);
    }

    @Override // defpackage.gpu0
    public void playAnimation(PromotionBackground mainBackground, xou0 storyMediaInfo) {
        onPlayMedia(MediaType.ANIMATION, storyMediaInfo);
        oi2 oi2Var = this.animationPlaybackController;
        boolean z = mainBackground.d;
        oi2Var.c = z;
        long j = storyMediaInfo.i;
        adv advVar = oi2Var.b;
        advVar.d = j;
        advVar.e = 0L;
        advVar.f = false;
        this.needAnimateToVideo = false;
        this.animatedToVideo = true;
        this.animationView.setRepeatCount(z ? -1 : 0);
        this.animationBackground.setBackgroundColor(storyMediaInfo.d);
        this.contentViewMain.updateContentAccessibility(mainBackground.c);
    }

    @Override // defpackage.gpu0
    public void playColor(xou0 storyMediaInfo) {
        onPlayMedia(MediaType.IMAGE, storyMediaInfo);
        this.needAnimateToVideo = false;
        this.animatedToVideo = true;
        adv advVar = this.imagePlaybackController;
        advVar.d = storyMediaInfo.i;
        advVar.e = 0L;
        advVar.f = false;
        this.playbackMediaLoaded = true;
        resumePlayback();
    }

    @Override // defpackage.gpu0
    public void playImage(PromotionBackground mainBackground, xou0 storyMediaInfo) {
        xou0 xou0Var = this.mediaInfoMain;
        String str = mainBackground.b;
        onPlayMedia(MediaType.IMAGE, storyMediaInfo);
        this.needAnimateToVideo = false;
        int i = 1;
        this.animatedToVideo = true;
        adv advVar = this.imagePlaybackController;
        advVar.d = storyMediaInfo.i;
        advVar.e = 0L;
        advVar.f = false;
        if (needToLoadImage(xou0Var, str) || evu0.J(str)) {
            this.snapshotMain.setImageDrawable(null);
            nac nacVar = (nac) this.imageLoader.a(this.snapshotMain);
            nacVar.h = new zou0(this, 2);
            nacVar.i = new ogu0(i, this);
            nacVar.a();
            nacVar.c(str);
            this.imageLoadingRequest = nacVar;
        } else {
            onPlaybackImageLoaded();
        }
        this.contentViewMain.updateContentAccessibility(mainBackground.c);
    }

    @Override // defpackage.gpu0
    public void playVideo(uf10 mediaSource, xou0 storyMediaInfo) {
        onPlayMedia(MediaType.VIDEO, storyMediaInfo);
        boolean z = storyMediaInfo.f;
        this.needAnimateToVideo = z;
        this.animatedToVideo = !z;
        androidx.media3.exoplayer.f fVar = this.playerProxy.d;
        if (fVar != null) {
            fVar.setMediaSource(mediaSource);
            fVar.prepare();
        }
    }

    @Override // defpackage.gpu0
    public void resumePlayback() {
        int i = d.b[this.currentMediaType.ordinal()];
        if (i == 1) {
            resumeVideoPlayback();
        } else if (i == 2) {
            this.imagePlaybackController.a();
            setState(State.PLAYING);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            oi2 oi2Var = this.animationPlaybackController;
            if (oi2Var.c) {
                oi2Var.b.a();
            }
            oi2Var.a.resumeAnimation();
            setState(State.PLAYING);
        }
        this.contentViewMain.resume();
    }

    @Override // defpackage.gpu0
    public void setLottieComposition(nsz composition) {
        this.playbackMediaLoaded = true;
        chb1.f(this.animationView, composition, new you0(this, 2));
    }

    @Override // defpackage.gpu0
    public void shareScreen(String text) {
        Uri uri;
        fpu0 prepareBeforeTakingScreenshot = prepareBeforeTakingScreenshot();
        Bitmap screenshot = getScreenshot();
        restoreAfterTakingScreenshot(prepareBeforeTakingScreenshot);
        if (screenshot != null) {
            uri = zbb1.c(this.context, screenshot, text);
            screenshot.recycle();
        } else {
            uri = null;
        }
        if (uri == null) {
            return;
        }
        ClipData clipData = new ClipData(null, new String[]{"image/png"}, new ClipData.Item(text, null, null, uri));
        Intent type = new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", text).putExtra("android.intent.extra.STREAM", uri).addFlags(1).setType("image/png");
        type.setClipData(clipData);
        this.context.startActivity(Intent.createChooser(type, null));
    }

    @Override // defpackage.gpu0
    public void shareText(String text) {
        this.context.startActivity(Intent.createChooser(new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", text).setType("text/plain"), null));
    }

    @Override // defpackage.gpu0
    public void showNotification(String message) {
        this.notificationView.setText(message);
        bqu0 bqu0Var = this.transitions;
        bqu0Var.r.animate().withLayer().alpha(1.0f).setDuration(300L);
        float dimension = bqu0Var.g.getResources().getDimension(mrg0.story_notification_height);
        bqu0Var.n.translateContent(dimension, 300L);
        bqu0Var.p.translateContent(dimension, 300L);
        bqu0Var.o.translateContent(dimension, 300L);
        bqu0Var.q.translateContent(dimension, 300L);
    }

    @Override // defpackage.gpu0
    public void showStoryLoading() {
        this.storyLoadingContainer.setVisibility(0);
    }

    @Override // defpackage.gpu0
    public void updateStoryMediaInfo(xou0 storyMediaInfo) {
        this.contentViewMain.setData(storyMediaInfo);
    }

    @Override // defpackage.gpu0
    public FrameLayout getOverlappingModalViewContainer() {
        return this.overlappingModalViewContainer;
    }
}
