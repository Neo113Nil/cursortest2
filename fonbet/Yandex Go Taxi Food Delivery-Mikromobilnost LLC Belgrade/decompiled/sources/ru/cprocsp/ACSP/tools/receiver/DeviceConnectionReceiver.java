package ru.cprocsp.ACSP.tools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.os.Handler;
import java.util.Arrays;
import java.util.List;
import ru.CryptoPro.JCSP.tools.common.window.DialogConstants;

/* loaded from: classes4.dex */
public class DeviceConnectionReceiver extends BroadcastReceiver implements DialogConstants {
    private final Handler handler;
    private final DeviceStateUpdater owner;
    public static final List<String> DEVICE_ACTION_BLT = Arrays.asList("android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.ACL_CONNECTED", "android.bluetooth.device.action.FOUND", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED");
    public static final String DEVICE_ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final List<String> DEVICE_ACTION_USB = Arrays.asList(DEVICE_ACTION_USB_STATE, "android.hardware.usb.action.USB_DEVICE_ATTACHED", "android.hardware.usb.action.USB_ACCESSORY_ATTACHED");

    public enum Devices {
        Bluetooth,
        USB
    }

    public DeviceConnectionReceiver(DeviceStateUpdater deviceStateUpdater, Handler handler) {
        this.owner = deviceStateUpdater;
        this.handler = handler;
    }

    private void sendMessage(final Devices devices) {
        this.handler.post(new Runnable() { // from class: ru.cprocsp.ACSP.tools.receiver.DeviceConnectionReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                DeviceConnectionReceiver.this.owner.update(devices);
            }
        });
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action) || "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action)) {
            sendMessage(Devices.Bluetooth);
            return;
        }
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 11 || intExtra == 12) {
                sendMessage(Devices.Bluetooth);
                return;
            }
            return;
        }
        if (DEVICE_ACTION_USB.contains(action)) {
            boolean booleanExtra = intent.getBooleanExtra("adb", false);
            boolean booleanExtra2 = intent.getBooleanExtra("connected", false);
            boolean z = ((UsbDevice) intent.getParcelableExtra("device")) != null;
            if ((booleanExtra2 || z) && !booleanExtra) {
                sendMessage(Devices.USB);
            }
        }
    }
}
