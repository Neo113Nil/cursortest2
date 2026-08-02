package com.fidesmo.sec.nfc;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.nfc.NfcDevice;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0019H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/nfc/NfcDevicesManager;", "Lcom/fidesmo/sec/nfc/NfcDevice$ErrorListener;", "()V", "deviceListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/fidesmo/sec/nfc/DeviceListener;", "tag", "", "addDeviceListener", "", "listener", BreadcrumbHelper.Category.ERROR, "device", "Lcom/fidesmo/sec/devices/Device;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fireNfcDeviceFound", "Lcom/fidesmo/sec/nfc/NfcDevice;", "removeDeviceListener", "startNfcDiscovery", "activity", "Landroid/app/Activity;", "stopNfcDiscovery", "tagDiscovered", "Landroid/nfc/Tag;", "sec-client-nfc_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NfcDevicesManager implements NfcDevice.ErrorListener {
    private final String tag = "NfcManager";
    private final CopyOnWriteArrayList<DeviceListener> deviceListeners = new CopyOnWriteArrayList<>();

    private final void fireNfcDeviceFound(NfcDevice device) {
        Log.d(this.tag, "New device found: " + device);
        Iterator<DeviceListener> it = this.deviceListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeviceConnected(device);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startNfcDiscovery$lambda$0(NfcDevicesManager nfcDevicesManager, Tag tag) {
        nfcDevicesManager.getClass();
        tag.getClass();
        nfcDevicesManager.tagDiscovered(tag);
    }

    private final void tagDiscovered(Tag tag) {
        try {
            NfcDevice nfcDevice = new NfcDevice(tag);
            nfcDevice.addErrorListener(this);
            fireNfcDeviceFound(nfcDevice);
        } catch (IOException e) {
            Log.d(this.tag, "Error reading device tag: " + e);
        }
    }

    public final void addDeviceListener(DeviceListener listener) {
        listener.getClass();
        this.deviceListeners.add(listener);
    }

    @Override // com.fidesmo.sec.nfc.NfcDevice.ErrorListener
    public void error(Device device, Exception exception) {
        device.getClass();
        exception.getClass();
        Log.d(this.tag, "Device connection lost");
        Iterator<DeviceListener> it = this.deviceListeners.iterator();
        while (it.hasNext()) {
            it.next().onDeviceDisconnected(device);
        }
    }

    public final void removeDeviceListener(DeviceListener listener) {
        listener.getClass();
        this.deviceListeners.remove(listener);
    }

    public final void startNfcDiscovery(Activity activity) {
        activity.getClass();
        Log.i(this.tag, "NFC discovery is on");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("presence", IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
        defaultAdapter.enableReaderMode(activity, new NfcAdapter.ReaderCallback() { // from class: com.fidesmo.sec.nfc.NfcDevicesManager$$ExternalSyntheticLambda0
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                NfcDevicesManager.startNfcDiscovery$lambda$0(NfcDevicesManager.this, tag);
            }
        }, 387, bundle);
    }

    public final void stopNfcDiscovery(Activity activity) {
        activity.getClass();
        Log.i(this.tag, "NFC discovery is off");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(activity);
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return;
        }
        defaultAdapter.disableReaderMode(activity);
    }
}
