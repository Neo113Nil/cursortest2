package com.google.android.gms.maps;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.credentials.CredentialManager$createCredential$2$callback$1;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzam;
import com.google.android.gms.internal.maps.zzap;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzv;
import com.google.android.gms.internal.maps.zzy;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.compose.CameraMoveStartedReason;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.DefaultIndoorStateChangeListener;
import com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1;
import com.google.maps.android.compose.InputHandlerNode;
import com.google.maps.android.compose.MapApplier$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda1;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda2;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda3;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda4;
import com.google.maps.android.compose.MapClickListenersKt$$ExternalSyntheticLambda5;
import com.google.maps.android.compose.MapClickListenersKt$MapClickListenerUpdater$1$2$2;
import com.google.maps.android.compose.MapNode;
import com.google.maps.android.compose.MapPropertiesNode;
import com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapPropertiesNode$$ExternalSyntheticLambda1;
import com.google.maps.android.compose.MarkerNode;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes4.dex */
public final class zza extends zzb {
    public final /* synthetic */ int $r8$classId = 2;
    public final Object zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0) {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener", 0);
        this.zza = mapApplier$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.$r8$classId;
        zzg zzgVar = null;
        CameraMoveStartedReason cameraMoveStartedReason = null;
        zzap zzapVar = null;
        zzam zzamVar = null;
        zzl zzlVar = null;
        zzv zzvVar = null;
        zzy zzyVar = null;
        int i3 = 0;
        Object obj = this.zza;
        switch (i2) {
            case 0:
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    boolean onMarkerClick = ((GoogleMap.OnMarkerClickListener) obj).onMarkerClick(new Marker(zzb));
                    parcel2.writeNoException();
                    parcel2.writeInt(onMarkerClick ? 1 : 0);
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    LatLng latLng = (LatLng) zzc.zza(parcel, LatLng.CREATOR);
                    zzc.zzd(parcel);
                    CameraWrapper.i iVar = ((MapClickListenersKt$$ExternalSyntheticLambda1) obj).f$0;
                    latLng.getClass();
                    Function1 function1 = (Function1) iVar.get();
                    if (function1 != null) {
                        function1.invoke(latLng);
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1 = (CredentialManager$createCredential$2$callback$1) obj;
                if (i == 1) {
                    CancellableContinuationImpl cancellableContinuationImpl = credentialManager$createCredential$2$callback$1.$continuation;
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                } else if (i == 2) {
                    CancellableContinuationImpl cancellableContinuationImpl2 = credentialManager$createCredential$2$callback$1.$continuation;
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl2.resumeWith(new Result.Failure(new CancellationException("Animation cancelled")));
                }
                parcel2.writeNoException();
                break;
            case 3:
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        zzgVar = queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(readStrongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    GoogleMap googleMap = new GoogleMap(zzgVar);
                    GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 = (GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1) obj;
                    googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1.getClass();
                    SafeContinuation safeContinuation = googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1.$continuation;
                    Result.Companion companion3 = Result.Companion;
                    safeContinuation.resumeWith(googleMap);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                GoogleMap.OnMarkerDragListener onMarkerDragListener = (GoogleMap.OnMarkerDragListener) obj;
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    onMarkerDragListener.onMarkerDragStart(new Marker(zzb2));
                } else if (i == 2) {
                    com.google.android.gms.internal.maps.zzaj zzb3 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    onMarkerDragListener.onMarkerDrag(new Marker(zzb3));
                } else if (i == 3) {
                    com.google.android.gms.internal.maps.zzaj zzb4 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    onMarkerDragListener.onMarkerDragEnd(new Marker(zzb4));
                }
                parcel2.writeNoException();
                break;
            case 5:
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb5 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    ((GoogleMap.OnInfoWindowClickListener) obj).onInfoWindowClick(new Marker(zzb5));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 6:
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb6 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    ((GoogleMap.OnInfoWindowLongClickListener) obj).onInfoWindowLongClick(new Marker(zzb6));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 7:
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb7 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    Marker marker = new Marker(zzb7);
                    Iterator it = ((MapApplier$$ExternalSyntheticLambda0) obj).f$0.decorations.iterator();
                    while (it.hasNext()) {
                        MapNode mapNode = (MapNode) it.next();
                        if (mapNode instanceof MarkerNode) {
                            MarkerNode markerNode = (MarkerNode) mapNode;
                            if (markerNode.marker.equals(marker)) {
                                Function1 function12 = markerNode.onInfoWindowClose;
                                if (function12 != null ? Intrinsics.areEqual(function12.invoke(marker), Boolean.TRUE) : false) {
                                    parcel2.writeNoException();
                                    break;
                                }
                            }
                        }
                        if (mapNode instanceof InputHandlerNode) {
                            Function1 function13 = (Function1) ((InputHandlerNode) mapNode).onInfoWindowClose$delegate.getValue();
                            if (function13 != null ? Intrinsics.areEqual(function13.invoke(marker), Boolean.TRUE) : false) {
                                parcel2.writeNoException();
                            }
                        } else {
                            continue;
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 8:
                GoogleMap.InfoWindowAdapter infoWindowAdapter = (GoogleMap.InfoWindowAdapter) obj;
                if (i == 1) {
                    com.google.android.gms.internal.maps.zzaj zzb8 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    ObjectWrapper objectWrapper = new ObjectWrapper(infoWindowAdapter.getInfoWindow(new Marker(zzb8)));
                    parcel2.writeNoException();
                    zzc.zzg(parcel2, objectWrapper);
                } else if (i == 2) {
                    com.google.android.gms.internal.maps.zzaj zzb9 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
                    zzc.zzd(parcel);
                    ObjectWrapper objectWrapper2 = new ObjectWrapper(infoWindowAdapter.getInfoContents(new Marker(zzb9)));
                    parcel2.writeNoException();
                    zzc.zzg(parcel2, objectWrapper2);
                }
                break;
            case 9:
                if (i == 1) {
                    Function0 function0 = (Function0) ((MapClickListenersKt$$ExternalSyntheticLambda3) obj).f$0.get();
                    int booleanValue = function0 != null ? ((Boolean) function0.invoke()).booleanValue() : 0;
                    parcel2.writeNoException();
                    int i4 = zzc.$r8$clinit;
                    parcel2.writeInt(booleanValue);
                    break;
                }
                break;
            case 10:
                if (i == 1) {
                    Location location = (Location) zzc.zza(parcel, Location.CREATOR);
                    zzc.zzd(parcel);
                    CameraWrapper.i iVar2 = ((MapClickListenersKt$$ExternalSyntheticLambda4) obj).f$0;
                    location.getClass();
                    Function1 function14 = (Function1) iVar2.get();
                    if (function14 != null) {
                        function14.invoke(location);
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 11:
                if (i == 1) {
                    Function0 function02 = (Function0) ((MapClickListenersKt$$ExternalSyntheticLambda2) obj).f$0.get();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 12:
                MapClickListenersKt$MapClickListenerUpdater$1$2$2 mapClickListenersKt$MapClickListenerUpdater$1$2$2 = (MapClickListenersKt$MapClickListenerUpdater$1$2$2) obj;
                if (i == 1) {
                    ((DefaultIndoorStateChangeListener) mapClickListenersKt$MapClickListenerUpdater$1$2$2.$callback.get()).getClass();
                } else if (i == 2) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
                        zzyVar = queryLocalInterface2 instanceof zzy ? (zzy) queryLocalInterface2 : new zzy(readStrongBinder2, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    zzae.checkNotNull(zzyVar, "delegate");
                    mapClickListenersKt$MapClickListenerUpdater$1$2$2.getClass();
                    ((DefaultIndoorStateChangeListener) mapClickListenersKt$MapClickListenerUpdater$1$2$2.$callback.get()).getClass();
                }
                parcel2.writeNoException();
                break;
            case 13:
                if (i == 1) {
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                        zzvVar = queryLocalInterface3 instanceof zzv ? (zzv) queryLocalInterface3 : new zzv(readStrongBinder3, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    GroundOverlay groundOverlay = new GroundOverlay(zzvVar);
                    Iterator it2 = ((MapApplier$$ExternalSyntheticLambda0) obj).f$0.decorations.iterator();
                    while (it2.hasNext()) {
                        MapNode mapNode2 = (MapNode) it2.next();
                        if (mapNode2 instanceof InputHandlerNode) {
                            Function1 function15 = (Function1) ((InputHandlerNode) mapNode2).onGroundOverlayClick$delegate.getValue();
                            if (function15 != null ? Intrinsics.areEqual(function15.invoke(groundOverlay), Boolean.TRUE) : false) {
                                parcel2.writeNoException();
                                break;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 14:
                if (i == 1) {
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                        zzlVar = queryLocalInterface4 instanceof zzl ? (zzl) queryLocalInterface4 : new zzl(readStrongBinder4, "com.google.android.gms.maps.model.internal.ICircleDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    Circle circle = new Circle(zzlVar);
                    Iterator it3 = ((MapApplier$$ExternalSyntheticLambda0) obj).f$0.decorations.iterator();
                    while (it3.hasNext()) {
                        MapNode mapNode3 = (MapNode) it3.next();
                        if (mapNode3 instanceof InputHandlerNode) {
                            Function1 function16 = (Function1) ((InputHandlerNode) mapNode3).onCircleClick$delegate.getValue();
                            if (function16 != null ? Intrinsics.areEqual(function16.invoke(circle), Boolean.TRUE) : false) {
                                parcel2.writeNoException();
                                break;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 15:
                if (i == 1) {
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                        zzamVar = queryLocalInterface5 instanceof zzam ? (zzam) queryLocalInterface5 : new zzam(readStrongBinder5, "com.google.android.gms.maps.model.internal.IPolygonDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    Polygon polygon = new Polygon(zzamVar);
                    Iterator it4 = ((MapApplier$$ExternalSyntheticLambda0) obj).f$0.decorations.iterator();
                    while (it4.hasNext()) {
                        MapNode mapNode4 = (MapNode) it4.next();
                        if (mapNode4 instanceof InputHandlerNode) {
                            Function1 function17 = (Function1) ((InputHandlerNode) mapNode4).onPolygonClick$delegate.getValue();
                            if (function17 != null ? Intrinsics.areEqual(function17.invoke(polygon), Boolean.TRUE) : false) {
                                parcel2.writeNoException();
                                break;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 16:
                if (i == 1) {
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                        zzapVar = queryLocalInterface6 instanceof zzap ? (zzap) queryLocalInterface6 : new zzap(readStrongBinder6, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 4);
                    }
                    zzc.zzd(parcel);
                    Polyline polyline = new Polyline(zzapVar);
                    Iterator it5 = ((MapApplier$$ExternalSyntheticLambda0) obj).f$0.decorations.iterator();
                    while (it5.hasNext()) {
                        MapNode mapNode5 = (MapNode) it5.next();
                        if (mapNode5 instanceof InputHandlerNode) {
                            Function1 function18 = (Function1) ((InputHandlerNode) mapNode5).onPolylineClick$delegate.getValue();
                            if (function18 != null ? Intrinsics.areEqual(function18.invoke(polyline), Boolean.TRUE) : false) {
                                parcel2.writeNoException();
                                break;
                            }
                        }
                    }
                    parcel2.writeNoException();
                }
                break;
            case 17:
                if (i == 1) {
                    PointOfInterest pointOfInterest = (PointOfInterest) zzc.zza(parcel, PointOfInterest.CREATOR);
                    zzc.zzd(parcel);
                    CameraWrapper.i iVar3 = ((MapClickListenersKt$$ExternalSyntheticLambda5) obj).f$0;
                    pointOfInterest.getClass();
                    Function1 function19 = (Function1) iVar3.get();
                    if (function19 != null) {
                        function19.invoke(pointOfInterest);
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 18:
                if (i == 1) {
                    int readInt = parcel.readInt();
                    zzc.zzd(parcel);
                    MapPropertiesNode mapPropertiesNode = ((MapPropertiesNode$$ExternalSyntheticLambda1) obj).f$0;
                    CameraPositionState cameraPositionState = mapPropertiesNode.cameraPositionState;
                    CameraMoveStartedReason.Companion.getClass();
                    CameraMoveStartedReason[] values = CameraMoveStartedReason.values();
                    int length = values.length;
                    while (true) {
                        if (i3 < length) {
                            CameraMoveStartedReason cameraMoveStartedReason2 = values[i3];
                            if (cameraMoveStartedReason2.value == readInt) {
                                cameraMoveStartedReason = cameraMoveStartedReason2;
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (cameraMoveStartedReason == null) {
                        cameraMoveStartedReason = CameraMoveStartedReason.UNKNOWN;
                    }
                    cameraPositionState.getClass();
                    cameraPositionState.cameraMoveStartedReason$delegate.setValue(cameraMoveStartedReason);
                    mapPropertiesNode.cameraPositionState.isMoving$delegate.setValue(Boolean.TRUE);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 19:
                if (i == 1) {
                    MapPropertiesNode mapPropertiesNode2 = ((MapPropertiesNode$$ExternalSyntheticLambda1) obj).f$0;
                    CameraPositionState cameraPositionState2 = mapPropertiesNode2.cameraPositionState;
                    CameraPosition cameraPosition = mapPropertiesNode2.map.getCameraPosition();
                    cameraPosition.getClass();
                    cameraPositionState2.getClass();
                    cameraPositionState2.rawPosition$delegate.setValue(cameraPosition);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 20:
                if (i == 1) {
                    ((MapPropertiesNode$$ExternalSyntheticLambda1) obj).f$0.cameraPositionState.isMoving$delegate.setValue(Boolean.FALSE);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 21:
                if (i == 1) {
                    ((MapPropertiesNode$$ExternalSyntheticLambda0) obj).onCameraIdle();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    LatLng latLng2 = (LatLng) zzc.zza(parcel, LatLng.CREATOR);
                    zzc.zzd(parcel);
                    CameraWrapper.i iVar4 = ((MapClickListenersKt$$ExternalSyntheticLambda0) obj).f$0;
                    latLng2.getClass();
                    Function1 function110 = (Function1) iVar4.get();
                    if (function110 != null) {
                        function110.invoke(latLng2);
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter", 0);
        this.zza = infoWindowAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener", 0);
        this.zza = onInfoWindowClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener", 0);
        this.zza = onInfoWindowLongClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 0);
        this.zza = onMarkerClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener", 0);
        this.zza = onMarkerDragListener;
    }

    public zza(CredentialManager$createCredential$2$callback$1 credentialManager$createCredential$2$callback$1) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 0);
        this.zza = credentialManager$createCredential$2$callback$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0, byte b) {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener", 0);
        this.zza = mapApplier$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0, char c) {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener", 0);
        this.zza = mapApplier$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0, int i) {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener", 0);
        this.zza = mapApplier$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapApplier$$ExternalSyntheticLambda0 mapApplier$$ExternalSyntheticLambda0, short s) {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener", 0);
        this.zza = mapApplier$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda0 mapClickListenersKt$$ExternalSyntheticLambda0) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda1 mapClickListenersKt$$ExternalSyntheticLambda1) {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda1;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda2 mapClickListenersKt$$ExternalSyntheticLambda2) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda2;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda3 mapClickListenersKt$$ExternalSyntheticLambda3) {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda3;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda4 mapClickListenersKt$$ExternalSyntheticLambda4) {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda4;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$$ExternalSyntheticLambda5 mapClickListenersKt$$ExternalSyntheticLambda5) {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener", 0);
        this.zza = mapClickListenersKt$$ExternalSyntheticLambda5;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapClickListenersKt$MapClickListenerUpdater$1$2$2 mapClickListenersKt$MapClickListenerUpdater$1$2$2) {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener", 0);
        this.zza = mapClickListenersKt$MapClickListenerUpdater$1$2$2;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapPropertiesNode$$ExternalSyntheticLambda0 mapPropertiesNode$$ExternalSyntheticLambda0) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 0);
        this.zza = mapPropertiesNode$$ExternalSyntheticLambda0;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapPropertiesNode$$ExternalSyntheticLambda1 mapPropertiesNode$$ExternalSyntheticLambda1) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener", 0);
        this.zza = mapPropertiesNode$$ExternalSyntheticLambda1;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapPropertiesNode$$ExternalSyntheticLambda1 mapPropertiesNode$$ExternalSyntheticLambda1, byte b) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 0);
        this.zza = mapPropertiesNode$$ExternalSyntheticLambda1;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(GoogleMap googleMap, MapPropertiesNode$$ExternalSyntheticLambda1 mapPropertiesNode$$ExternalSyntheticLambda1, char c) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 0);
        this.zza = mapPropertiesNode$$ExternalSyntheticLambda1;
        Objects.requireNonNull(googleMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zzah zzahVar, GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1 googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 0);
        this.zza = googleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1;
    }
}
