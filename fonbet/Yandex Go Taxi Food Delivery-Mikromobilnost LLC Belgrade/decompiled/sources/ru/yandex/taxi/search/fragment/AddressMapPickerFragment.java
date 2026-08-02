package ru.yandex.taxi.search.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import com.yandex.go.parks.nearest.presentation.ui.NearestZoneErrorModalView;
import com.yandex.go.parks.nearest.presentation.ui.TaxiNearestZoneErrorModalView;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoTooltipContainer$TooltipPointerAlignment;
import com.yandex.go.search.router.Origin;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.a01;
import defpackage.a3v;
import defpackage.a41;
import defpackage.a9y0;
import defpackage.ab20;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.awi;
import defpackage.ay0;
import defpackage.b01;
import defpackage.b1c0;
import defpackage.bwi;
import defpackage.c01;
import defpackage.c0g;
import defpackage.c7p;
import defpackage.c9y0;
import defpackage.cma1;
import defpackage.cwi;
import defpackage.d01;
import defpackage.d4;
import defpackage.d56;
import defpackage.df4;
import defpackage.dt20;
import defpackage.e01;
import defpackage.e0g;
import defpackage.ei;
import defpackage.f1c0;
import defpackage.f7r;
import defpackage.faq0;
import defpackage.fif;
import defpackage.fu00;
import defpackage.g18;
import defpackage.gh00;
import defpackage.gpb0;
import defpackage.hc;
import defpackage.hpr0;
import defpackage.hr7;
import defpackage.hxx;
import defpackage.i8y0;
import defpackage.ip11;
import defpackage.jl40;
import defpackage.jpb0;
import defpackage.jzb;
import defpackage.kpb0;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.l56;
import defpackage.lg21;
import defpackage.lx4;
import defpackage.m11;
import defpackage.me0;
import defpackage.mg21;
import defpackage.ny0;
import defpackage.ny61;
import defpackage.ob0;
import defpackage.oep0;
import defpackage.p2c0;
import defpackage.pep0;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qa0;
import defpackage.qq60;
import defpackage.qx0;
import defpackage.s6v;
import defpackage.scc;
import defpackage.si00;
import defpackage.t31;
import defpackage.tt2;
import defpackage.tx0;
import defpackage.ty0;
import defpackage.udh0;
import defpackage.uze0;
import defpackage.v7j0;
import defpackage.vng;
import defpackage.vtb0;
import defpackage.w511;
import defpackage.w6r;
import defpackage.wiq0;
import defpackage.wpb0;
import defpackage.x31;
import defpackage.xi00;
import defpackage.xng0;
import defpackage.y50;
import defpackage.ymb0;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.zmh;
import defpackage.zuj0;
import defpackage.zwx0;
import defpackage.zy11;
import defpackage.zzf;
import defpackage.zzi;
import defpackage.zzs;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ActionV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$PointTypeV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ScreenV2;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment;
import ru.yandex.taxi.map.overlay.b;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.repository.e;
import ru.yandex.taxi.styling.f;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000\u009c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u0086\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004ù\u0001\u0087\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0016H\u0014¢\u0006\u0004\b,\u0010'J!\u00101\u001a\u00020\t2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0014¢\u0006\u0004\b3\u0010'J\u0019\u00104\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b4\u0010\u000fJ\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\tH\u0014¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\tH\u0014¢\u0006\u0004\b7\u0010\u0006J!\u0010<\u001a\u00020\t2\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b>\u0010'J\u000f\u0010?\u001a\u00020\u0003H\u0014¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010\u0006J\u001d\u0010E\u001a\u00020\t2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0016H\u0014¢\u0006\u0004\bG\u0010'J\u000f\u0010H\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010'J\u0017\u0010K\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0016H\u0014¢\u0006\u0004\bM\u0010'J\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0016H\u0014¢\u0006\u0004\bQ\u0010'J\u000f\u0010R\u001a\u00020\u0016H\u0014¢\u0006\u0004\bR\u0010'J\u000f\u0010S\u001a\u00020\u0016H\u0014¢\u0006\u0004\bS\u0010'J\u000f\u0010U\u001a\u00020TH\u0014¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0016H\u0014¢\u0006\u0004\bW\u0010'J\u0017\u0010Y\u001a\u00020\t2\u0006\u0010)\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u001f\u0010]\u001a\u00020\t2\u0006\u0010)\u001a\u00020X2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b`\u0010\u000fJ\u0019\u0010c\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bc\u0010dJ\u0011\u0010e\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\be\u0010fJ\u0011\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ'\u0010o\u001a\u00020\t2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\u0006\u0010n\u001a\u00020\u0016H\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010r\u001a\u00020qH\u0002¢\u0006\u0004\br\u0010sJ\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bu\u0010vR\"\u0010x\u001a\u00020w8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R'\u0010\u007f\u001a\u00020~8\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¢\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010©\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010°\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R1\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R*\u0010¿\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R*\u0010Æ\u0001\u001a\u00030Å\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R*\u0010Í\u0001\u001a\u00030Ì\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Ô\u0001\u001a\u00030Ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010Û\u0001\u001a\u00030Ú\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R*\u0010â\u0001\u001a\u00030á\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R\u0019\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010è\u0001R\u001a\u0010ê\u0001\u001a\u00030é\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b$\u0010ì\u0001R\u001b\u0010í\u0001\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0019\u0010ï\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u0019\u0010ñ\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ð\u0001R\u0017\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b,\u0010ð\u0001R\u0019\u0010ò\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ð\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001c\u0010÷\u0001\u001a\u0005\u0018\u00010ö\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001c\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0018\u0010ý\u0001\u001a\u00030ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0018\u0010\u0080\u0002\u001a\u00030ÿ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0018\u0010\u0085\u0002\u001a\u00030\u0082\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002¨\u0006\u0088\u0002"}, d2 = {"Lru/yandex/taxi/search/fragment/AddressMapPickerFragment;", "Lru/yandex/taxi/fragment/preorder/AbstractAddressMapPickerFragment;", "Le0g;", "Ll56;", "Ldf4;", "<init>", "()V", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Lpv0;", "addressInfo", "addressPicked", "(Lpv0;)V", "onResume", "onPause", "Lzzs;", "geoPoint", "Lqx0;", "callback", "", "onMapTapped", "(Lzzs;Lqx0;)Z", "La41;", "uiState", "renderUiState", "(La41;)V", "Lru/yandex/taxi/search/address/view/PointType;", "addressPointType", "()Lru/yandex/taxi/search/address/view/PointType;", "bindViewsInFields", "unbindViewsInFields", "onDismissingStart", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "pointType", "()Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "hasPickupPointsOnMap", "()Z", "Lc7p;", ClidProvider.STATE, "changeAutoLocateButtonState", "(Lc7p;)V", "shouldDrawPickupPoints", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "isShowPanoramaButton", "onAddressChanged", "onDestroyView", "hideControls", "showControls", "Lcom/yandex/go/address/models/Address;", "address", "Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "responseForAddress", "onUnsupportedTaxiAddress", "(Lcom/yandex/go/address/models/Address;Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;)V", "reactOnUnsupportedAddress", "blockedZonesHandler", "()Ll56;", "clearBlockedZones", "", "Ld56;", "presentationModels", "updateBlockedZones", "(Ljava/util/List;)V", "blockedZonesEnabled", "onBackPressed", "Lm11;", "navigator", "setNavigator", "(Lm11;)V", "isBackButtonVisible", "", "autoPaddingGravity", "()I", "shouldShowStateBarMessage", "shouldCacheAddressByLocationTap", "needUpdatePositionOnResume", "Lb1c0;", "setupPinV2DataRepository", "()Lb1c0;", "blockedZonesAlertsEnabled", "Lymb0;", "renderPickupFromPhotoButton", "(Lymb0;)V", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "pickupFromPhotoButton", "renderTooltip", "(Lymb0;Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;)V", "info", "updateAddressAccessibility", "", "locality", "providerUnsupportedAddressTitle", "(Ljava/lang/String;)Ljava/lang/String;", "getZoneMode", "()Ljava/lang/String;", "Lcom/yandex/go/search/router/Origin;", "getOrigin", "()Lcom/yandex/go/search/router/Origin;", "Lcom/yandex/mapkit/map/CameraPosition;", "position", "Lcom/yandex/mapkit/map/CameraUpdateReason;", CRLReasonCodeExtension.REASON, UgcLiveVideoData.UgcLiveStatus.FINISHED, "onMapDragging", "(Lcom/yandex/mapkit/map/CameraPosition;Lcom/yandex/mapkit/map/CameraUpdateReason;Z)V", "Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$PointTypeV2;", "pointTypeForAnalytics", "()Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$PointTypeV2;", "Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$ScreenV2;", "screenForAnalytics", "()Lru/yandex/taxi/analytics/EditPointOnMapAnalytics$ScreenV2;", "Lru/yandex/taxi/map/overlay/b;", "blockedZonesOverlay", "Lru/yandex/taxi/map/overlay/b;", "getBlockedZonesOverlay", "()Lru/yandex/taxi/map/overlay/b;", "setBlockedZonesOverlay", "(Lru/yandex/taxi/map/overlay/b;)V", "Lzzi;", "drawableFactory", "Lzzi;", "getDrawableFactory", "()Lzzi;", "setDrawableFactory", "(Lzzi;)V", "Lfif;", "modeRepository", "Lfif;", "getModeRepository", "()Lfif;", "setModeRepository", "(Lfif;)V", "Lawi;", "deliveryZoneModeInterceptor", "Lawi;", "getDeliveryZoneModeInterceptor", "()Lawi;", "setDeliveryZoneModeInterceptor", "(Lawi;)V", "Llg21;", "uriRouter", "Llg21;", "getUriRouter", "()Llg21;", "setUriRouter", "(Llg21;)V", "Lfaq0;", "selectAddressAnalytics", "Lfaq0;", "getSelectAddressAnalytics", "()Lfaq0;", "setSelectAddressAnalytics", "(Lfaq0;)V", "Lru/yandex/taxi/preorder/source/pickup/a;", "pickupHelper", "Lru/yandex/taxi/preorder/source/pickup/a;", "getPickupHelper", "()Lru/yandex/taxi/preorder/source/pickup/a;", "setPickupHelper", "(Lru/yandex/taxi/preorder/source/pickup/a;)V", "Lip11;", "typefaceDelegate", "Lip11;", "getTypefaceDelegate", "()Lip11;", "setTypefaceDelegate", "(Lip11;)V", "Lzwx0;", "taxiNearestZoneErrorModalViewFactory", "Lzwx0;", "getTaxiNearestZoneErrorModalViewFactory", "()Lzwx0;", "setTaxiNearestZoneErrorModalViewFactory", "(Lzwx0;)V", "Lyvf0;", "Lty0;", "addressMapPickerClarificationRouterProvider", "Lyvf0;", "getAddressMapPickerClarificationRouterProvider", "()Lyvf0;", "setAddressMapPickerClarificationRouterProvider", "(Lyvf0;)V", "Ljzb;", "clarifyScreenAddressRepository", "Ljzb;", "getClarifyScreenAddressRepository", "()Ljzb;", "setClarifyScreenAddressRepository", "(Ljzb;)V", "Luze0;", "priceLoadingStateHolder", "Luze0;", "getPriceLoadingStateHolder", "()Luze0;", "setPriceLoadingStateHolder", "(Luze0;)V", "Lwiq0;", "selectedTariffHolder", "Lwiq0;", "getSelectedTariffHolder", "()Lwiq0;", "setSelectedTariffHolder", "(Lwiq0;)V", "Lny0;", "allowBlockedZoneRepository", "Lny0;", "getAllowBlockedZoneRepository", "()Lny0;", "setAllowBlockedZoneRepository", "(Lny0;)V", "Lf1c0;", "experimentRepository", "Lf1c0;", "getExperimentRepository", "()Lf1c0;", "setExperimentRepository", "(Lf1c0;)V", "Ljpb0;", "pickupFromPhotoTooltipFactory", "Ljpb0;", "getPickupFromPhotoTooltipFactory", "()Ljpb0;", "setPickupFromPhotoTooltipFactory", "(Ljpb0;)V", "Lm11;", "Lg18;", "serviceModeSubscription", "Lg18;", "Lru/yandex/taxi/search/address/view/PointType;", AddressMapPickerFragment.ARG_ORIGIN, "Lcom/yandex/go/search/router/Origin;", "isAutolocateVisible", "Z", "isAddressConfirmImmediately", "defaultAddressMapPickerModalViewAllowed", "Lgpb0;", "pickupFromPhotoTooltipContainer", "Lgpb0;", "Lcom/yandex/go/parks/nearest/presentation/ui/NearestZoneErrorModalView;", "unsupportedAddressModalView", "Lcom/yandex/go/parks/nearest/presentation/ui/NearestZoneErrorModalView;", "Lc01;", "addressMapPickerClarificationRouterWrapper", "Lc01;", "Lhr7;", "cameraListener", "Lhr7;", "Lru/yandex/taxi/address/clarification/a;", "addressMapPickerClarificationPayload", "Lru/yandex/taxi/address/clarification/a;", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "d01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AddressMapPickerFragment extends AbstractAddressMapPickerFragment<e0g> implements l56, df4 {
    protected static final String ARG_ALLOW_PICKUP_FROM_PHOTO_ENTRY_POINT = "arg_allow_pickup_from_photo_entry_point";
    protected static final String ARG_BLOCKED_ZONE_ALERTS_ENABLED = "arg_blocked_zone_alerts_enabled";
    protected static final String ARG_IS_ADDRESS_COMFIRM_IMMEDIATELY = "address_confirm_immediately";
    protected static final String ARG_IS_AUTOLOCATE_VISIBLE = "autolocate_visibility";
    protected static final String ARG_NEED_UPDATE_POSITION_ON_RESUME = "arg_need_update_position_on_resume";
    protected static final String ARG_ORIGIN = "origin";
    protected static final String ARG_POINT_TYPE = "point_type";
    protected static final String ARG_ROUTE_DRAWING_ENABLED = "arg_route_drawing_enabled";
    protected static final String ARG_SHOULD_DRAW_PICKUP_POINTS = "should_draw_pickup_points";
    protected static final String ARG_SHOULD_SHOW_DEFAULT_MODAL_VIEW = "arg_should_show_default_modal_view";
    protected static final String ARG_SHOULD_SHOW_ETA_IN_PIN = "arg_should_show_eta_in_pin";
    protected static final String ARG_SHOULD_SHOW_STATE_BAR_MESSAGE = "arg_should_show_state_bar_message";
    protected static final String ARG_TITLE = "title";
    protected static final String ARG_ZONE_MODE = "zone_mode";
    public static final d01 Companion = new d01();
    public yvf0 addressMapPickerClarificationRouterProvider;
    private c01 addressMapPickerClarificationRouterWrapper;
    public ny0 allowBlockedZoneRepository;
    public b blockedZonesOverlay;
    public jzb clarifyScreenAddressRepository;
    public awi deliveryZoneModeInterceptor;
    public zzi drawableFactory;
    public f1c0 experimentRepository;
    public fif modeRepository;
    private m11 navigator;
    private Origin origin;
    private gpb0 pickupFromPhotoTooltipContainer;
    public jpb0 pickupFromPhotoTooltipFactory;
    public a pickupHelper;
    private PointType pointType;
    public uze0 priceLoadingStateHolder;
    public faq0 selectAddressAnalytics;
    public wiq0 selectedTariffHolder;
    public zwx0 taxiNearestZoneErrorModalViewFactory;
    public ip11 typefaceDelegate;
    private NearestZoneErrorModalView unsupportedAddressModalView;
    public lg21 uriRouter;
    private g18 serviceModeSubscription = g18.u1;
    private boolean isAutolocateVisible = true;
    private boolean isAddressConfirmImmediately = true;
    private boolean shouldDrawPickupPoints = true;
    private boolean defaultAddressMapPickerModalViewAllowed = true;
    private final hr7 cameraListener = new b01(0, this);
    private final ru.yandex.taxi.address.clarification.a addressMapPickerClarificationPayload = new ru.yandex.taxi.address.clarification.a(new a01(this, 3), new qa0(1, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addressMapPickerClarificationPayload$lambda$1(AddressMapPickerFragment addressMapPickerFragment, Address address) {
        pv0 addressInfo = addressMapPickerFragment.getAddressInfo();
        addressMapPickerFragment.setInitialAddress(addressInfo != null ? addressInfo.c(address) : new pv0(address, null, null, null, null, null, null, null, 1022));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewsInFields$lambda$0(AddressMapPickerFragment addressMapPickerFragment) {
        addressMapPickerFragment.requireActivity().onBackPressed();
    }

    private final Origin getOrigin() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return (Origin) vng.w(arguments, Origin.class, ARG_ORIGIN);
    }

    private final String getZoneMode() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(ARG_ZONE_MODE);
        }
        return null;
    }

    public static final AddressMapPickerFragment newInstance(int i, PointType pointType, String str, Origin origin, boolean z) {
        Companion.getClass();
        return d01.a(i, pointType, str, origin, z, true, true, true, true, true, true, false, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMapDragging(CameraPosition position, CameraUpdateReason reason, boolean finished) {
        si00 si00Var;
        if (this.pointType == null || this.origin == null || reason != CameraUpdateReason.GESTURES || !finished) {
            if (reason != CameraUpdateReason.GESTURES || finished || (si00Var = (si00) this.callback) == null) {
                return;
            }
            si00Var.e();
            return;
        }
        Point target = position.getTarget();
        faq0 selectAddressAnalytics = getSelectAddressAnalytics();
        double latitude = target.getLatitude();
        double longitude = target.getLongitude();
        EditPointOnMapAnalytics$PointTypeV2 pointTypeForAnalytics = pointTypeForAnalytics();
        EditPointOnMapAnalytics$ScreenV2 screenForAnalytics = screenForAnalytics();
        selectAddressAnalytics.getClass();
        selectAddressAnalytics.c(EditPointOnMapAnalytics$ActionV2.MapDragging, latitude, longitude, pointTypeForAnalytics, screenForAnalytics, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnsupportedTaxiAddress$lambda$0(AddressMapPickerFragment addressMapPickerFragment) {
        addressMapPickerFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnsupportedTaxiAddress$lambda$1(AddressMapPickerFragment addressMapPickerFragment, String str) {
        ((mg21) addressMapPickerFragment.getUriRouter()).c(str);
    }

    private static final g18 onViewCreated$lambda$0(AddressMapPickerFragment addressMapPickerFragment) {
        return addressMapPickerFragment.getModeRepository().c(new ob0(1, addressMapPickerFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewCreated$lambda$0$0(AddressMapPickerFragment addressMapPickerFragment) {
        String zoneMode = addressMapPickerFragment.getZoneMode();
        return zoneMode == null ? "" : zoneMode;
    }

    private final EditPointOnMapAnalytics$PointTypeV2 pointTypeForAnalytics() {
        Origin origin = this.origin;
        if (origin == null) {
            return EditPointOnMapAnalytics$PointTypeV2.Unknown;
        }
        int i = e01.b[origin.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.pointType == PointType.SOURCE ? EditPointOnMapAnalytics$PointTypeV2.Source : EditPointOnMapAnalytics$PointTypeV2.Destination : i != 4 ? EditPointOnMapAnalytics$PointTypeV2.Unknown : this.pointType == PointType.SOURCE ? EditPointOnMapAnalytics$PointTypeV2.DeliverySource : EditPointOnMapAnalytics$PointTypeV2.DeliveryDestination;
    }

    private final String providerUnsupportedAddressTitle(String locality) {
        if (locality == null || locality.length() == 0) {
            locality = getString(kyh0.address_region_not_supported_default_prefix);
        }
        return String.format(getString(kyh0.address_region_not_supported), Arrays.copyOf(new Object[]{locality}, 1));
    }

    private final void renderPickupFromPhotoButton(ymb0 state) {
        m11 m11Var;
        if (this.pointType == PointType.SOURCE && (m11Var = this.navigator) != null && this.defaultAddressMapPickerModalViewAllowed) {
            RotatableFloatButton rotatableFloatButton = (RotatableFloatButton) nonNullViewById(udh0.pickup_from_photo_button);
            Bitmap bitmap = state.b;
            rotatableFloatButton.setImageDrawable(bitmap != null ? new BitmapDrawable(rotatableFloatButton.getResources(), bitmap) : null);
            rotatableFloatButton.setContentDescription(state.c);
            c.z(new d4(19, m11Var), rotatableFloatButton);
            rotatableFloatButton.setIconTintAttr(xng0.textMain);
            rotatableFloatButton.setVisibility(state.a ? 0 : 8);
            renderTooltip(state, rotatableFloatButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPickupFromPhotoButton$lambda$0(m11 m11Var) {
        m11Var.openPickupFromPhoto();
        return zy11.a;
    }

    private final void renderTooltip(ymb0 state, RotatableFloatButton pickupFromPhotoButton) {
        String str = state.d;
        if (!state.a || str == null) {
            gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
            if (gpb0Var != null) {
                ((dt20) gpb0Var).a(false);
                gpb0 gpb0Var2 = this.pickupFromPhotoTooltipContainer;
                if (gpb0Var2 != null) {
                    ((dt20) gpb0Var2).c();
                }
                this.pickupFromPhotoTooltipContainer = null;
                return;
            }
            return;
        }
        gpb0 gpb0Var3 = this.pickupFromPhotoTooltipContainer;
        if (gpb0Var3 != null) {
            ((dt20) gpb0Var3).a(true);
            return;
        }
        jpb0 pickupFromPhotoTooltipFactory = getPickupFromPhotoTooltipFactory();
        FrameLayout frameLayout = (FrameLayout) nonNullViewById(udh0.modal_view_container);
        ((kpb0) pickupFromPhotoTooltipFactory).getClass();
        dt20 dt20Var = new dt20(frameLayout);
        this.pickupFromPhotoTooltipContainer = dt20Var;
        PickupFromPhotoTooltipContainer$TooltipPointerAlignment pickupFromPhotoTooltipContainer$TooltipPointerAlignment = PickupFromPhotoTooltipContainer$TooltipPointerAlignment.START;
        dt20Var.p(pickupFromPhotoButton, str);
    }

    private final EditPointOnMapAnalytics$ScreenV2 screenForAnalytics() {
        if (this.origin == Origin.ORDER) {
            return EditPointOnMapAnalytics$ScreenV2.Order;
        }
        return null;
    }

    private final void updateAddressAccessibility(pv0 info) {
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent != null) {
            String D1 = info.a.D1();
            if (D1.length() > 0) {
                addressInitialPointComponent.setContentDescription(D1);
            }
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void addressPicked(pv0 addressInfo) {
        if (this.isAddressConfirmImmediately) {
            super.addressPicked(addressInfo);
            return;
        }
        setInitialAddress(addressInfo);
        changeAddressInfo(addressInfo);
        si00 si00Var = (si00) this.callback;
        if (si00Var != null) {
            si00Var.j(addressInfo);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public PointType addressPointType() {
        PointType pointType = this.pointType;
        return pointType == null ? PointType.SOURCE : pointType;
    }

    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.BaseFragment
    public int autoPaddingGravity() {
        return 48;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void bindViewsInFields() {
        super.bindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        floatButtonIconComponent.getClass();
        floatButtonIconComponent.setDebounceClickListener(new a01(this, 2));
        String G = c.G(requireArguments().getInt(ARG_TITLE, -1), asView());
        if (G.length() > 0) {
            ListItemComponent listItemComponent = this.addressTitleItem;
            if (listItemComponent != null) {
                listItemComponent.setTitle(G);
            }
            ListItemComponent listItemComponent2 = this.addressTitleItem;
            if (listItemComponent2 != null) {
                listItemComponent2.setVisibility(0);
            }
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean blockedZonesAlertsEnabled() {
        return getAllowBlockedZoneRepository().a && requireArguments().getBoolean(ARG_BLOCKED_ZONE_ALERTS_ENABLED, super.blockedZonesAlertsEnabled());
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean blockedZonesEnabled() {
        return getOrigin() != Origin.NAVIGATOR && super.blockedZonesEnabled();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public l56 blockedZonesHandler() {
        return this;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void changeAutoLocateButtonState(c7p state) {
        if (this.isAutolocateVisible) {
            super.changeAutoLocateButtonState(state);
        } else {
            super.changeAutoLocateButtonState(new c7p(false, false));
        }
    }

    @Override // defpackage.l56
    public void clearBlockedZones() {
        getBlockedZonesOverlay().Jg();
    }

    public final yvf0 getAddressMapPickerClarificationRouterProvider() {
        yvf0 yvf0Var = this.addressMapPickerClarificationRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final ny0 getAllowBlockedZoneRepository() {
        ny0 ny0Var = this.allowBlockedZoneRepository;
        if (ny0Var != null) {
            return ny0Var;
        }
        return null;
    }

    public final b getBlockedZonesOverlay() {
        b bVar = this.blockedZonesOverlay;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    public final jzb getClarifyScreenAddressRepository() {
        jzb jzbVar = this.clarifyScreenAddressRepository;
        if (jzbVar != null) {
            return jzbVar;
        }
        return null;
    }

    public final awi getDeliveryZoneModeInterceptor() {
        awi awiVar = this.deliveryZoneModeInterceptor;
        if (awiVar != null) {
            return awiVar;
        }
        return null;
    }

    public final zzi getDrawableFactory() {
        zzi zziVar = this.drawableFactory;
        if (zziVar != null) {
            return zziVar;
        }
        return null;
    }

    public final f1c0 getExperimentRepository() {
        f1c0 f1c0Var = this.experimentRepository;
        if (f1c0Var != null) {
            return f1c0Var;
        }
        return null;
    }

    public final fif getModeRepository() {
        fif fifVar = this.modeRepository;
        if (fifVar != null) {
            return fifVar;
        }
        return null;
    }

    public final jpb0 getPickupFromPhotoTooltipFactory() {
        jpb0 jpb0Var = this.pickupFromPhotoTooltipFactory;
        if (jpb0Var != null) {
            return jpb0Var;
        }
        return null;
    }

    public final a getPickupHelper() {
        a aVar = this.pickupHelper;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final uze0 getPriceLoadingStateHolder() {
        uze0 uze0Var = this.priceLoadingStateHolder;
        if (uze0Var != null) {
            return uze0Var;
        }
        return null;
    }

    public final faq0 getSelectAddressAnalytics() {
        faq0 faq0Var = this.selectAddressAnalytics;
        if (faq0Var != null) {
            return faq0Var;
        }
        return null;
    }

    public final wiq0 getSelectedTariffHolder() {
        wiq0 wiq0Var = this.selectedTariffHolder;
        if (wiq0Var != null) {
            return wiq0Var;
        }
        return null;
    }

    public final zwx0 getTaxiNearestZoneErrorModalViewFactory() {
        zwx0 zwx0Var = this.taxiNearestZoneErrorModalViewFactory;
        if (zwx0Var != null) {
            return zwx0Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return this.pointType == PointType.SOURCE ? Screen.ROUTE_SELECTOR : Screen.CHOOSE_B;
    }

    public final ip11 getTypefaceDelegate() {
        ip11 ip11Var = this.typefaceDelegate;
        if (ip11Var != null) {
            return ip11Var;
        }
        return null;
    }

    public final lg21 getUriRouter() {
        lg21 lg21Var = this.uriRouter;
        if (lg21Var != null) {
            return lg21Var;
        }
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean hasPickupPointsOnMap() {
        return true;
    }

    @Override // defpackage.l56
    public /* bridge */ void hideBlockedZones() {
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void hideControls() {
        super.hideControls();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        floatButtonIconComponent.getClass();
        cma1.b(0.0f, floatButtonIconComponent);
        NearestZoneErrorModalView nearestZoneErrorModalView = this.unsupportedAddressModalView;
        if (nearestZoneErrorModalView != null) {
            modalViewCoordinator().l(nearestZoneErrorModalView);
            this.unsupportedAddressModalView = null;
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isBackButtonVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean isShowPanoramaButton() {
        Origin origin = getOrigin();
        if (origin != null) {
            return origin == Origin.MENU || origin == Origin.ORDER || origin == Origin.SUGGEST;
        }
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean needUpdatePositionOnResume() {
        return requireArguments().getBoolean(ARG_SHOULD_SHOW_DEFAULT_MODAL_VIEW, true);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.iy0
    public void onAddressChanged(pv0 addressInfo) {
        super.onAddressChanged(addressInfo);
        NearestZoneErrorModalView nearestZoneErrorModalView = this.unsupportedAddressModalView;
        if (nearestZoneErrorModalView != null) {
            modalViewCoordinator().l(nearestZoneErrorModalView);
            this.unsupportedAddressModalView = null;
        }
        if (addressInfo != null) {
            this.addressMapPickerClarificationPayload.d.g(addressInfo);
            updateAddressAccessibility(addressInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.MapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Bundle requireArguments = requireArguments();
        this.pointType = (PointType) vng.w(requireArguments, PointType.class, ARG_POINT_TYPE);
        this.origin = (Origin) vng.w(requireArguments, Origin.class, ARG_ORIGIN);
        this.isAutolocateVisible = requireArguments.getBoolean(ARG_IS_AUTOLOCATE_VISIBLE, true);
        this.isAddressConfirmImmediately = requireArguments.getBoolean(ARG_IS_ADDRESS_COMFIRM_IMMEDIATELY, true);
        this.shouldDrawPickupPoints = requireArguments.getBoolean(ARG_SHOULD_DRAW_PICKUP_POINTS, true);
        boolean z = requireArguments.getBoolean(ARG_SHOULD_SHOW_DEFAULT_MODAL_VIEW, true);
        this.defaultAddressMapPickerModalViewAllowed = z;
        setDefaultModalViewAllowed(z);
        setPickupFromPhotoAllowed(requireArguments.getBoolean(ARG_ALLOW_PICKUP_FROM_PHOTO_ENTRY_POINT, true));
        setShowRoute(requireArguments.getBoolean(ARG_ROUTE_DRAWING_ENABLED, false));
        super.onAttach(context);
        e0g e0gVar = (e0g) injector();
        zzf zzfVar = e0gVar.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = e0gVar.c;
        setPin((com.yandex.go.pin.api.a) c0gVar.Ub.get());
        setAnalyticsManager((lx4) zzfVar.Y.get());
        setUserLocationInteractor((po21) zzfVar.Y1.get());
        setMapController((ah00) c0gVar.Vb.get());
        setActivityRouter((y50) c0gVar.n0.get());
        setPositionAlertRouterFactory(c0gVar.cp);
        setZoomRepository((fu00) c0gVar.ap.get());
        setObserverForCurrentTariff((qq60) zzfVar.gr.get());
        setPickupPointsControllerFactory((t31) e0gVar.g.a);
        setAppDispatchers((tt2) zzfVar.n.get());
        setPinStyleProvider(c0gVar.T5());
        setPointAddressDecoder((atd0) c0gVar.Ac.get());
        setFocusCoordinator((a3v) c0gVar.Wb.get());
        setMetricaActionInteractor(e0gVar.g());
        setMetricaActionStateHolder((ab20) zzfVar.hr.get());
        setRequestPermissionInteractor((v7j0) c0gVar.L0.get());
        setPinAlertAnimationInteractor((vtb0) c0gVar.Bn.get());
        setIdleIconRepository(new s6v());
        setPinStyleMapper(c0gVar.G2());
        setAddressClarificationInteractor((kr0) c0gVar.Ec.get());
        setMassTransitStopsInteractor(c0gVar.z5());
        setResourcesProxy((zuj0) zzfVar.W.get());
        setTaxiPanoramaInteractor(c0gVar.Y());
        setTaxiPanoramaLogger(new i8y0());
        setTaxiPanoramaExperimentRepository(c0gVar.a3());
        setFinalSuggestScreenRepository((w6r) c0gVar.vc.get());
        setTaxiPanoramaTooltipRepository((c9y0) c0gVar.so.get());
        setTaxiPanoramaRouter((a9y0) c0gVar.Ko.get());
        setScreenStackNavigator((oep0) c0gVar.T.get());
        setSharedPinDataHolder((hpr0) c0gVar.Tb.get());
        setMapHost((xi00) c0gVar.Rb.get());
        setAddressMapInteractor(e0gVar.a());
        setPinWithStanExperimentRepository((p2c0) zzfVar.ar.get());
        setDebouncingMapListenerDelegate(e0gVar.d());
        setBlockedZoneControllerFactory((ay0) e0gVar.i.a);
        setAddressMapFragmentAddressControllerFactory((tx0) e0gVar.j.a);
        setPointActionRouterConsumer((ysd0) c0gVar.wd.get());
        setFinalizeAddressByGravityRouterFactory((f7r) c0gVar.Nv.a);
        setAddressMapPresenterFactory((x31) e0gVar.k.a);
        this.blockedZonesOverlay = (b) c0gVar.Mk.get();
        this.drawableFactory = c0gVar.O1();
        this.modeRepository = (fif) zzfVar.y8.get();
        this.deliveryZoneModeInterceptor = (awi) c0gVar.Ph.get();
        this.uriRouter = (lg21) zzfVar.u5.get();
        this.selectAddressAnalytics = e0gVar.i();
        this.pickupHelper = (a) zzfVar.jn.get();
        this.typefaceDelegate = (ip11) zzfVar.uf.get();
        this.taxiNearestZoneErrorModalViewFactory = new me0((Context) c0gVar.U.get(), (byte) 0);
        this.addressMapPickerClarificationRouterProvider = c0gVar.a.r5;
        this.clarifyScreenAddressRepository = (jzb) zzfVar.hn.get();
        this.priceLoadingStateHolder = (uze0) zzfVar.B2.get();
        this.selectedTariffHolder = (wiq0) zzfVar.B2.get();
        this.allowBlockedZoneRepository = (ny0) c0gVar.Vg.get();
        this.experimentRepository = (f1c0) zzfVar.Rk.get();
        this.pickupFromPhotoTooltipFactory = new kpb0();
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        pv0 addressInfo = getAddressInfo();
        if (addressInfo != null) {
            getClarifyScreenAddressRepository().a = kotlin.collections.a.N0(addressInfo.a.a0());
        }
        C c = this.callback;
        if (c != 0) {
            ((si00) c).d();
            return false;
        }
        ny61.g("Required value was null.");
        return false;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        c01 c01Var = this.addressMapPickerClarificationRouterWrapper;
        if (c01Var != null) {
            c01Var.i();
        }
        this.addressMapPickerClarificationRouterWrapper = null;
        getBlockedZonesOverlay().Jg();
        gpb0 gpb0Var = this.pickupFromPhotoTooltipContainer;
        if (gpb0Var != null) {
            ((dt20) gpb0Var).c();
        }
        this.pickupFromPhotoTooltipContainer = null;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public void onDismissingStart() {
        this.serviceModeSubscription.cancel();
        super.onDismissingStart();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean onMapTapped(zzs geoPoint, qx0 callback) {
        wpb0 h;
        if (geoPoint != null && (h = getPickupHelper().h(getMapController(), geoPoint, true)) != null) {
            faq0 selectAddressAnalytics = getSelectAddressAnalytics();
            EditPointOnMapAnalytics$PointTypeV2 pointTypeForAnalytics = pointTypeForAnalytics();
            EditPointOnMapAnalytics$ScreenV2 screenForAnalytics = screenForAnalytics();
            selectAddressAnalytics.getClass();
            EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV2 = EditPointOnMapAnalytics$ActionV2.PickupPointTap;
            zzs zzsVar = h.b;
            selectAddressAnalytics.c(editPointOnMapAnalytics$ActionV2, zzsVar.a, zzsVar.b, pointTypeForAnalytics, screenForAnalytics, h.a);
        }
        return super.onMapTapped(geoPoint, callback);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((gh00) getMapController()).u(this.cameraListener);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((gh00) getMapController()).e(this.cameraListener);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void onUnsupportedTaxiAddress(Address address, NearestZoneResponse responseForAddress) {
        String providerUnsupportedAddressTitle = responseForAddress == null ? providerUnsupportedAddressTitle(address.q0()) : responseForAddress.a();
        String str = responseForAddress != null ? responseForAddress.e : null;
        String b = responseForAddress == null ? "" : responseForAddress.b();
        String c = responseForAddress != null ? responseForAddress.c() : "";
        zwx0 taxiNearestZoneErrorModalViewFactory = getTaxiNearestZoneErrorModalViewFactory();
        a01 a01Var = new a01(this, 1);
        hc hcVar = new hc(8, this, b);
        me0 me0Var = (me0) taxiNearestZoneErrorModalViewFactory;
        me0Var.getClass();
        TaxiNearestZoneErrorModalView taxiNearestZoneErrorModalView = new TaxiNearestZoneErrorModalView(me0Var.a, a01Var, hcVar, providerUnsupportedAddressTitle, str, c, null);
        this.unsupportedAddressModalView = taxiNearestZoneErrorModalView;
        modalViewCoordinator().s(taxiNearestZoneErrorModalView, false);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        g18 bwiVar;
        super.onViewCreated(view, savedInstanceState);
        AddressInputComponent addressInitialPointComponent = getAddressInitialPointComponent();
        if (addressInitialPointComponent == null) {
            ny61.g("Required value was null.");
            return;
        }
        addressInitialPointComponent.setMode(AddressInputComponent.Mode.VIEW);
        int i = 0;
        addressInitialPointComponent.setComponentEnabled(false);
        addressInitialPointComponent.setHint(kyh0.select_address_to);
        addressInitialPointComponent.setImportantForAccessibility(1);
        androidx.core.view.b.p(addressInitialPointComponent, new ei(2));
        View findViewById = findViewById(udh0.map_hint);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        cwi cwiVar = (cwi) getDeliveryZoneModeInterceptor();
        if (jl40.l(getZoneMode(), TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
            cwiVar.b();
            bwiVar = new bwi(i, cwiVar);
        } else {
            cwiVar.getClass();
            bwiVar = onViewCreated$lambda$0(this);
        }
        this.serviceModeSubscription = bwiVar;
        Origin origin = this.origin;
        if ((origin == Origin.SUGGEST || origin == Origin.MENU) && this.pointType == PointType.SOURCE) {
            c01 c01Var = new c01((ty0) getAddressMapPickerClarificationRouterProvider().get(), new a01(this, i));
            this.addressMapPickerClarificationRouterWrapper = c01Var;
            ((pep0) getScreenStackNavigator()).f(c01Var, this.addressMapPickerClarificationPayload, hxx.a);
        }
        addressInitialPointComponent.setLeadImage(getDrawableFactory().a((this.pointType == PointType.SOURCE ? ((f) getPinStyleProvider()).b(true) : ((f) getPinStyleProvider()).b(false)).a));
        ListItemComponent listItemComponent = this.addressTitleItem;
        if (listItemComponent != null) {
            ip11 typefaceDelegate = getTypefaceDelegate();
            requireContext();
            listItemComponent.setTitleTypeface(((zmh) typefaceDelegate).d());
        }
        if (blockedZonesEnabled()) {
            b blockedZonesOverlay = getBlockedZonesOverlay();
            blockedZonesOverlay.x.b();
            blockedZonesOverlay.z.i(true);
        }
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public RoutePointType pointType() {
        int i = e01.a[addressPointType().ordinal()];
        if (i == 1) {
            return RoutePointType.POINT_A;
        }
        if (i == 2) {
            return RoutePointType.POINT_B;
        }
        w511.b();
        return null;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean reactOnUnsupportedAddress() {
        return this.pointType == PointType.SOURCE;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AbstractAddressMapPickerFragment, ru.yandex.taxi.fragment.preorder.AddressMapFragment, defpackage.iy0
    public void renderUiState(a41 uiState) {
        super.renderUiState(uiState);
        renderPickupFromPhotoButton(uiState.g);
    }

    public final void setAddressMapPickerClarificationRouterProvider(yvf0 yvf0Var) {
        this.addressMapPickerClarificationRouterProvider = yvf0Var;
    }

    public final void setAllowBlockedZoneRepository(ny0 ny0Var) {
        this.allowBlockedZoneRepository = ny0Var;
    }

    public final void setBlockedZonesOverlay(b bVar) {
        this.blockedZonesOverlay = bVar;
    }

    public final void setClarifyScreenAddressRepository(jzb jzbVar) {
        this.clarifyScreenAddressRepository = jzbVar;
    }

    public final void setDeliveryZoneModeInterceptor(awi awiVar) {
        this.deliveryZoneModeInterceptor = awiVar;
    }

    public final void setDrawableFactory(zzi zziVar) {
        this.drawableFactory = zziVar;
    }

    public final void setExperimentRepository(f1c0 f1c0Var) {
        this.experimentRepository = f1c0Var;
    }

    public final void setModeRepository(fif fifVar) {
        this.modeRepository = fifVar;
    }

    public final void setNavigator(m11 navigator) {
        this.navigator = navigator;
    }

    public final void setPickupFromPhotoTooltipFactory(jpb0 jpb0Var) {
        this.pickupFromPhotoTooltipFactory = jpb0Var;
    }

    public final void setPickupHelper(a aVar) {
        this.pickupHelper = aVar;
    }

    public final void setPriceLoadingStateHolder(uze0 uze0Var) {
        this.priceLoadingStateHolder = uze0Var;
    }

    public final void setSelectAddressAnalytics(faq0 faq0Var) {
        this.selectAddressAnalytics = faq0Var;
    }

    public final void setSelectedTariffHolder(wiq0 wiq0Var) {
        this.selectedTariffHolder = wiq0Var;
    }

    public final void setTaxiNearestZoneErrorModalViewFactory(zwx0 zwx0Var) {
        this.taxiNearestZoneErrorModalViewFactory = zwx0Var;
    }

    public final void setTypefaceDelegate(ip11 ip11Var) {
        this.typefaceDelegate = ip11Var;
    }

    public final void setUriRouter(lg21 lg21Var) {
        this.uriRouter = lg21Var;
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public b1c0 setupPinV2DataRepository() {
        return requireArguments().getBoolean(ARG_SHOULD_SHOW_ETA_IN_PIN, false) ? new e(addressPointType(), getPinStyleMapper(), getSelectedTariffHolder(), getExperimentRepository(), getPriceLoadingStateHolder(), getAddressResolveRepository(), getPinAlertAnimationInteractor()) : super.setupPinV2DataRepository();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldCacheAddressByLocationTap() {
        return this.pointType == PointType.SOURCE && kotlin.collections.a.G(scc.g(Origin.ORDER, Origin.MENU, Origin.SUGGEST, Origin.INTERCITY), this.origin);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldDrawPickupPoints() {
        return this.shouldDrawPickupPoints && super.shouldDrawPickupPoints();
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public boolean shouldShowStateBarMessage() {
        return this.origin != Origin.NAVIGATOR && requireArguments().getBoolean(ARG_SHOULD_SHOW_STATE_BAR_MESSAGE, true);
    }

    @Override // defpackage.l56
    public /* bridge */ void showBlockedZones() {
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void showControls() {
        NearestZoneErrorModalView nearestZoneErrorModalView = this.unsupportedAddressModalView;
        if (nearestZoneErrorModalView == null || getBottomButtonsLayout() == null || !nearestZoneErrorModalView.isShown()) {
            super.showControls();
        } else {
            View bottomButtonsLayout = getBottomButtonsLayout();
            if (bottomButtonsLayout != null) {
                bottomButtonsLayout.setVisibility(8);
            }
        }
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        floatButtonIconComponent.getClass();
        cma1.b(1.0f, floatButtonIconComponent);
    }

    @Override // ru.yandex.taxi.fragment.preorder.AddressMapFragment
    public void unbindViewsInFields() {
        super.unbindViewsInFields();
        FloatButtonIconComponent floatButtonIconComponent = this.backButton;
        if (floatButtonIconComponent != null) {
            floatButtonIconComponent.setDebounceClickListener(null);
        }
        this.backButton = null;
        this.addressTitleItem = null;
    }

    @Override // defpackage.l56
    public void updateBlockedZones(List<d56> presentationModels) {
        getBlockedZonesOverlay().Mg(presentationModels);
    }

    public static final AddressMapPickerFragment newInstance(int i, PointType pointType, String str, Origin origin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        Companion.getClass();
        return d01.a(i, pointType, str, origin, z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }
}
