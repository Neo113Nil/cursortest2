package ru.yandex.taxi.banners.presentation.fullscreen;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.AudioManager;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.media3.exoplayer.f;
import androidx.media3.ui.PlayerView;
import androidx.viewpager.widget.ViewPager;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.adv;
import defpackage.ais;
import defpackage.b7z0;
import defpackage.beh;
import defpackage.bis;
import defpackage.bzc0;
import defpackage.cay0;
import defpackage.e230;
import defpackage.eis;
import defpackage.evu0;
import defpackage.f600;
import defpackage.fe10;
import defpackage.fsf0;
import defpackage.g9y0;
import defpackage.gep0;
import defpackage.hr4;
import defpackage.idh0;
import defpackage.ioo;
import defpackage.ipg;
import defpackage.ir4;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.klf0;
import defpackage.l9h;
import defpackage.lbh;
import defpackage.ltc;
import defpackage.mph0;
import defpackage.mqg0;
import defpackage.n8s0;
import defpackage.n9y0;
import defpackage.ndh0;
import defpackage.nph0;
import defpackage.och;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pey;
import defpackage.pis;
import defpackage.ptc;
import defpackage.pyc0;
import defpackage.q5z;
import defpackage.qpo;
import defpackage.rah;
import defpackage.rp31;
import defpackage.s1r;
import defpackage.shs;
import defpackage.ssd;
import defpackage.t1w;
import defpackage.td10;
import defpackage.ths;
import defpackage.tje;
import defpackage.tkf0;
import defpackage.tse;
import defpackage.uh6;
import defpackage.uhs;
import defpackage.vfc0;
import defpackage.vhs;
import defpackage.w130;
import defpackage.whs;
import defpackage.xby;
import defpackage.xen;
import defpackage.xhs;
import defpackage.xw31;
import defpackage.yhs;
import defpackage.zdh;
import defpackage.zxc0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.design.DotsIndicatorComponent;
import ru.yandex.taxi.design.StoryProgressComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;
import ru.yandex.taxi.promotions.model.d;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.c;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ·\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\r¸\u0001¹\u0001º\u0001\u008f\u0001»\u0001R¼\u0001By\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0014¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020(2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00107\u001a\u00020(2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020(2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020(2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b:\u00108J\u000f\u0010;\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010*J\u000f\u0010<\u001a\u00020(H\u0015¢\u0006\u0004\b<\u0010*J\u001f\u0010A\u001a\u00020@2\u0006\u0010=\u001a\u00020,2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020(H\u0016¢\u0006\u0004\bC\u0010*J\u000f\u0010D\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010*J\u0017\u0010F\u001a\u00020(2\u0006\u0010E\u001a\u00020,H\u0016¢\u0006\u0004\bF\u0010/J\u001f\u0010I\u001a\u00020(2\u0006\u0010G\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u0018H\u0014¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020@2\u0006\u0010?\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020@2\u0006\u0010?\u001a\u00020KH\u0016¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020@2\u0006\u0010?\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010MJ\u000f\u0010P\u001a\u00020(H\u0002¢\u0006\u0004\bP\u0010*J\u000f\u0010Q\u001a\u00020(H\u0002¢\u0006\u0004\bQ\u0010*J\u001f\u0010S\u001a\u00020R2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020(H\u0002¢\u0006\u0004\bU\u0010*J\u000f\u0010V\u001a\u00020(H\u0002¢\u0006\u0004\bV\u0010*J\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020(2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bZ\u00108J\u0017\u0010]\u001a\u00020(2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010a\u001a\u00020(2\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\ba\u0010bJ\u0019\u0010c\u001a\u00020(2\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\bc\u0010bJ1\u0010g\u001a\u00020(2\u0006\u00106\u001a\u0002052\b\u0010e\u001a\u0004\u0018\u00010d2\u0006\u0010E\u001a\u00020,2\u0006\u0010f\u001a\u00020@H\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020(2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020(2\u0006\u0010?\u001a\u00020KH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020(H\u0002¢\u0006\u0004\bo\u0010*J\u000f\u0010p\u001a\u00020(H\u0002¢\u0006\u0004\bp\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010qR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010sR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010tR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010uR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010vR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010wR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010xR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010yR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010zR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010{R\u0014\u0010|\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0090\u0001\u001a\t\u0018\u00010\u008f\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008a\u0001R\u0019\u0010\u0093\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008a\u0001R\u0017\u0010\u0094\u0001\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008a\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010j\u001a\u00020i8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bj\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008a\u0001R\u0017\u0010 \u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¬\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010e\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010¯\u0001R \u0010±\u0001\u001a\u00030°\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0017\u0010µ\u0001\u001a\u00020@8BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001¨\u0006½\u0001"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView;", "Lru/yandex/taxi/widget/ModalView;", "Leis;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/Lifecycle;", "activityLifecycle", "Ltse;", "lifecycleScope", "Lru/yandex/taxi/banners/presentation/fullscreen/a;", "presenter", "Lb7z0;", "timeProvider", "Lpav;", "imageLoader", "Lpyc0;", "playerCredentialsProvider", "Lgep0;", "screenProvider", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Lpdc;", "colorConverter", "Ljava/lang/Runnable;", "onDismissAnimationEndAction", "Lltc;", "communicationsErrorsInteractor", "Lptc;", "communicationsFontPropertiesProvider", "Lir4;", "bannerAssetsStorage", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ltse;Lru/yandex/taxi/banners/presentation/fullscreen/a;Lb7z0;Lpav;Lpyc0;Lgep0;Lru/yandex/taxi/widget/c;Lpdc;Ljava/lang/Runnable;Lltc;Lptc;Lir4;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "contentTop", "onModalViewAppear", "(I)V", "Lpey;", "owner", "onResume", "(Lpey;)V", "onPause", "Lshs;", "banner", "setData", "(Lshs;)V", "updateData", "onBannerMediaLoaded", "dismissWithAction", "onBackPressed", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "pausePlayback", "resumePlayback", "pageIndex", "goToPage", "startAction", "endAction", "animateDismiss", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "onTouchEvent", "startPlayer", "pausePlayer", "Lais;", "setupPlayer", "(Lpyc0;Lb7z0;)Lais;", "initPlayer", "resetPlayer", "Lru/yandex/taxi/audio/a;", "audioController", "()Lru/yandex/taxi/audio/a;", "updateViews", "Lshs$a;", Constants.KEY_PAGE, "updatePlayerMedia", "(Lshs$a;)V", "Lru/yandex/taxi/communications/api/dto/BannerWidgets$e;", "button", "setupMenuButton", "(Lru/yandex/taxi/communications/api/dto/BannerWidgets$e;)V", "setupCloseButton", "Lru/yandex/taxi/communications/api/dto/BannerWidgets$g;", "pager", "storyMode", "setupPageProgress", "(Lshs;Lru/yandex/taxi/communications/api/dto/BannerWidgets$g;IZ)V", "Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView$State;", ClidProvider.STATE, "setState", "(Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView$State;)V", "updateIgnoreTouchEventsValue", "(Landroid/view/MotionEvent;)V", "settleDismissScroll", "cancelDismiss", "Landroidx/lifecycle/Lifecycle;", "Ltse;", "Lru/yandex/taxi/banners/presentation/fullscreen/a;", "Lpav;", "Lgep0;", "Lru/yandex/taxi/widget/c;", "Lpdc;", "Ljava/lang/Runnable;", "Lltc;", "Lptc;", "Lir4;", "playerInfo", "Lais;", "Lshs;", "Lioo;", "playerProxy", "Lioo;", "Lbzc0;", "playerPositionUpdater", "Lbzc0;", "Ladv;", "imagePlaybackController", "Ladv;", "Lru/yandex/taxi/audio/a;", "isVideoInBackground", "Z", "userEnabledAudio", "Lipg;", "dataSourceFactory", "Lipg;", "Lwhs;", "pagerAdapter", "Lwhs;", "isPagerScrolling", "isSettingAdapter", "isRtl", "Lpis;", "transitions", "Lpis;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "", "dismissScrollPercent", "F", "Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView$State;", "ignoreTouchEvents", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/StoryProgressComponent;", "pageProgressView", "Lru/yandex/taxi/design/StoryProgressComponent;", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "dotsIndicatorView", "Lru/yandex/taxi/design/DotsIndicatorComponent;", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroidx/media3/ui/PlayerView;", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/widget/FrameLayout;", "overlappingModalViewContainer", "Landroid/widget/FrameLayout;", "getOverlappingModalViewContainer", "()Landroid/widget/FrameLayout;", "isPlaybackResumed", "()Z", "Companion", "GestureListener", "yhs", "zhs", "State", "xhs", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FullScreenBannerModalView extends ModalView implements eis, DefaultLifecycleObserver {
    public static final xhs Companion = new xhs();
    private static final long IMAGE_DURATION = 3000;
    private final Lifecycle activityLifecycle;
    private ru.yandex.taxi.audio.a audioController;
    private shs banner;
    private final ir4 bannerAssetsStorage;
    private final pdc colorConverter;
    private final ltc communicationsErrorsInteractor;
    private final ptc communicationsFontPropertiesProvider;
    private final View content;
    private final ipg dataSourceFactory;
    private float dismissScrollPercent;
    private final DotsIndicatorComponent dotsIndicatorView;
    private final c formattedTextConverter;
    private final GestureDetector gestureDetector;
    private boolean ignoreTouchEvents;
    private final pav imageLoader;
    private final adv imagePlaybackController;
    private boolean isPagerScrolling;
    private final boolean isRtl;
    private boolean isSettingAdapter;
    private boolean isVideoInBackground;
    private final tse lifecycleScope;
    private final Runnable onDismissAnimationEndAction;
    private final FrameLayout overlappingModalViewContainer;
    private final StoryProgressComponent pageProgressView;
    private final ViewPager pager;
    private whs pagerAdapter;
    private final ais playerInfo;
    private final bzc0 playerPositionUpdater;
    private final ioo playerProxy;
    private final PlayerView playerView;
    private final a presenter;
    private final gep0 screenProvider;
    private State state;
    private final ToolbarComponent toolbar;
    private final pis transitions;
    private boolean userEnabledAudio;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J*\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView;)V", "touchSlop", "", "minFlingVelocity", "", "onScroll", "", "e1", "Landroid/view/MotionEvent;", "e2", "distanceX", "distanceY", "onFling", "velocityX", "velocityY", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private final float minFlingVelocity;
        private final int touchSlop;

        public GestureListener() {
            this.touchSlop = ViewConfiguration.get(FullScreenBannerModalView.this.getContext()).getScaledTouchSlop();
            this.minFlingVelocity = uh6.p(FullScreenBannerModalView.this.getContext(), 700.0f);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            State state = FullScreenBannerModalView.this.state;
            State state2 = State.NORMAL;
            if (state != state2 && Math.abs(velocityY) > this.minFlingVelocity && (FullScreenBannerModalView.this.state == state2 || FullScreenBannerModalView.this.state == State.SCROLL_FOR_DISMISS)) {
                FullScreenBannerModalView fullScreenBannerModalView = FullScreenBannerModalView.this;
                if (velocityY >= 0.0f) {
                    fullScreenBannerModalView.presenter.f();
                    return true;
                }
                if (fullScreenBannerModalView.state == State.SCROLL_FOR_DISMISS) {
                    FullScreenBannerModalView.this.cancelDismiss();
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            State state = FullScreenBannerModalView.this.state;
            State state2 = State.NORMAL;
            if (state != state2) {
                if (Math.abs(e1 == null ? 0.0f : e2.getY() - e1.getY()) > this.touchSlop && FullScreenBannerModalView.this.state == state2) {
                    FullScreenBannerModalView.this.setState(State.SCROLL_FOR_DISMISS);
                    FullScreenBannerModalView.this.transitions.m(r1.a.getWidth() / 2.0f, 0.0f);
                }
                if (FullScreenBannerModalView.this.state == State.SCROLL_FOR_DISMISS) {
                    float y = e1 == null ? 0.0f : e2.getY() - e1.getY();
                    FullScreenBannerModalView fullScreenBannerModalView = FullScreenBannerModalView.this;
                    if (y < 0.0f) {
                        fullScreenBannerModalView.setState(state2);
                        return false;
                    }
                    FullScreenBannerModalView.this.dismissScrollPercent = (float) Math.min(y / ((float) Math.max(fullScreenBannerModalView.getHeight(), 1.0d)), 1.0d);
                    FullScreenBannerModalView.this.dismissScrollPercent = (float) Math.max(r6.dismissScrollPercent, 0.0d);
                    FullScreenBannerModalView.this.transitions.o(FullScreenBannerModalView.this.dismissScrollPercent);
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/banners/presentation/fullscreen/FullScreenBannerModalView$State;", "", "NORMAL", "SCROLL_FOR_DISMISS", "SETTLING_DISMISS_SCROLL", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NORMAL;
        public static final State SCROLL_FOR_DISMISS;
        public static final State SETTLING_DISMISS_SCROLL;

        static {
            State state = new State("NORMAL", 0);
            NORMAL = state;
            State state2 = new State("SCROLL_FOR_DISMISS", 1);
            SCROLL_FOR_DISMISS = state2;
            State state3 = new State("SETTLING_DISMISS_SCROLL", 2);
            SETTLING_DISMISS_SCROLL = state3;
            State[] stateArr = {state, state2, state3};
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

    public FullScreenBannerModalView(Context context, Lifecycle lifecycle, tse tseVar, a aVar, b7z0 b7z0Var, pav pavVar, pyc0 pyc0Var, gep0 gep0Var, c cVar, pdc pdcVar, Runnable runnable, ltc ltcVar, ptc ptcVar, ir4 ir4Var) {
        super(context, null);
        this.activityLifecycle = lifecycle;
        this.lifecycleScope = tseVar;
        this.presenter = aVar;
        this.imageLoader = pavVar;
        this.screenProvider = gep0Var;
        this.formattedTextConverter = cVar;
        this.colorConverter = pdcVar;
        this.onDismissAnimationEndAction = runnable;
        this.communicationsErrorsInteractor = ltcVar;
        this.communicationsFontPropertiesProvider = ptcVar;
        this.bannerAssetsStorage = ir4Var;
        ru.yandex.taxi.design.utils.c.q(this, mph0.fullscreen_banner_modal_view, true);
        ais aisVar = setupPlayer(pyc0Var, b7z0Var);
        this.playerInfo = aisVar;
        this.playerProxy = aisVar.a;
        this.playerPositionUpdater = aisVar.c;
        this.imagePlaybackController = aisVar.d;
        this.dataSourceFactory = aisVar.b;
        this.transitions = new pis(this);
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.state = State.NORMAL;
        int i = idh0.banner_content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i);
        ToolbarComponent toolbarComponent = (ToolbarComponent) ((View) rp31.d(this, idh0.banner_toolbar));
        this.toolbar = toolbarComponent;
        StoryProgressComponent storyProgressComponent = (StoryProgressComponent) LayoutInflater.from(context).inflate(nph0.fullscreen_progress_view, (ViewGroup) null);
        this.pageProgressView = storyProgressComponent;
        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) LayoutInflater.from(context).inflate(nph0.fullscreen_dots_indicator, (ViewGroup) null);
        this.dotsIndicatorView = dotsIndicatorComponent;
        PlayerView playerView = (PlayerView) ((View) rp31.d(this, idh0.banner_player_view));
        this.playerView = playerView;
        ViewPager viewPager = (ViewPager) ((View) rp31.d(this, idh0.banner_pager));
        this.pager = viewPager;
        this.overlappingModalViewContainer = (FrameLayout) ((View) rp31.d(this, idh0.overlapping_modal_view_container));
        toolbarComponent.setStoryProgressComponent(storyProgressComponent).setDotsIndicatorComponent(dotsIndicatorComponent).invalidateComponent();
        this.isRtl = xw31.n(context);
        viewPager.setOffscreenPageLimit(1);
        viewPager.addOnPageChangeListener(new yhs(this));
        viewPager.addOnPageChangeListener(dotsIndicatorComponent.createPageChangeListener());
        playerView.setUseController(false);
    }

    private final ru.yandex.taxi.audio.a audioController() {
        AudioManager audioManager = (AudioManager) getContext().getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        ru.yandex.taxi.audio.a aVar = this.audioController;
        if (aVar != null) {
            return aVar;
        }
        ru.yandex.taxi.audio.a aVar2 = new ru.yandex.taxi.audio.a(audioManager, new xen(13, this));
        this.audioController = aVar2;
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void audioController$lambda$0(FullScreenBannerModalView fullScreenBannerModalView, float f) {
        f fVar = fullScreenBannerModalView.playerProxy.d;
        if (fVar != null) {
            fVar.setVolume(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelDismiss() {
        setState(State.SETTLING_DISMISS_SCROLL);
        pis pisVar = this.transitions;
        float f = this.dismissScrollPercent;
        vhs vhsVar = new vhs(this, 1);
        pisVar.getClass();
        pisVar.g(pisVar.b(f, 0.0f, 300L, new fsf0(pisVar, 2)), true, null, vhsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelDismiss$lambda$0(FullScreenBannerModalView fullScreenBannerModalView) {
        fullScreenBannerModalView.setState(State.NORMAL);
    }

    private final void initPlayer() {
        this.playerProxy.b();
        if (this.userEnabledAudio) {
            ru.yandex.taxi.audio.a audioController = audioController();
            if (audioController.c) {
                audioController.b.setVolume(1.0f);
            }
        }
        this.playerView.setPlayer(this.playerProxy.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(FullScreenBannerModalView fullScreenBannerModalView, t1w t1wVar) {
        xw31.L(t1wVar.b, fullScreenBannerModalView.toolbar);
        return zy11.a;
    }

    private final boolean isPlaybackResumed() {
        if (!this.isVideoInBackground) {
            return this.imagePlaybackController.f;
        }
        f fVar = this.playerProxy.d;
        return fVar != null && fVar.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onModalViewAppear$lambda$0(FullScreenBannerModalView fullScreenBannerModalView) {
        View findViewById = fullScreenBannerModalView.toolbar.findViewById(ndh0.close);
        if (findViewById != null) {
            findViewById.performAccessibilityAction(64, null);
        }
    }

    private final void pausePlayer() {
        zxc0 player = this.playerView.getPlayer();
        if (player != null) {
            player.pause();
        }
        f fVar = this.playerProxy.d;
        if (fVar != null) {
            fVar.pause();
        }
        this.playerPositionUpdater.c = false;
        this.imagePlaybackController.f = false;
        ru.yandex.taxi.audio.a aVar = this.audioController;
        if (aVar != null) {
            aVar.a();
        }
    }

    private final void resetPlayer() {
        this.playerView.setPlayer(null);
        ioo iooVar = this.playerProxy;
        f fVar = iooVar.d;
        if (fVar != null) {
            fVar.removeListener(iooVar.b);
            fVar.release();
        }
        iooVar.d = null;
        audioController().a();
        this.playerPositionUpdater.c = false;
        this.imagePlaybackController.f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        this.state = state;
    }

    private final void settleDismissScroll() {
        if (this.dismissScrollPercent < 0.5d) {
            cancelDismiss();
        } else {
            this.presenter.f();
        }
    }

    private final void setupCloseButton(BannerWidgets.e button) {
        ToolbarComponent toolbarComponent = this.toolbar;
        if (button == null) {
            toolbarComponent.disableCloseButton();
            return;
        }
        toolbarComponent.enableCloseButton();
        ToolbarComponent toolbarComponent2 = this.toolbar;
        String str = button.a;
        int i = 0;
        int i2 = ModalContentViewContainer.BASE_SHADOW_COLOR;
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i2 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                i2 = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        toolbarComponent2.setCloseIconColor(i2);
        this.toolbar.setOnCloseClickListener(new uhs(this.presenter, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCloseButton$onCloseClick(a aVar) {
        aVar.f();
        ((n9y0) aVar.h).f(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
    }

    private final void setupMenuButton(BannerWidgets.e button) {
        ToolbarComponent toolbarComponent = this.toolbar;
        if (button == null) {
            toolbarComponent.disableNavigationButton();
            return;
        }
        toolbarComponent.enableNavigationButton();
        ToolbarComponent toolbarComponent2 = this.toolbar;
        String str = button.a;
        int i = ModalContentViewContainer.BASE_SHADOW_COLOR;
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                i = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        toolbarComponent2.setNavigationIconColor(i);
        this.toolbar.setOnNavigationClickListener(new uhs(this.presenter, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMenuButton$onMenuClicked(a aVar) {
        klf0 klf0Var = aVar.h;
        shs shsVar = aVar.f;
        int i = aVar.z;
        long h = aVar.h();
        PromotionBackground.Type g = aVar.g();
        n9y0 n9y0Var = (n9y0) klf0Var;
        n9y0Var.getClass();
        n9y0Var.a("PromoDidSelectMenu", shsVar, i, Long.valueOf(h), g, true).m();
        ((f600) aVar.n.a.get()).g();
        aVar.f();
    }

    private final void setupPageProgress(shs banner, BannerWidgets.g pager, int pageIndex, boolean storyMode) {
        List list = banner.l;
        int size = list.size();
        ToolbarComponent toolbarComponent = this.toolbar;
        if (size <= 1) {
            toolbarComponent.setStoryProgressEnabled(false).setDotsIndicatorEnabled(false).invalidateComponent();
            return;
        }
        toolbarComponent.setStoryProgressEnabled(this.presenter.y).setDotsIndicatorEnabled(!this.presenter.y).invalidateComponent();
        Context context = getContext();
        String str = pager != null ? pager.a : null;
        if (str == null) {
            str = "";
        }
        int R = q5z.R(context, mqg0.component_black_opacity_20, str);
        Context context2 = getContext();
        String str2 = pager != null ? pager.b : null;
        int R2 = q5z.R(context2, mqg0.component_black, str2 != null ? str2 : "");
        this.dotsIndicatorView.setDotColors(R, R2);
        this.dotsIndicatorView.setDotsCount(list.size());
        this.pageProgressView.setMediaCount(list.size()).setCurrentMedia(pageIndex).setCurrentMediaProgressPercent(!storyMode ? 1 : 0).setProgressColor(R).setProgressColorFilled(R2).invalidateComponent();
    }

    private final ais setupPlayer(pyc0 playerCredentialsProvider, b7z0 timeProvider) {
        zdh a = new zdh.a().a();
        adv advVar = new adv(this, new ths(timeProvider, 0), null);
        ioo iooVar = new ioo(getContext(), new bis(this, advVar), a);
        Context applicationContext = getContext().getApplicationContext();
        och ochVar = new och();
        ochVar.b = ((g9y0) playerCredentialsProvider).a.a();
        return new ais(iooVar, new l9h(applicationContext, ochVar), new bzc0(this, new qpo(14, this, advVar)), advVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupPlayer$lambda$1(FullScreenBannerModalView fullScreenBannerModalView, adv advVar) {
        long j;
        if (fullScreenBannerModalView.isVideoInBackground) {
            f fVar = fullScreenBannerModalView.playerProxy.d;
            j = fVar != null ? fVar.getCurrentPosition() : 0L;
        } else {
            j = advVar.e;
        }
        long a = fullScreenBannerModalView.isVideoInBackground ? fullScreenBannerModalView.playerProxy.a() : advVar.d;
        fullScreenBannerModalView.pageProgressView.setCurrentMediaProgressPercent(a > 0 ? j / a : 1.0f).invalidateComponent();
    }

    private final void startPlayer() {
        zxc0 player = this.playerView.getPlayer();
        if (player != null) {
            player.play();
        }
        f fVar = this.playerProxy.d;
        if (fVar != null) {
            fVar.play();
        }
        if (this.isVideoInBackground) {
            bzc0 bzc0Var = this.playerPositionUpdater;
            bzc0Var.c = true;
            bzc0Var.a.postOnAnimation(bzc0Var);
        } else {
            this.imagePlaybackController.a();
        }
        ru.yandex.taxi.audio.a aVar = this.audioController;
        if (aVar != null) {
            aVar.b();
        }
    }

    private final void updateIgnoreTouchEventsValue(MotionEvent event) {
        if (event.getAction() == 0) {
            this.ignoreTouchEvents = this.state != State.NORMAL;
        }
    }

    private final void updatePlayerMedia(shs.a page) {
        String a;
        pausePlayback();
        int i = 8;
        this.playerView.setVisibility(8);
        this.isVideoInBackground = false;
        d dVar = PromotionBackground.Companion;
        List list = page.f;
        PromotionBackground.Type type = PromotionBackground.Type.VIDEO;
        dVar.getClass();
        PromotionBackground c = d.c(list, type);
        if (c != null && (a = hr4.a(this.bannerAssetsStorage, c.b)) != null) {
            Uri parse = Uri.parse(a);
            this.isVideoInBackground = true;
            this.playerView.setVisibility(0);
            ipg ipgVar = this.dataSourceFactory;
            vfc0 vfc0Var = new vfc0(i, new lbh());
            rah rahVar = new rah();
            beh behVar = new beh();
            td10 td10Var = new td10();
            td10Var.b = parse;
            fe10 a2 = td10Var.a();
            a2.b.getClass();
            tkf0 tkf0Var = new tkf0(a2, ipgVar, vfc0Var, rahVar.a(a2), behVar, 1048576, null);
            f fVar = this.playerProxy.d;
            if (fVar != null) {
                fVar.setMediaSource(tkf0Var);
                fVar.prepare();
            }
        }
        boolean z = this.presenter.y;
        if (z && !this.isVideoInBackground) {
            adv advVar = this.imagePlaybackController;
            advVar.d = 3000L;
            advVar.e = 0L;
            advVar.f = false;
        }
        bzc0 bzc0Var = this.playerPositionUpdater;
        if (!z) {
            bzc0Var.c = false;
            return;
        }
        bzc0Var.c = true;
        bzc0Var.a.postOnAnimation(bzc0Var);
        resumePlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViews(shs banner) {
        int currentItem = this.pager.getCurrentItem();
        shs.a aVar = (shs.a) banner.l.get(currentItem);
        BannerWidgets bannerWidgets = aVar.e;
        gep0 gep0Var = this.screenProvider;
        setupMenuButton(((cay0) gep0Var).d.contains(((cay0) gep0Var).b()) ? bannerWidgets.b : null);
        setupCloseButton(bannerWidgets.a);
        setupPageProgress(banner, bannerWidgets.h, currentItem, this.presenter.y);
        updatePlayerMedia(aVar);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        ValueAnimator valueAnimator = this.transitions.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        State state = this.state;
        State state2 = State.SCROLL_FOR_DISMISS;
        if (state != state2) {
            this.dismissScrollPercent = 0.0f;
        }
        setState(state2);
        this.transitions.a(this.dismissScrollPercent, startAction, endAction);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContentView() {
        return this.content;
    }

    @Override // defpackage.eis
    public void dismissWithAction() {
        super.dismissWithAction(this.onDismissAnimationEndAction);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            pausePlayback();
        } else if (action == 1 || action == 3) {
            resumePlayback();
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // defpackage.eis
    public void goToPage(int pageIndex) {
        this.pager.setCurrentItem(pageIndex);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new s1r(15, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initPlayer();
        a aVar = this.presenter;
        aVar.c(this);
        h hVar = aVar.k;
        shs shsVar = aVar.f;
        String str = shsVar.b;
        n8s0 n8s0Var = shsVar.m;
        Promotion.Type type = Promotion.Type.FULLSCREEN;
        boolean contains = Promotion.a.contains(shsVar.m());
        cay0 cay0Var = (cay0) aVar.u;
        hVar.k(str, n8s0Var, type, contains, cay0Var.b(), aVar.f.j);
        aVar.i.d(aVar.f, cay0Var.b());
        tje.N(aVar.e(), null, null, new FullScreenBannerPresenter$attachView$1(aVar, null), 3);
        ((eis) aVar.a).setData(aVar.f);
        aVar.A = aVar.j.a();
        ((n9y0) aVar.h).g(aVar.f, cay0Var.b(), null);
        aVar.B = tje.N(aVar.e(), null, null, new FullScreenBannerPresenter$initData$1(aVar, null), 3);
        this.activityLifecycle.a(this);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        if (this.state != State.SETTLING_DISMISS_SCROLL) {
            a aVar = this.presenter;
            BannerWidgets bannerWidgets = ((shs.a) aVar.f.l.get(aVar.z)).e;
            if (bannerWidgets.a != null || bannerWidgets.c.isEmpty()) {
                ((n9y0) aVar.h).f(aVar.f, aVar.g, aVar.g(), aVar.z, Long.valueOf(aVar.h()));
                aVar.f();
            }
        }
    }

    @Override // defpackage.eis
    public void onBannerMediaLoaded(shs banner) {
        this.banner = banner;
        whs whsVar = this.pagerAdapter;
        if (whsVar != null) {
            whsVar.c = banner;
        }
        if (this.isVideoInBackground) {
            return;
        }
        updateViews(banner);
        resumePlayback();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(pey peyVar) {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.d();
        this.activityLifecycle.d(this);
        resetPlayer();
        whs whsVar = this.pagerAdapter;
        if (whsVar != null) {
            whsVar.m(new ssd(3));
        }
        ValueAnimator valueAnimator = this.transitions.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        updateIgnoreTouchEventsValue(event);
        if (this.ignoreTouchEvents || getOverlappingModalViewContainer().getChildCount() != 0) {
            return false;
        }
        return this.gestureDetector.onTouchEvent(event);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.userEnabledAudio) {
            return false;
        }
        if (keyCode != 24 && keyCode != 25) {
            return false;
        }
        this.userEnabledAudio = true;
        audioController().b();
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        post(new vhs(this, 0));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(pey owner) {
        a aVar = this.presenter;
        boolean z = aVar.c;
        aVar.c = false;
        if (z) {
            jl40.l(aVar.a, aVar.b);
        }
        pausePlayer();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(pey owner) {
        startPlayer();
        if (this.userEnabledAudio) {
            audioController().b();
        }
        a aVar = this.presenter;
        boolean z = aVar.c;
        aVar.c = true;
        if (z) {
            return;
        }
        jl40.l(aVar.a, aVar.b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(pey peyVar) {
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        updateIgnoreTouchEventsValue(event);
        if (this.ignoreTouchEvents) {
            return false;
        }
        if (!this.gestureDetector.onTouchEvent(event) && this.state == State.SCROLL_FOR_DISMISS && (event.getAction() == 1 || event.getAction() == 3)) {
            settleDismissScroll();
        }
        return true;
    }

    @Override // defpackage.eis
    public void pausePlayback() {
        whs whsVar;
        whs whsVar2;
        if (!isPlaybackResumed() || (whsVar = this.pagerAdapter) == null) {
            return;
        }
        whsVar.m(new ssd(2));
        if (!this.isVideoInBackground) {
            this.imagePlaybackController.f = false;
            return;
        }
        this.playerProxy.c(false);
        f fVar = this.playerProxy.d;
        if ((fVar != null ? fVar.getCurrentPosition() : 0L) > 0) {
            View videoSurfaceView = this.playerView.getVideoSurfaceView();
            TextureView textureView = videoSurfaceView instanceof TextureView ? (TextureView) videoSurfaceView : null;
            Bitmap bitmap = textureView != null ? textureView.getBitmap() : null;
            if (bitmap == null || (whsVar2 = this.pagerAdapter) == null) {
                return;
            }
            FullScreenBannerPage l = whsVar2.l();
            if (l != null) {
                l.setVideoFrame(bitmap);
                return;
            }
            Bitmap bitmap2 = whsVar2.h;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            whsVar2.f = true;
            whsVar2.h = bitmap;
        }
    }

    @Override // defpackage.eis
    public void resumePlayback() {
        whs whsVar;
        if (this.isPagerScrolling || isPlaybackResumed() || (whsVar = this.pagerAdapter) == null) {
            return;
        }
        FullScreenBannerPage l = whsVar.l();
        if (l != null) {
            l.setPlaybackResumed(true);
        } else {
            whsVar.f = true;
            whsVar.i = true;
        }
        if (this.isVideoInBackground) {
            this.playerProxy.c(true);
        } else {
            this.imagePlaybackController.a();
        }
    }

    @Override // defpackage.eis
    public void setData(shs banner) {
        this.banner = banner;
        whs whsVar = new whs(this, banner);
        this.pagerAdapter = whsVar;
        this.isSettingAdapter = true;
        this.pager.setAdapter(whsVar);
        this.isSettingAdapter = false;
        if (this.isRtl) {
            goToPage(banner.l.size() - 1);
        }
        updateViews(banner);
        resumePlayback();
    }

    @Override // defpackage.eis
    public void updateData(shs banner) {
        this.banner = banner;
        whs whsVar = this.pagerAdapter;
        if (whsVar != null) {
            whsVar.c = banner;
            whsVar.d.clear();
            whsVar.f = true;
            whsVar.f();
        }
    }

    @Override // defpackage.eis
    public FrameLayout getOverlappingModalViewContainer() {
        return this.overlappingModalViewContainer;
    }
}
